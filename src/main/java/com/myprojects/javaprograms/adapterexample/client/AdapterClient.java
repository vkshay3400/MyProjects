package com.myprojects.javaprograms.adapterexample.client;

import com.myprojects.javaprograms.adapterexample.adapter.Item;
import com.myprojects.javaprograms.adapterexample.adapter.LegacyOMS;
import com.myprojects.javaprograms.adapterexample.adapter.Payment;

public class AdapterClient {
    public static void main(String[] args) {
        LegacyOMS oms = new LegacyOMS();

        System.out.println("--------------");
        oms.addItem(new Item("Wada Pav ", 11.99));
        oms.addItem(new Item("Idli ", 14.99));
        oms.addItem(new Item("Masala Dosa ", 24.99));
        oms.addItem(new Item("Poha ", 9.99));
        oms.addItem(new Item("Almonds ", 20.00));

        System.out.println("--------------");
        oms.makePayment(new Payment("CASH ", 20.00));
        oms.makePayment(new Payment("CREDIT ", 10.00));
        oms.makePayment(new Payment("DEBIT ", 10.00));
        System.out.println("--------------");
    }
}
