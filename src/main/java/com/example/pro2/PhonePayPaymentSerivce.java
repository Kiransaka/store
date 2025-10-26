package com.example.pro2;

import org.springframework.stereotype.Service;

@Service
public class PhonePayPaymentSerivce implements PaymentSerivice{
    @Override
    public void PaymentProcess(long amount) {
        System.out.println("PhonePay UPI service");
        System.out.println("your payment is successful with amount "+amount);
    }
}
