package com.gwyn.test1;

/**
 * Created by glockett.
 */
public class Employee {

    double salary;
    double bonus;

    void calculateTotalPay() {
        double totalPay = salary + bonus;
        System.out.println("Total Pay = " + totalPay);

    }
}


