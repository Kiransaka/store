package com.example.pro2;

public class GpayPaymentSerivice implements PaymentSerivice {
    @Override
    public void PaymentProcess(long amount){
        System.out.println("Gpay UPI service");
        System.out.println("your payment is successful with amount "+amount);
    }
}
