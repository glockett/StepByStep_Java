package com.gwyn;

/**
 * Created by glockett.
 */
public class StepbyStepJava {

    public static void main(String[] args) {

        System.out.println("HelloWorld");

        int x = 10;
        int y = 20;

        int result = x + y;

        System.out.println(result);

        if (x < y) {
            System.out.println("x is less than y");
        } else if (x == y) {
            System.out.println("x is the same as y");
        } else {
        /*This must be the answer as there is nothing else
           so only needs the else statment here */

            System.out.println("x is greater then y");
        }

        /*A For Loop comprises of the following:
          for (The Initial value;  The Condition; Then the increment /decrement)
          in this case we use i++ ( or i = i +1)
          */
        for (int i = 0; i <= 10; i++) {
            System.out.println("i = " + i);

        }

        //WHILE LOOPS
        int l = -10;

        while (l <= 10) {
            System.out.println("x = " + l);
            l++;
            // or l = l + 1 or l += 2 will increment by 2 each time


            //USING DO WHILE...
            int d = 10;
            do {
                System.out.println("d = " + d);
                d--;
            } while (d > 0);

            //And or
            int s, t;
            s = 10;
            t = 10;
            // && = and
            // || = or
            if (s > 0 && t > 0) {
                System.out.println("Both numbers are +ve");
            } else if (s > 0 || t > 0) {
                System.out.println("At least one number is +ve");
            } else {
                System.out.println("Both numbers are -ve");
            }

            // USING SWITCH CASES

            int j = 2;

            switch (j) {

                case 0:
                    System.out.println("value is 0");
                    break;

                case 1:
                    System.out.println("value is 2");
                    break;

                case 2:
                    System.out.println("value is 2");
                    break;

                case 3:
                    System.out.println("value is 3");
                    break;

                default:
                    System.out.println("No Value");
                    break;

            }

            //USING ARRAYS

            /*int a = 10;
            int b = 20;
            int c, d, e;
            c=30;
            d=40; e=50;*/
            /*
            int a1 =10;
            int a2 = 20;*/


            //arrays are always zero relative
            int[] a = {10, 20, 30, 40, 50};
            System.out.println(a[2] + ", " + a[4]);

            //enhanced for loop with an array
            for (int arrayvar : a) {
                System.out.println(arrayvar);

                int[] myarray = new int[5];

                myarray[0] = 25;
                myarray[4] = 30;

                //STRING MANIPULATION

                String name = "James Dean";
                System.out.println(name.toUpperCase());
                System.out.println(name.substring(6, 10));

            }


        }

    }
}
