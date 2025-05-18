package edu.uoc.pac4.discounts;

public class NoDiscount implements Discount {

    @Override
    public boolean appliesTo(String clientType) {
        return "Regular".equalsIgnoreCase(clientType);
    }

    @Override
    public double calculate(double amount) {
        return 0;
    }
}
