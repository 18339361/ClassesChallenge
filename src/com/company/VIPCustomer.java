package com.company;

public class VIPCustomer {
    private String name;
    private double creditLimit;
    private String email;

    public VIPCustomer(){
        this("Default Name", 00.00, "default@email.com");
    }

    public VIPCustomer(String name, double creditLimit){
        this(name, creditLimit, "unknown@email.com");
    }
    public VIPCustomer(String name, double creditLimit, String email){
        this.name=name;
        this.creditLimit=creditLimit;
        this.email=email;
    }
}
