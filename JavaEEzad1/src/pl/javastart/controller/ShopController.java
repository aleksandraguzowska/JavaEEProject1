package pl.javastart.controller;

import pl.javastart.businesslogic.PriceCalculator;
import pl.javastart.model.Product;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet("/shop")
public class ShopController extends HttpServlet {

    double sum;
    double mean;
    private ArrayList<Product> products;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        PrintWriter printWriter = response.getWriter();
        products = new ArrayList<>();

        String name1 = request.getParameter("name1");
        String name2 = request.getParameter("name2");
        String name3 = request.getParameter("name3");
        String name4 = request.getParameter("name4");

        String price1 = request.getParameter("price1");
        price1 = price1.replaceAll(",",".");
        String price2 = request.getParameter("price2");
        price2 = price2.replaceAll(",",".");
        String price3 = request.getParameter("price3");
        price3 = price3.replaceAll(",",".");
        String price4 = request.getParameter("price4");
        price4 = price4.replaceAll(",",".");

        if(price1 == "" || price2 == "" || price3 == "" || price4 == "" || name1 == "" || name2 == "" || name3 == "" || name4 == ""){
            response.sendRedirect("empty.jsp");
        }
        else {
            Product product1 = new Product(name1, price1);
            Product product2 = new Product(name2, price2);
            Product product3 = new Product(name3, price3);
            Product product4 = new Product(name4, price4);

            products.add(product1);
            products.add(product2);
            products.add(product3);
            products.add(product4);

            sum = PriceCalculator.calculateSum(products);
            mean = PriceCalculator.calculateMean(products);

            request.setAttribute("products",products);
            request.setAttribute("sum",sum);
            request.setAttribute("mean",mean);
            request.getRequestDispatcher("summary.jsp").forward(request,response);
            response.sendRedirect("summary.jsp");
        }
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }


}
