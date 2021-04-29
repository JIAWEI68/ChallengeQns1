package com.example.challengeq1;

public class ChallengeQ1 {
    public static int calculateArea ( double length, double breadth)
    {
        System.out.print("Calculating area of rectangle with ");
        System.out.println("length = " + length + " cm and breadth = " + breadth + " cm");
        double area = length * breadth;
        return area;
    }

    public static void main(String[] args) {
        double areaOfRectangle = calculateArea(1,30);
        System.out.println(" Area of rectangle = " + areaOfRectangle + " cm sq");
}
