#language: pt
#enconding: UTF-8
@Login
Funcionalidade: Realizar login no messenger lite

  Contexto: possibilidade de acessar o sistema

  @LoginComSucesso
  Esquema do Cenario: Realizar o Login com sucesso no App
    Quando o usuário inserir um <login> cadastrado no sistema
    E inserir um <password> cadastrado no sistema
    E clicar no botão Log in
    Entao deve-se apresentar a tela inicial do App

    Exemplos: 
      | login                 | password              |
      | "Digite o login aqui" | "Digite a senha aqui" |
