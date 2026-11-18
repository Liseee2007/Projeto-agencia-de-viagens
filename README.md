# ✈️ RA Destinations — Sistema de Gestão & Reservas de Viagens

Aplicação web full-stack para gestão de agência de turismo, permitindo que clientes consultem pacotes, solicitem reservas e acompanhem os seus bilhetes por CPF, enquanto administradores gerem destinos, passageiros e emissões de passagens.

## ✿ Tecnologias Utilizadas

- **Back-end:** Java 17, Spring Boot 3.5, Spring Web, Spring Data JPA
- **Banco de Dados:** H2 Database (em memória, com carga inicial automática via `data.sql`)
- **Documentação da API:** SpringDoc OpenAPI (Swagger UI)
- **Front-end:** HTML5, CSS3, JavaScript (Fetch API)

## ✿ Funcionalidades

- **Área do Cliente:**
  - Vitrine de destinos nacionais e internacionais com cálculo dinâmico de diárias.
  - Solicitação de reserva para novos viajantes ou clientes já registados.
  - Consulta privada de bilhetes emitidos filtrada pelo CPF.
- **Painel Administrativo:**
  - Dashboard com indicadores de receita ativa, passagens emitidas, passageiros e destinos.
  - Emissão, confirmação e cancelamento de cartões de embarque.
  - Registo e eliminação de passageiros e destinos.

## ✿ Como Executar o Projeto

1. Clona este repositório:
   ```bash
   git clone [https://github.com/Liseee2007/Projeto-agencia-de-viagens.git](https://github.com/Liseee2007/Projeto-agencia-de-viagens.git)
