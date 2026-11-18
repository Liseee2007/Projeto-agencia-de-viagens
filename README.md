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
  - Registro e eliminação de passageiros e destinos.

## ✿ Como Baixar e Abrir o Projeto

Não é necessário instalar MySQL ou configurar servidor externo, pois o banco de dados **H2** já sobe automaticamente em memória junto com o sistema.

### 1. Baixar o código
- **Pelo navegador (mais fácil):** Clique no botão verde **`<> Code`** no topo desta página e selecione **Download ZIP**. Depois, extraia a pasta no seu computador.
- **Via Git (terminal):**
  ```bash
  git clone [https://github.com/Liseee2007/Projeto-agencia-de-viagens.git](https://github.com/Liseee2007/Projeto-agencia-de-viagens.git)
  ```

### 2. Abrir e rodar no Eclipse
1. Abra o **Eclipse IDE**.
2. Vá no menu **File** > **Import...** > **Maven** > **Existing Maven Projects** e clique em **Next**.
3. Clique em **Browse...**, selecione a pasta do projeto extraída e clique em **Finish**.
4. Aguarde o Maven baixar as dependências (canto inferior direito).
5. Abra o arquivo `src/main/java/ra/Principal.java`, clique com o botão direito no código e escolha **Run As** > **Java Application**.

### 3. Acessar no navegador
Com o projeto rodando no Eclipse, abra um dos links abaixo no seu navegador:

- **Site Principal (Agência):** `http://localhost:8080`
- **Documentação da API (Swagger):** `http://localhost:8080/swagger-ui.html`
- **Banco de Dados (Console H2):** `http://localhost:8080/h2-console`
  - **JDBC URL:** `jdbc:h2:mem:ReservasViagens`
  - **User Name:** `sa`
  - **Password:** *(deixe em branco)*

## ✿ Desenvolvido por

- **Anelise Lemes**
- **Ana Vitória**
- **Letícia**
