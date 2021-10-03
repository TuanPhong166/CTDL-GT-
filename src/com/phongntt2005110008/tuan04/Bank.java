package com.phongntt2005110008.tuan04;

public class Bank {

    String name ;
    int accountNumber ;
    double accountBalance ;

    Bank(){}

    Bank(String n , int Number , double Balance){

        name = n ; 
        accountNumber = Number ;
        accountBalance = Balance ;

    }
    
    public void inThongTin(){
        System.out.println("Account holder : "+name);
        System.out.println("Account Number : "+accountNumber);
        System.out.println("Account Balance : "+accountBalance);

    }
}
