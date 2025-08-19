package com.antonio;

import com.antonio.product.controller.ProductController;
import com.antonio.product.interfaces.ProductRepository;
import com.antonio.product.repository.ProductRepositoryServices;
import com.antonio.product.service.ProductService;
import com.antonio.product.views.ProductView;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ProductRepository repositoryServices = new ProductRepositoryServices();
        ProductService productService = new ProductService(repositoryServices);
        ProductController controller = new ProductController(productService);
        ProductView view = new ProductView(controller);
        view.showMenu();
    }
}