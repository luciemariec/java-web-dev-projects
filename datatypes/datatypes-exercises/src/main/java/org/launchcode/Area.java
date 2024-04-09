package org.launchcode;

import java.util.Scanner;
public class Area {
    public static void main(String[] args){
        int length, width, area;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle :");
        length = sc.nextInt();
        System.out.println("Enter the width of the rectangle :");
        width = sc.nextInt();
        area = length* width;
        System.out.println("Area of the rectangle is :"+area);
    }
}
