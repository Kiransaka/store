package com.example.pro2;

public class OrderService {
    public void order(){
        GpayPaymentSerivice paymentSerivice = new GpayPaymentSerivice();
        paymentSerivice.PaymentProcess(2000);
    }
}
