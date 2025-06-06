package org.example.springy.controllers;

import org.example.springy.models.Purchase;
import org.example.springy.repositories.PurchaseRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/purchase")
public class PurchaseController {
    private final PurchaseRepository purchaseRepository;

    public PurchaseController(PurchaseRepository purchaseRepository) {
        this.purchaseRepository = purchaseRepository;
    }

    @PostMapping
    public void createPurchase(@RequestBody Purchase purchase) {
        purchaseRepository.save(purchase);
    }

    @GetMapping
    public List<Purchase> getAllPurchases() {
        return (List<Purchase>) purchaseRepository.findAll();
    }
}
