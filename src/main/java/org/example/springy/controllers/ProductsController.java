package org.example.springy.controllers;

import org.example.springy.models.Product;
import org.example.springy.services.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ProductsController {
    private final ProductService productService;

    public ProductsController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products")
    public String viewProducts(Model model) {
        var products = productService.getAllProducts();
        model.addAttribute("products", products);
        return "products.html";
    }

    @PostMapping("/products")
    public String addProduct(Model model, Product p) {
        productService.addProduct(p);

        var products = productService.getAllProducts();
        model.addAttribute("products", products);

        return "products.html";
    }
}
