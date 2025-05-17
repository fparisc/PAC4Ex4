package edu.uoc.pac4;

import java.util.List;

public class DiscountCalculator {

    private final List<Discount> discounts;

    public DiscountCalculator() {
        this.discounts = List.of(
                new Vip(),
                new Premium(),
                new Regular(),
                new NoDiscount()
        );
    }

    public double calculateDiscount(String clientType, double amount) {
        return discounts.stream()
                .filter(s -> s.appliesTo(clientType))
                .findFirst()
                .orElse(new NoDiscount())
                .calculate(amount);
    }
}
