package com.company;

public class Main {

    public static void main(String[] args) {
        BankAccount mine = new BankAccount(1234, 600, "Pranchal", "pranchal2001@gmail.com", 123456789);

//        mine.setBalance(600);
        System.out.println("The balance is " + mine.getBalance());
//
//        mine.setAccNum(1234);
        System.out.println("The account number is " + mine.getAccNum());
//
//        mine.setName("Pranchal");
        System.out.println("The name is " + mine.getName());
//
//        mine.setEmail("pranchal2001@gmail.com");
        System.out.println("The email is " + mine.getEmail());
//
//        mine.setPhoneNum(123456789);
        System.out.println("The phone number is " + mine.getPhoneNum() + "\n");

        mine.deposit(300);
        mine.withdraw(400);
        mine.withdraw(600);
    }
}
