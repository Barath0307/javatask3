package com.task3Q2;

import java.util.Scanner;

//DriverMain class
public class DriverMain {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     // Accepting employee information
     System.out.println("Enter employee ID:");
     int empId = scanner.nextInt();
     scanner.nextLine(); // Consume newline
     System.out.println("Enter employee name:");
     String name = scanner.nextLine();
     System.out.println("Enter employee yearly salary:");
     double salary = scanner.nextDouble();

     // Creating Employee object
     Employee employee = new Employee(empId, name, salary);

     // Accepting product information
     System.out.println("Enter product ID:");
     int pid = scanner.nextInt();
     System.out.println("Enter product price:");
     double price = scanner.nextDouble();
     System.out.println("Enter quantity purchased:");
     int quantity = scanner.nextInt();

     // Creating Product object
     Product product = new Product(pid, price, quantity);

     // Printing income tax and sales tax respectively
     System.out.println("Income Tax: " + employee.calcTax());
     System.out.println("Sales Tax: " + product.calcTax());

     scanner.close();
 }
}