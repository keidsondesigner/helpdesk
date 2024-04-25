# Projeto Spring Boot com Java 17


**Descrição**:
Este projeto é uma aplicação Spring Boot desenvolvida com Java 17. Ela fornece uma API RESTful para gerenciar Tickets(Chamados).

# Tecnologias Utilizadas
- Spring Boot: Framework para desenvolvimento rápido e simplificado de aplicações Java.

- Java 17: A versão mais recente da linguagem Java, oferecendo recursos de produtividade e desempenho aprimorados.

- Spring Web: Módulo do Spring Framework para desenvolvimento de APIs RESTful.

- Spring DevTools: Fornece reinicialização dinâmica de código e atualização automática do navegador, facilitando o desenvolvimento.

- Lombok: Simplifica o código Java eliminando a necessidade de boilerplate para getters, setters, equals, toString, etc.

- Spring Data JPA: Abstrai o acesso ao banco de dados relacional PostgreSQL, permitindo interações com entidades usando JPA.

- PostgreSQL Driver: Driver JDBC para conectar ao banco de dados PostgreSQL.

- Hibernate Validator: Fornece validação de dados para entidades usando anotações do Bean Validation API.



# A API expõe os seguintes endpoints para gerenciar os tickets(chamados):


**POST** http://localhost:8080/tickets Cria um novo ticket. O corpo da requisição deve conter um objeto TicketEntity válido.

**PUT** http://localhost:8080/tickets Atualiza um ticket existente. O corpo da requisição deve conter um objeto TicketEntity válido.

**GET** http://localhost:8080/tickets/{id} Recupera um ticket pelo seu identificador (ID).

**GET** http://localhost:8080/tickets Recupera uma lista de todos os tickets.

**GET** http://localhost:8080/tickets/busca?titulo={titulo} Recupera um ticket pelo seu titulo (parâmetro de consulta titulo).

**DELETE** http://localhost:8080/tickets/{id} Deleta um ticket pelo seu identificador (ID).



# Execução de uso dos endpoints:

>Criando um Ticket (POST /tickets):

Método HTTP: POST
URL: http://localhost:8080/tickets
Corpo da Requisição:
Conteúdo: Objeto JSON representando o novo ticket.
Tipo de Conteúdo: application/json

Exemplo:

```
{
    "titulo": "Atualizar documentação",
    "descricao": "Atualizar a documentação do usuário com as últimas alterações.",
    "prioridade": "media",
    "status": "pendente"
}
```


>Atualizando um Ticket (PUT /tickets):

Método HTTP: PUT
URL: http://localhost:8080/tickets
Utilize o ID do ticket que deseja atualizar, no corpo da Requisição

Conteúdo: Objeto JSON representando o ticket atualizado.
Tipo de Conteúdo: application/json

Exemplo:

```
{
    "id": 1,
    "titulo": "Criar um novo ticket",
    "descricao": "O cliente relatou que não consegue acessar sua conta.",
    "prioridade": "alta",
    "status": "pendente",
    "createdAt": "2024-04-24T13:25:17.070679"
}
```


>Consultando um Ticket por ID (GET /tickets/{id}):

Método HTTP: GET
URL: http://localhost:8080/tickets/{id}
Substitua {id} pelo ID do ticket que deseja consultar.
Observação: Nenhum dado precisa ser enviado no corpo da requisição para essa consulta.


>Consultando Lista de Tickets (GET /tickets):

Método HTTP: GET
URL: http://localhost:8080/tickets
Observação: Nenhum dado precisa ser enviado no corpo da requisição para essa consulta.


>Consultando Ticket por Titulo (GET /tickets/busca?titulo={titulo}):

Método HTTP: GET
URL: http://localhost:8080/tickets/busca?titulo={titulo}
Substitua {titulo} pelo titulo do ticket que deseja consultar.
Observação: Nenhum dado precisa ser enviado no corpo da requisição para essa consulta.


>Deletar um Ticket por ID (DELETE /tickets/{id}):

Método HTTP: DELETE
URL: http://localhost:8080/tickets/{id}
Substitua {id} pelo ID do ticket que deseja consultar.
Observação: Nenhum dado precisa ser enviado no corpo da requisição para essa consulta.


# Execução da Aplicação
  
>Pré-requisitos:
- Java 17 instalado e configurado no PATH do sistema.
- Banco de dados PostgreSQL instalado e configurado (opcional, para persistência real).
- Configuração do Banco de Dados (Opcional):
- Edite a configuração do banco de dados (por exemplo, application.properties) para especificar os detalhes de conexão ao PostgreSQL.
- Compilação e execução:
- Execute o comando mvn clean install para compilar o projeto.
- Execute a classe principal (geralmente com.example.ProjetoApplication) usando o comando java -jar target/projeto-0.0.1-SNAPSHOT.jar.
