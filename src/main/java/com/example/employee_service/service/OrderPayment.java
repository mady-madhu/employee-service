package com.example.employee_service.service;


import com.example.employee_service.interfaces.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderPayment {

    private final PaymentService  paymentService;

    @Autowired
    public OrderPayment(PaymentService paymentService){
        this.paymentService= paymentService;
        System.out.println(this.paymentService);
    }
}
