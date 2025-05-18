package edu.uoc.pac4.discounts;

public class Premium implements Discount {

    @Override
    public boolean appliesTo(String clientType) {
        return "Premium".equalsIgnoreCase(clientType);
    }

    @Override
    public double calculate(double amount) {
        return amount * 0.2;
    }
}
