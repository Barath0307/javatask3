package com.task3Q2;

import java.util.Scanner;

//Interface Taxable
interface Taxable {
 double salesTax = 0.07;    // 7% sales tax
 double incomeTax = 0.105;  // 10.5% income tax

 double calcTax();
}

//Class Employee implementing Taxable
class Employee implements DriverMain {
 private int empId;
 private String name;
 private double salary;

 // Constructor
 public Employee(int empId, String name, double salary) {
     this.empId = empId;
     this.name = name;
     this.salary = salary;
 }

 // Implementing calcTax method for income tax calculation
 @Override
 public double calcTax() {
     return salary * incomeTax;
 }
}