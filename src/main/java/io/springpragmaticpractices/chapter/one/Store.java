package io.springpragmaticpractices.chapter.one;

import lombok.Getter;

import java.util.List;

@Getter
public class Store {
    private List<Order> orders;
    private long rentalFee;

    public long calculateRevenue() {
        long revenue = 0;
        for (Order order : orders) {
            revenue += order.calculateRevenue();
        }
        return revenue;
    }

    public long calculateProfit() {
        long income = 0;
        for (Order order : orders) {
            income += order.calculateProfit();
        }
        return income;
    }
}
