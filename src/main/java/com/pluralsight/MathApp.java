package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {
        // Question 1:
        int bobSalary = 61000;
        int garySalary = 63000;
        int highestSalary = Math.max(bobSalary, garySalary);
        System.out.println("The highest salary is " + highestSalary);

        // Question 2:
        double carPrice = 5600.50;
        double truckPrice = 23400.70;
        double lowestPrice = Math.min(carPrice, truckPrice);
        System.out.println("The lowest price is " + lowestPrice);

        // Question 3:
        double circleRadius = 7.25;
        double circleArea = Math.PI * circleRadius * circleRadius;
        System.out.println("The circle area is " + circleArea);

        // Question 4:
        double number = 5.0;
        double squareRoot = Math.sqrt(number);
        System.out.println("The square root of " + number + " is " + squareRoot);

        // Question 5: distance = square root ((x2 - x1)^2 + (y2 - y1)^2)
        double xPoint1 = 5;
        double yPoint1 = 10;
        double xPoint2 = 85;
        double yPoint2 = 50;
        double differenceBetweenX = xPoint1 - xPoint2;
        double differenceBetweenY = yPoint1 - yPoint2;
        double distanceBetweenPoints = Math.sqrt(differenceBetweenX * differenceBetweenX + differenceBetweenY * differenceBetweenY);
        System.out.println("The distance between the points is " + distanceBetweenPoints);

        // Question 6:
        double currentValue = -3.8;
        double absoluteValue = Math.abs(currentValue);
        System.out.println(absoluteValue);

        // Question 7:
        double randomNumber;
        randomNumber = Math.random();
        System.out.println(randomNumber);

        // Question 8:
        int dayQuantity = 24;
        int minutesInHour = 60;
        int hoursInDay = 24;
        int totalMinutes;
        int minutesInDay = hoursInDay * minutesInHour;

        totalMinutes = minutesInDay * dayQuantity;
        System.out.println("There are " + totalMinutes + " minutes in 24 days.");

        int secondsInMinutes = 60;
        int millisecondsInSecond = 1000;
        int totalSeconds = totalMinutes * secondsInMinutes;

        int totalMilliseconds = totalSeconds * millisecondsInSecond;
        System.out.println("There are " + totalMilliseconds + " milliseconds in 24 days.");
    }
}
