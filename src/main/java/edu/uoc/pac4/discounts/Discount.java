package edu.uoc.pac4.discounts;

public interface Discount {
    boolean appliesTo(String clientType);
    double calculate(double amount);
}
