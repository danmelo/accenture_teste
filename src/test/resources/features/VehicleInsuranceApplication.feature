#language:pt


Funcionalidade: Teste Vehicle Insurance Application

  Cenario: Formulario preenchido com sucesso
    Dado que eu esteja na pagina inicial:"http://sampleapp.tricentis.com/101/app.php"
    E preencha os dados do veiculo
    E insiro um valor valido para cylinder capacity
    E insiro um valor valido de engine performance
    E insiro um valor de payload entre 1 e 1000
    E insiro um valor entre 100 e 50000 de total weight
    E insiro um valor válido no List Price
    E insiro um numero de ate 10 caracteres no license plate number
    E insiro um valor entre 100 e 100000 no annual mileage
    E clique no botao next
    E preencha o formulario Insurant Data
    E clique no segundo botao next
    E preencha o formulario Enter Product Data
    E clique no terceiro botao next
    E seleciono o Option Price
    E clico no botao next do Price Option
    E preencho os dados de Send Quote
    E crio uma senha forte
    Quando eu clico no botao send
    Então a mensagem de sucesso é exibida
