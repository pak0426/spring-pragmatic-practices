package io.springpragmaticpractices.chapter.one;

import lombok.Getter;

import java.util.List;

@Getter
public class Order {
    private List<Food> foods;
    private double transactionFeePercent = 0.03;

    public long calculateRevenue() {
        long revenue = 0;
        for (Food food : foods) {
            revenue = food.calculateRevenue();
        }
        return revenue;
    }

    public long calculateProfit() {
        long income = 0;
        for (Food food : foods) {
            income += food.calculateProfit();
        }
        return (long) (income - calculateRevenue() * transactionFeePercent);
    }
}
