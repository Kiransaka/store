package com.example.pro2;

public class OrderService {
    private PaymentSerivice paymentSerivice;
    private int amount;
    public OrderService (PaymentSerivice paymentSerivice, int amount){
        this.paymentSerivice = paymentSerivice;
        this.amount = amount;

    }
    public void order(){

        paymentSerivice.PaymentProcess(amount);
    }
}
