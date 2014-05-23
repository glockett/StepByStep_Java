package com.gwyn;

public class Exercises {

    public static void main(String[] args) {

        double salary = 78934.55;
        double tax = 0.0;

        if (salary < +15000) {
            tax = salary * .10;
        } else if (salary < +40000) {
            tax = salary * .20;
        } else {
            tax = salary * .30;
        }
        System.out.println("Tax = " + tax);

        String[] myNums = {"10", "20", "30", "40", "50"};
        int total = 0;

        for (String temp : myNums) {
            total = total + Integer.parseInt(temp);

            System.out.println(total);

        }

    }
}
