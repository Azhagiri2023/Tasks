package com.giriaim.inventoryapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.giriaim.inventoryapp.entity.Products;
import com.giriaim.inventoryapp.repository.ProdRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class ProdController {
    @Autowired
    private ProdRepository prodRepo;

    @GetMapping("/")
    public String loadHomePage() {
        return "index";
    }

    @GetMapping("/addproduct")
    public String addProduct(Model model) {
        model.addAttribute("products", new Products());
        return "addprod";
    }

    @GetMapping("/allprod")
    public String listAllProducts(Model model) {
        model.addAttribute("products", prodRepo.findAll());
        return "allprod.html";
    }

    @PostMapping("/addproduct")
    public String postAddProduct(@ModelAttribute Products products) {
        prodRepo.save(products);
        return "redirect:/allprod";
    }
    
    
}
