package org.example.springy.services;

import org.example.springy.exceptions.NotEnoughMoneyException;
import org.example.springy.models.PaymentDetails;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    public PaymentDetails processPayment() {
        throw new NotEnoughMoneyException();
    }
}
