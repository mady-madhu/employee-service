package com.example.employee_service.impl;

import com.example.employee_service.interfaces.PaymentService;
import org.springframework.stereotype.Service;

@Service
public class PayPalPaymentService implements PaymentService {

    public PayPalPaymentService(){
        System.out.println("inside paypal constructor");
    }

    @Override
    public void processPayment() {
        System.out.println("inside paypal");
    }
}
