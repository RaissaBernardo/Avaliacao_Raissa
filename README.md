# Sistema de gerenciamento da biblioteca

Esse sistema foi desenvolvido para gerenciar operações de uma biblioteca. Ele foi feito do zero, sem banco de dados, utilizando o padrão MVC. 
A aplicação permite registrar empréstimos, adicionar livros a empréstimos existentes, atualizar datas e consultar informações de empréstimos.

## Como funciona o sistema?

A aplicação é **back-end** e faz uso de **endpoints**. O sistema usa Spring Boot e foi desenvolvido com a ideia de ser simples e eficiente.

## Funcionalidades

1. Registrar empréstimos: O sistema permite registrar um novo empréstimo, associando um cliente e livros.
2. Consultar empréstimos: Consultar todos os empréstimos registrados.
3. Adicionar livros a empréstimos que já existem: Permite adicionar novos livros a um empréstimo existente.
4. Atualizar a data final do empréstimo: Alterar a data final do empréstimo, caso haja necessidade.
5. Excluir empréstimo: Excluir um empréstimo já registrado.
6. Consultas por data: Filtrar empréstimos pela data final.

A aplicação é **back-end web** porque:
1. Gerencia a lógica de negócios (controle de empréstimos, registros de clientes, etc.).
2. APIs que podem ser consumidas por outras aplicações.
3. Responde a requisições HTTP com dados.

