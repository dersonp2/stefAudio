package com.stef.audioTeste;

import org.springframework.ai.openai.OpenAiAudioSpeechOptions;
import org.springframework.ai.openai.api.OpenAiAudioApi;
import org.springframework.ai.openai.audio.speech.SpeechModel;
import org.springframework.ai.openai.audio.speech.SpeechPrompt;
import org.springframework.ai.openai.audio.speech.SpeechResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ContentDisposition;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/voz")
public class VozController {

    @Autowired
    SpeechModel speechModel;

    @GetMapping(value = "/gerar", produces = MediaType.APPLICATION_OCTET_STREAM_VALUE)
    public ResponseEntity<byte[]> gerarVoz(@RequestParam String texto){
        // Configuração das opções de Geração de Voz
        OpenAiAudioSpeechOptions configuracoes = OpenAiAudioSpeechOptions.builder()
                .model("tts-1")
                .voice(OpenAiAudioApi.SpeechRequest.Voice.FABLE)
                .responseFormat(OpenAiAudioApi.SpeechRequest.AudioResponseFormat.MP3)
                .speed(0.5f)
                .build();

        // Criar um Prompt
        SpeechPrompt prompt = new SpeechPrompt(texto,configuracoes);
        // Enviar o Prompt para OpenAI
        SpeechResponse resposta =  speechModel.call(prompt);
        // Variavel para armazenar o audio
        byte[] audio =  resposta.getResult().getOutput();


        // Configurar o cabeçalho para retornar Audio
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
        headers.setContentDisposition(ContentDisposition.attachment().filename("audioStef.mp3").build());

        return  new ResponseEntity<>(audio, headers, 200);


    }
}
