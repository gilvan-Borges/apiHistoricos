

# API de Históricos

Este projeto é uma API para gerenciar históricos de ações realizadas em produtos. A API é construída utilizando Spring Boot e MongoDB, e se comunica com um sistema de mensageria RabbitMQ.

## Tecnologias Utilizadas

- **Java 21**: Linguagem de programação utilizada para desenvolver a aplicação.
- **Spring Boot 3.4.0**: Framework para simplificar a criação de aplicações Java.
  - **Spring Data MongoDB**: Integração com o banco de dados MongoDB.
  - **Spring Boot Starter Web**: Para criar APIs RESTful.
  - **Spring Boot Starter AMQP**: Para integração com RabbitMQ.
  - **Spring Boot Starter Validation**: Para validação de dados.
  - **Spring Boot DevTools**: Para facilitar o desenvolvimento com recarregamento automático.
- **MongoDB**: Banco de dados NoSQL utilizado para armazenar os históricos.
- **RabbitMQ**: Sistema de mensageria utilizado para comunicação entre serviços.
- **Docker**: Utilizado para containerizar a aplicação.
- **Lombok**: Biblioteca para reduzir o código boilerplate em Java.
- **Springdoc OpenAPI**: Para documentação da API.

## Estrutura do Projeto

- **src/main/java**: Contém o código fonte da aplicação.
  - **br/com/cotiinformatica**: Pacote principal da aplicação.
    - **domain/models/entities**: Contém as entidades do domínio.
    - **infrastructure/messages**: Contém os consumidores de mensagens do RabbitMQ.
    - **infrastructure/repositories**: Contém os repositórios do MongoDB.
- **src/main/resources**: Contém os arquivos de configuração.
  - **application.properties**: Configurações da aplicação.
- **Dockerfile**: Arquivo de configuração para containerização da aplicação.
- **docker-compose.yml**: Arquivo de configuração para orquestração de containers Docker.
- **pom.xml**: Arquivo de configuração do Maven.

## Como Executar

### Pré-requisitos

- Docker e Docker Compose instalados.
- Java 21 instalado.

### Passos

1. Clone o repositório:
   git clone <URL_DO_REPOSITORIO>
   cd apiHistoricos

2. Execute os containers Docker:

 docker-compose up

3. Acesse a aplicação em http://localhost:8085.

## Endpoints
A documentação completa dos endpoints pode ser acessada em http://localhost:8085/swagger-ui.html.

Contribuição
Contribuições são bem-vindas! Sinta-se à vontade para abrir issues e pull requests.
