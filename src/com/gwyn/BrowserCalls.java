package com.gwyn;

/**
 * Created by glockett.
 */
public class BrowserCalls {

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

        //While loop
        int l = -10;

        while (l <= 10){
            System.out.println("x = " + l);
            l++;
            // or l = l + 1 or l += 2 will increment by 2 each time


        //Do while...
        int d = 10;
            do {
                System.out.println("d = " + d);
                d--;
            } while( d < 0);








        }


    }


}
