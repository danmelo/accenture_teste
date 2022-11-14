#language:pt


Funcionalidade: Teste Vehicle Insurance Application

  Cenario: Formulario preenchido com sucesso
    Dado que eu esteja na pagina inicial:"http://sampleapp.tricentis.com/101/app.php"
    E preencha os dados do veiculo
    E clique no botao next
    E preencha o formulario Insurant Data
    E clique no segundo botao next
    E preencha o formulario Enter Product Data
    E clique no terceiro botao next
    E seleciono o Option Price
    E clico no botao next do Price Option
    E preencho os dados de Send Quote
    Quando eu clico no botao send
    Então a mensagem de sucesso é exibida
