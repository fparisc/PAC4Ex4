package edu.uoc.pac4;

public class Main {
    public static void main(String[] args) {
        DiscountCalculator calculator = new DiscountCalculator();

        System.out.println("VIP: " + calculator.calculateDiscount("VIP", 100));
        System.out.println("Regular: " + calculator.calculateDiscount("Regular", 100));
        System.out.println("Unknown: " + calculator.calculateDiscount("Other", 100));
    }
}