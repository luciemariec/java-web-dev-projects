package org.launchcode;

import java.util.Date;

public class Restaurant {

    public static void main(String[] args) {
        MenuItem myItem = new MenuItem("Food", 5.00, "Something to eat", "appetizer", new Date("1/1/2024"));
        System.out.println(myItem);

    }
}
