package com.myprojects.javaprograms.newadapter;

import java.util.ArrayList;
import java.util.List;

public class LegacyOMS {
    List cart = new ArrayList();

    public void addItem(Item itemXml) {
        cart.add(itemXml);
        System.out.println(itemXml.getName() + " " + itemXml.getPrice());
    }

    public void makePayment(Payment paymentXml) {
        paymentXml.pay();
    }
}
