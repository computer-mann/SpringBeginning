package com.example.tsclientconnectivity.models;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

public class Customer {
    @Getter @Setter
    private int Id;

    @Getter @Setter
    private double currentBalance;

    @Getter @Setter
    private String name;

    public Customer(){}
    public Customer(int id, double currentBalance, String name) {
        Id = id;
        this.currentBalance = currentBalance;
        this.name = name;
    }

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public double getCurrentBalance() {
//        return currentBalance;
//    }
//
//    public void setCurrentBalance(double currentBalance) {
//        this.currentBalance = currentBalance;
//    }
//
//    public int getId() {
//        return Id;
//    }
//
//    public void setId(int id) {
//        Id = id;
//    }
}
