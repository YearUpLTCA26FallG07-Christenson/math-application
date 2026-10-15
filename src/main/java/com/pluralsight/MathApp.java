package com.pluralsight;

public class MathApp {
    public static void main(String[] args){

        // Question 1:
        // declare variables here
        //Step 1 - establish what we currently know. (input)
        double bobSalary = 500.50, garySalary = 400;
        double highestSalary;

        //Step 2 - compute the unknowns.
        highestSalary = Math.max(bobSalary, garySalary);

        //Step 3 - display result (output)
        System.out.println("The highest salary is " + highestSalary);

//--------------------

        //Step 1 - establish what we currently know. (input)
        int point1x = 5;
        int point1y = 10;
        int point2x = 85;
        int point2y = 50;

        //Step 2 - compute the unknowns.


//        1. Subtract the \(x\)-coordinates: \((x_2 - x_1)\).
          int xDiff = point2x - point1x;

//        2. Subtract the \(y\)-coordinates: \((y_2 - y_1)\).
          int yDiff = point2y - point1y;

//        3. Square both results.
          //int xDiffSquared = xDiff * xDiff;
          double xDiffSquared =  Math.pow(xDiff,2);
          double yDiffSquared = Math.pow(yDiff, 2);

//        4. Add the two squared values together.
          double sumOfSquares = xDiffSquared + yDiffSquared;

//        5. Take the square root of that sum.
          double distance = Math.sqrt(sumOfSquares);


        //Step 3 - display result (output)
        System.out.println("The distance is " + distance);


    }
}
