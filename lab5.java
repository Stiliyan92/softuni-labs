package com.company;

import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

import static java.lang.Math.abs;

public class lab5 {

    public static boolean isBetween(int x, int lower, int upper) {
        return lower <= x && x <= upper;
    }

    public static Scanner sc = new Scanner(System.in);

    public static void Age() {
        String person;
        Scanner my_input = new Scanner(System.in);
        int age = my_input.nextInt();
        if (isBetween(age, 0, 2))
            person = "baby";
        else if (isBetween(age, 3, 13))
            person = "child";
        else if (isBetween(age, 14, 19))
            person = "teenager";
        else if (isBetween(age, 20, 65))
            person = "adult";
        else
            person = "elder";
        System.out.print(person);
    }

    public static void student_information() {
        Scanner my_input = new Scanner(System.in);
        String output = "Name: %s, Age: %d, Grade: %.2f";
        String name = my_input.nextLine();
        int age = Integer.parseInt(my_input.nextLine());
        double grade = Double.parseDouble(my_input.nextLine());
        System.out.printf(output, name, age, grade);

    }

    public static void back_in_30() {
        int hours = Integer.parseInt(sc.nextLine());
        int minutes = Integer.parseInt(sc.nextLine());
        int new_minutes = (minutes + 30) % 60;
        hours = (hours + ((minutes + 30) / 60)) % 24;
        System.out.printf("%d:%02d", hours, new_minutes);
    }

    public static void passed_failed() {
        double grade = Double.parseDouble(sc.nextLine());
        if (grade >= 3.0)
            System.out.println("Passed!");
        else
            System.out.println("Failed!");
    }

    public static void month_printer() {
        int month = Integer.parseInt(sc.nextLine());
        SortedMap<Integer, String> hm = new TreeMap<Integer, String>();
        final String errorMessage = "Error!";
        hm.put(1, "January");
        hm.put(2, "February");
        hm.put(3, "March");
        hm.put(4, "April");
        hm.put(5, "May");
        hm.put(6, "June");
        hm.put(7, "July");
        hm.put(8, "August");
        hm.put(9, "September");
        hm.put(10, "October");
        hm.put(11, "November");
        hm.put(12, "December");

        String answer = hm.getOrDefault(month, errorMessage);
        System.out.println(answer);
    }

    public static void foreign_languages() {
        String country = sc.nextLine();
        switch (country) {
            case "England":
            case "USA":
                System.out.println("English");
                break;
            case "Spain":
            case "Argentina":
            case "Mexico":
                System.out.println("Spanish");
                break;
            default:
                System.out.println("unknown");
        }
    }

    public static boolean tp_check_age(int age) {
        if ((age >= 0 && age <= 18) || (age > 64 && age < 123))
            return true;
        else return false;
    }

    public static void theatre_promo() {
        String day = sc.nextLine().toLowerCase();
        int age = Integer.parseInt(sc.nextLine());
        int price = 0;
        if (day.equals("weekday")) {
            if ((age >= 0 && age <= 18) || (age > 64 && age < 123))
                price = 12;
            else if (age > 18 && age <= 64)
                price = 18;
        } else if (day.equals("weekend")) {
            if ((age >= 0 && age <= 18) || (age > 64 && age < 123))
                price = 15;
            else if (age > 18 && age <= 64)
                price = 20;
        } else {
            if (age >= 0 && age <= 18)
                price = 5;
            else if (age > 18 && age <= 64)
                price = 12;
            else if (age > 64 && age <= 122)
                price = 10;
        }
        if (price == 0)
            System.out.println("Error!");
        else
            System.out.println(price + "$");
    }
    
    public static void divisibleBy3(int n){
            for(int i = 3; i < n; ++i){
            if (i % 3 == 0) System.out.println(i);
        }
    }

    public static void sumOfOddNUmbers(){
        int n = Integer.parseInt(sc.nextLine());
        int sum = 0;
        for (int i = 1; n > 0; i += 2, n--) {
            System.out.println(i);
            sum += i;
        }
        System.out.printf("Sum: %d", sum);
    }

    String output = "Name: %s, Age: %d, Grade: %.2f";

    public static void multiplicationTable(){
        String output = "%d X %d = %d\n";
        int number = Integer.parseInt(sc.nextLine());
        printTable(number, 1);
    }

    public static String tableOutput = "%d X %d = %d\n";

    public static void printTable(int number, int start){
        for(int i = start; i <= 10; ++i)
            System.out.printf(tableOutput, number, i, number * i);
    }

    public static void multiplicationTableV2(){
        int number = Integer.parseInt(sc.nextLine());
        int product = Integer.parseInt(sc.nextLine());
        if (product > 10) System.out.printf(tableOutput, number, product, number*product);
        else printTable(number, product);
    }

    public static void evenNumber(){
        int number = Integer.parseInt(sc.nextLine());
        while(number % 2 != 0) {
            System.out.println("Please write an even number.");
            number = Integer.parseInt(sc.nextLine());
        }
        System.out.println("The number is: " + abs(number));
    }

    public static void sumOfOddNUmbersV2(){
        int n = Integer.parseInt(sc.nextLine());
        int sum = 0;
        for (int i = 0; i < n; ++i) {
            System.out.println(2 * i + 1);
            sum += 2 * i + 1;

        }
        System.out.printf("Sum: %d", sum);
    }

    public static void main(String[] args) {
        // write your code here
//        student_information();
//        passed_failed();
//        back_in_30();
//        month_printer();
//        foreign_languages();
//        theatre_promo();
//        write your code here
//        divisibleBy3(100);
//        sumOfOddNUmbers();
//        multiplicationTableV2();
//        evenNumber();
        sumOfOddNUmbersV2();
    }
}
