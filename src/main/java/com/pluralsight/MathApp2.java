package com.pluralsight;

public class MathApp2 {
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
        // calculate the distance between two points:
        // https://www.calculator.net/distance-calculator.html
          double distance =
                  Math.sqrt(
                          Math.pow(point2x - point1x,2)
                        +
                        Math.pow(point2y - point1y, 2)
                  );


        //Step 3 - display result (output)
        System.out.println("The distance is " + distance);


    }
}
