<%@ page import="pl.javastart.model.Product" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Aleksandra
  Date: 10.06.2018
  Time: 22:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="pl-PL">

<head>
    <title>Podsumowanie</title>
</head>

<body>
<h1>Podsumowanie Twoich zakupow:</h1>

<h3>Zakupione produkty</h3>

<table>
    <%List<Product> products=(List<Product>)request.getAttribute("products");%>
    <tr>
        <td>#</td>
        <td>Nazwa</td>
        <td>Cena</td>
    </tr>

    <tr>
        <td>1</td>
        <td><%products.get(0).getName();%></td>
        <td><%products.get(0).getPrice();%></td>
    </tr>

    <tr>
        <td>1</td>
        <td><%products.get(1).getName();%></td>
        <td><%products.get(1).getPrice();%></td>
    </tr>

    <tr>
        <td>1</td>
        <td><%products.get(2).getName();%></td>
        <td><%products.get(2).getPrice();%></td>
    </tr>

    <tr>
        <td>1</td>
        <td><%products.get(3).getName();%></td>
        <td><%products.get(3).getPrice();%></td>
    </tr>

</table>

<h3> Suma: <% request.getAttribute("sum") + "zl" %> </h3>
<h3>Srednia cena produktu: <% request.getAttribute("mean") + "zl" %></h3>

</body>
</html>
