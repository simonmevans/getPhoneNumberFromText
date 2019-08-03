package com.company;
import java.util.*;
public class Main {
    public static boolean checkFormat(String x) {
        boolean flag = true;
        int[] charPlaces = {1, 5};
        for (int place : charPlaces) {
            if (Character.isDigit(x.charAt(place))) {
                flag = false;
            }
        }
        int[] digitPlaces = {0, 2, 3, 4};
        for (int place : digitPlaces) {
            if (!Character.isDigit(x.charAt(place))) {
                flag = false;
            }
        }
        if (flag) {
            System.out.println("Formatting is correct");
        } else {
            System.out.println("Formatting is incorrect");

        }
        return flag;
    }

    public static String formatString(String x) {
        char temp = ' ';
        String mainString = x.substring(0, 6);
        String s1 = x.substring(6, x.length());
        s1 = s1.toUpperCase();
        s1 = convertDigitToChar(s1);
        x = mainString + s1;
        return x;
    }

    public static String convertDigitToChar(String x) {
        char temp = ' ';
        String build = "";
        for (int i = 0; i < x.length(); i++) {
            temp = x.charAt(i);
            if (temp == 'A' || temp == 'B' || temp == 'C') {
                build = build + "2";
            } else if (temp == 'D' || temp == 'E' || temp == 'F') {
                build = build + "3";
            } else if (temp == 'G' || temp == 'H' || temp == 'I') {
                build = build + "4";
            } else if (temp == 'J' || temp == 'K' || temp == 'L') {
                build = build + "5";
            } else if (temp == 'M' || temp == 'N' || temp == 'O') {
                build = build + "6";
            } else if (temp == 'P' || temp == 'Q' || temp == 'R' || temp == 'S') {
                build = build + "7";
            } else if (temp == 'T' || temp == 'U' || temp == 'V') {
                build = build + "8";
            } else if (temp == 'W' || temp == 'X' || temp == 'Z') {
                build = build + "9";
            }

        }
        return build;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a phone number like 1-800-Bobb and I will convert the last part to numbers");
        String phoneNumber = input.next();
        if (checkFormat(phoneNumber)) {
            System.out.println("You entered : " + phoneNumber);
            phoneNumber = formatString(phoneNumber);
            System.out.println("New number : " + phoneNumber);
        }
        else
            System.out.println("ERROR INCORRECT FORMAT");
    }
}