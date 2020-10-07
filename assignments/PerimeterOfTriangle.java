/*
    (Compute the perimeter of a triangle) Write a program that reads three edges for a triangle and computes the perimeter if the input is valid. 
    Otherwise, display that the input is invalid. 
    The input is valid if the sum of every pair of two edges is greater than the remaining edge. (this is pythagorean theorm)
*/

import java.util.Scanner;

public class PerimeterOfTriangle {
    public static void main(String[] args) {
        System.out.println("Write three edge value for a triangle:");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        if ((a + b) > c && (b + c) > a && (c + a) > b) {
            System.out.println("This value is valid for a triangle");
        } else {
            System.out.println("invalid value");
        }
    }
}