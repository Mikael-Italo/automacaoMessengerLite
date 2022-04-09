#language: pt
#enconding: UTF-8
@Send
Funcionalidade: Realizar o envio de mensagem para o contato selecionado

  Contexto: 
    Dado que o usuário esteja logado

  @SendComSucesso
  Esquema do Cenario: enviar uma mensagem com sucesso
    Quando o usuário solicitar ao App uma nova conversa
    E inserir o <destinatario> no campo busca
    E clicar na guia de conversa do usuário digitado
    E digitar a <mensagem> que desejada e enviar
    Entao deve-se exibir a mensagem enviada no chat e o campo de envio vazio

    Exemplos: 
      | destinatario                                                  | mensagem                       |
      | "Digite o nome do destinatario igual ao que esta no facebook" | "Olá, esta msg é automatizada" |
