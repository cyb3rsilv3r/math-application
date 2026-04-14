package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {

        //Exercise 3 Question 1
      double bobSalary = 30000 ;
      double garySalary = 26000 ;
      double highestSalary = Math.max(bobSalary,garySalary);
        System.out.println("The highest salary is : $" + highestSalary);

        // Question 2
        double carPrice = 1738.69;
        double truckPrice = 6767.69;
        double lowestCost = Math.min(carPrice,truckPrice);
        System.out.println("The lowest price is: $" + lowestCost);

        // Question 3
        double radius = 7.25;
        double area = Math.PI * (radius * radius);
        System.out.println(" The area of the circle is: " + area);

        // Question 4
        double variable = 5.0;
        double squareRoot = Math.sqrt(variable);
        System.out.println(" The square root is: " + squareRoot);

        // Question 5
        double x1 = 5;
        double y1 = 10;
        double x2 = 85;
        double y2 = 50;
        double xDiff = x2 - x1;
        double yDiff = y2 - y1;
        double xDiffsq = xDiff * xDiff;
        double yDiffsq = yDiff * yDiff;
        double xyDiffsum = xDiffsq +yDiffsq;
        double sumSq = Math.sqrt(xyDiffsum);
        System.out.println("The distance between points is: "+ sumSq);

        // Question 6
        double q6Variable = -3.8;
        double absValue = Math.abs(q6Variable);
        System.out.println("The absolute value is: " + absValue);

        // Question 7
      double randomNumber = Math.random();
      System.out.println("Here is a random number: " + randomNumber);

        // Question 8
     int days = 24;
     int hours = days * 24;
     int minutes= hours * 60;
     int seconds = minutes * 60;
     int milliseconds = seconds * 1000;

      System.out.println("In 24 days there are " + minutes + " minutes and " + milliseconds + " milliseconds in 24 days");







    }
}
