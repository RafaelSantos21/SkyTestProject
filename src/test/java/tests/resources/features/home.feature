#language: pt
#encoding: UTF-8
#author: Rafael Leite


  Funcionalidade: Tela Inicial

    @poc
    Cenario: Acessar site

      Dado que realizo acesso na aplicacao
      E
        | Numero do CT |                          Nome do CT            | Nome do executor   | Sprint   |
        | 123-XXX      |         Descricao com o nome do caso de teste  |  Marcos Barbosa    | Sprint 3 |
      Entao visualizo a mensagem "Problemas com o login do usuário"

