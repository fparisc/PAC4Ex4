package edu.uoc.pac4;

public interface Discount {
    boolean appliesTo(String clientType);
    double calculate(double amount);
}
