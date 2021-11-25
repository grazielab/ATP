<!DOCTYPE html>
<html lang="pt-BR">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title> Cadastro de Produtos </title>
</head>

<body>
    <h1> Cadastro de Produto </h1>
    <form action="/vendas-1/produto" method="post">
        Nome: <input type="text" name="nome" id="nome"><br>
        Valor: R$ <input type="number" name="valor" id="valor" min="0.00" max="10000.0" step="0.01" ><br>
        ID Categoria: <input type="number" name="idCategoria" id="idCategoria"><br><br>
        <input type="submit" value="Salvar">
    </form>
</body>

</html>