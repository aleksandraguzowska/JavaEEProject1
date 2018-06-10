package pl.javastart.businesslogic;

import pl.javastart.model.Product;

import java.util.ArrayList;

public class PriceCalculator {

    public static double calculateSum (ArrayList<Product> products){

        double sum = 0;

        for (Product product: products) {

            double price = Double.parseDouble(product.getPrice());
            sum += price;

        }

        return sum;
    }

    public static double calculateMean (ArrayList<Product> products){

        double mean = calculateSum(products)/products.size();

        return mean;

    }
}
