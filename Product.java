package com.task3Q2;

//Class Product implementing Taxable
class Product implements DriverMain {
 private int pid;
 private double price;
 private int quantity;

 // Constructor
 public Product(int pid, double price, int quantity) {
     this.pid = pid;
     this.price = price;
     this.quantity = quantity;
 }

 // Implementing calcTax method for sales tax calculation
 @Override
 public double calcTax() {
     return price * salesTax * quantity;
 }
}