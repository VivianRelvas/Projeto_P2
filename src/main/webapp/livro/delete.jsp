<!-Criando a página Deletar livro->

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>Deletar um Livro</title>

        <!-Inserindo estilos através do BootStrap e Padroniza todos os botões->

        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

    </head>
<body>
      <main class="container"> <!-Declarando a classe container->
       <h1>Deletar um livro</h1>
           <hr>

   <!-Criando uma caixa para ter certeza se  o usuario quer deletar o livro->

<p>Tem certeza que deseja deletar o livro?<em>"${livro.titulo}"</em>?</p> <!-Tag para buscar o livro no Banco de Dados->
          
<!-criando form, input e os botões vamos utilizar o framework bootstrap->

            <form action="/livro/delete" method="post">
               <input type="hidden" name="id"value="${livro.id}"/> ,<!-hidden esconde o id->
               <a href="/livro/list" class="btn btn-secondary">Voltar</a>
               <input type="submit" value="Deletar"class="btn btn-danger"/>
           </form>

        </main>  

        <!-Separate organiza os codigos sem precisar criar os códigos->
        
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js" integrity="sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js" integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13" crossorigin="anonymous"></script>

    </body>
</html>

