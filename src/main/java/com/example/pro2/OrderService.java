package com.example.pro2;

import org.springframework.stereotype.Component;

@Component
public class OrderService {
    public void setPaymentSerivice(PaymentSerivice paymentSerivice) {
        this.paymentSerivice = paymentSerivice;
    }

    private PaymentSerivice paymentSerivice;

    public void setAmount(int amount) {
        this.amount = amount;
    }

    private int amount;


//    public OrderService (PaymentSerivice paymentSerivice, int amount){
//        this.paymentSerivice = paymentSerivice;
//        this.amount = amount;
//
//    }
    public void order(){

        paymentSerivice.PaymentProcess(amount);
    }
}
