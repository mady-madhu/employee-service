package com.example.employee_service.impl;

import com.example.employee_service.interfaces.PaymentService;
import org.springframework.stereotype.Service;

@Service
public class MasterCardPaymentService implements PaymentService {
    public MasterCardPaymentService(){
        System.out.println("inside master constructor");
    }

    @Override
    public void processPayment() {
        System.out.println("inside master");
    }
}
