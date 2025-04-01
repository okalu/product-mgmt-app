package edu.miu.cs.cs489.productmgmtapp;

import edu.miu.cs.cs489.productmgmtapp.model.Product;

import java.time.LocalDate;
import java.util.List;

public class ProductMgmtApp {

    public static void main(String[] args) {
        var products = List.of(
                new Product(101, "Banana", LocalDate.of(2025,3,31)),
                new Product(102, "Apple", LocalDate.of(2025,4,1)),
                new Product(103, "Carrot", LocalDate.of(2025,4,1))
        );
        System.out.println(products);
    }
}
