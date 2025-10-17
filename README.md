# 🧠 Dojo: Criação de uma API de Conversão de Texto em Voz (Text-to-Speech) com Spring Boot e Spring AI

Nesse dojo, **Anderson nos mostrou** como desenvolver uma **API Java moderna** capaz de converter **texto em voz** utilizando **Inteligência Artificial**, através do modelo **Text-to-Speech (TTS)** do **OpenAI**, integrado com o **Spring AI**.  

Durante o processo, exploramos desde a **configuração do ambiente**, passando pelo **desenvolvimento da API**, até o uso de **parâmetros avançados de voz**, resultando em um sistema totalmente funcional, flexível e pronto para ser integrado em aplicações reais.

---

## 🚀 Visão Geral do Projeto

Este projeto implementa uma **API REST** em **Spring Boot** que recebe um texto e retorna um arquivo de áudio gerado por IA, simulando uma voz humana natural.  
A aplicação utiliza o **Spring AI** — biblioteca oficial da Spring que facilita a integração com modelos de IA — e o **serviço de TTS da OpenAI**.

### ✨ Funcionalidades Principais

- Conversão de texto em voz de forma natural e personalizada.  
- Suporte a múltiplos formatos de saída: **MP3**, **WAV**, **OGG**.  
- Controle sobre **velocidade da fala**, **modelo de TTS** e **voz utilizada**.  
- Endpoint REST simples e acessível via navegador ou ferramentas como **Postman** e **cURL**.  
- Implementação enxuta: apenas um **Controller**, sem camadas adicionais.  

---

## ✅ Aprendizados do Dojo

### 🧩 1. Introdução ao Text-to-Speech (TTS)

- Compreendemos os fundamentos da tecnologia TTS e como ela converte texto em fala.  
- Exploramos os diferentes **modelos de voz**, **formatos de áudio** e **aplicações reais**, como:
  - Assistentes virtuais e chatbots;
  - Leitura automática de textos, artigos e mensagens;
  - Geração de narrações para vídeos e podcasts;
  - Acessibilidade digital para pessoas com deficiência visual.

---

### ⚙️ 2. Configuração do Ambiente de Desenvolvimento

- **Linguagem:** Java 17+  
- **Framework:** Spring Boot 3.3.x  
- **Gerenciador de Dependências:** Gradle  
- **Dependência principal:**
  ```groovy
  implementation 'org.springframework.ai:spring-ai-starter-model-openai:1.0.3'
