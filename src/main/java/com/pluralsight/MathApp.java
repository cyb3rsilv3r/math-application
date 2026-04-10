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





    }
}
