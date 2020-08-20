package com.company;

public class BankAccount {
    private long accNum;
    private double balance;
    private String name;
    private String email;
    private long phoneNum;

    //giving default values
    public BankAccount(){
        this(1, 2.50, "default name", "default email", 123456789);
    }

    //using a constructor instead of setters
    public BankAccount(long accNum, double balance, String name, String email, long phoneNum){
        this.accNum= accNum;
        this.balance= balance;
        this.name= name;
        this.email= email;
        this.phoneNum= phoneNum;
    }

    //getters and setters
     public long getAccNum(){
            return accNum;
        }

//    public void setAccNum(long accNum){
//        this.accNum= accNum;
//    }

    public double getBalance() {
        return balance;
    }

//    public void setBalance(double balance) {
//        this.balance = balance;
//    }

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }

    public String getEmail() {
        return email;
    }

//    public void setEmail(String email) {
//        this.email = email;
//    }

    public long getPhoneNum() {
        return phoneNum;
    }

//    public void setPhoneNum(long phoneNum) {
//        this.phoneNum = phoneNum;
//    }

    //additional methods
    public void deposit(double money){
        System.out.println("\nThe current balance is " + balance);
        balance+=money;
        System.out.println("The new balance is " + balance);
    }
    public void withdraw(double money){
        System.out.println("\nThe current balance is " + balance);
        if(balance>=money) {
            balance -= money;
            System.out.println("The new balance is " + balance);
        }
        else{
            System.out.println("Insufficient Funds\n" + "Cannot withdraw " + money + "\n" + "The balance is " + balance);
        }
    }
}
