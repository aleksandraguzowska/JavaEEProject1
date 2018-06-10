<%--
  Created by IntelliJ IDEA.
  User: Aleksandra
  Date: 10.06.2018
  Time: 22:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Sklep internetowy</title>
</head>

<body>
<h1>Sklep ze wszystkim</h1>

<h3>Wpisz nazwy i ceny produktow, ktore chcesz kupic</h3>

<form method="post" action="shop">

    <input type="text" name="name1" placeholder="Produkt 1">
    <input type="number" name="price1" step="0.01" placeholder="cena"><br>
    <input type="text" name="name2" placeholder="Produkt 2">
    <input type="number" name="price2" step="0.01" placeholder="cena"><br>
    <input type="text" name="name3" placeholder="Produkt 3">
    <input type="number" name="price3" step="0.01" placeholder="cena"><br>
    <input type="text" name="name4" placeholder="Produkt 4">
    <input type="number" name="price4" step="0.01" placeholder="cena"><br>

    <input type="submit" value="Kup teraz">
</form>


</body>
</html>
