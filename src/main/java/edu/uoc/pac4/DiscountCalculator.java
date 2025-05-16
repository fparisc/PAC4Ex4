package edu.uoc.pac4;

public class DiscountCalculator {

    public double calculateDiscount(String clientType, double amount) {
        return switch (clientType) {
            case "Regular" -> amount * 0.1;
            case "Premium" -> amount * 0.2;
            case "VIP" -> amount * 0.3;
            default -> 0;
        };
    }
}
