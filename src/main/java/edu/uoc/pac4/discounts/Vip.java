package edu.uoc.pac4.discounts;

public class Vip implements Discount {

    @Override
    public boolean appliesTo(String clientType) {
        return "VIP".equalsIgnoreCase(clientType);
    }

    @Override
    public double calculate(double amount) {
        return amount * 0.3;
    }
}
