@cadastrar
Feature: Customer

Como usuario
Quero enviar os dados via formulario
Paracadastrar um novo customer

Scenario: Cadastrar customer

Given que selecione Bootstrap v4
And acessar o formulario
When enviar o formulario
Then valido a mensagem de envio