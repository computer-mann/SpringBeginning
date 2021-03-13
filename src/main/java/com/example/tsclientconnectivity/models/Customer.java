package com.example.tsclientconnectivity.models;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

public class Customer {
    @Getter
    @Setter
    private int Id;

    @Getter
    @Setter
    private double currentBalance;

    @Getter
    @Setter
    private String name;

    public Customer() {
    }

    public Customer(int id, double currentBalance, String name) {
        Id = id;
        this.currentBalance = currentBalance;
        this.name = name;
    }

}
