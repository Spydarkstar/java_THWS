package basic;

import java.util.ArrayList;

// Main class
class Main {
    static void cfunction() {
        System.out.println("class function worked");
    }
}

// Second class
public class demo {

    // Simple method
    static void function() {
        System.out.println("hello yovan");
    }

    // Returns int
    static int rfunction() {
        int a = 20;
        return a;
    }

    // Returns String
    static String sfunction(String a) {
        return a;
    }

    // Overloaded shape methods
    static String shapes(int a, int b) {
        int value = a * b;
        return "Its a Rectangle and the Area is " + value;
    }

    static String shapes(int a) {
        double circle = 3.14 * a * a;
        return "Its a Circle and its Area is " + circle;
    }

    static String shapes(int a, int b, int c) {
        int value = a * b; // c is unused, maybe consider using it or removing
        return "Its a Rectangle and the Area is " + value;
    }

    public static void main(String[] args) {
        System.out.println("hello");
        function();
        System.out.println(rfunction());
        System.out.println(sfunction("yovan") + " and his age is " + rfunction());

        // Age category
        if (rfunction() <= 0) {
            System.out.println("Invalid age cannot be Zero");
        } else if (rfunction() > 0 && rfunction() <= 10) {
            System.out.println("Child");
        } else {
            System.out.println("Teenager");
        }

        // Area examples
        System.out.println(shapes(12, 12));

        // While loop
        int value = 0;
        while (value < 3) {
            value++;
            System.out.println(value);
        }

        // For loop
        for (int i = 0; i < 10; i++) {
            System.out.println("for loop " + i);
        }

        // Splitting values into two lists
        ArrayList<Integer> vallessfifty = new ArrayList<>();
        ArrayList<Integer> valgreatfifty = new ArrayList<>();
        int[] values = {73, 12, 88, 5, 61, 34, 97, 20, 46, 79, 3, 58, 41, 90, 27, 66, 10, 53, 84, 38};

        for (int i = 0; i < values.length; i++) {
            if (values[i] <= 50) {
                vallessfifty.add(values[i]);
            } else {
                valgreatfifty.add(values[i]);
            }
        }

        System.out.println("Values less than or equal to 50: " + vallessfifty);
        System.out.println("Values greater than 50: " + valgreatfifty);

        // Call method from Main class
        Main.cfunction();
    }
}
