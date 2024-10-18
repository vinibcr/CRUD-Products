# SecondSpringCrud

Este é um projeto Java Spring que implementa uma API RESTful para gerenciar produtos. Ele permite realizar operações CRUD (Create, Read, Update, Delete) em produtos, utilizando o Spring Boot e JPA.

## Tecnologias Utilizadas

- **Java 17**
- **Spring Boot**
- **Spring Data JPA**
- **H2 Database** (banco de dados em memória)
- **Maven**

## Estrutura do Projeto

### Controllers

A classe `ProductController` é responsável por gerenciar as requisições HTTP relacionadas aos produtos. Ela expõe os seguintes endpoints:

- **GET /products**: Retorna todos os produtos.
- **GET /products/get/{id}**: Retorna um produto específico pelo ID.
- **POST /products/create**: Cria um novo produto.
- **PUT /products/update/{id}**: Atualiza um produto existente pelo ID.
- **DELETE /products/delete/{id}**: Deleta um produto pelo ID.

### Model

A classe `Product` representa a entidade produto e contém os seguintes atributos:

- `id`: Identificador único do produto (gerado automaticamente).
- `name`: Nome do produto.
- `price`: Preço do produto.

## Configuração do Banco de Dados

Este projeto utiliza o H2 como banco de dados em memória. Para acessar o console do H2, inicie o aplicativo e abra o seguinte link em seu navegador:

[H2 Console](http://localhost:8080/h2-console)

### Configurações do H2

As configurações padrão para o H2 são as seguintes:
- **JDBC URL**: `jdbc:h2:mem:testdb`
- **User Name**: `sa`
- **Password**: (deixe em branco)


