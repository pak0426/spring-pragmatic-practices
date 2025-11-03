package io.springpragmaticpractices.chapter.one;

import lombok.Getter;

import java.util.List;

@Getter
public class RestaurantChain {
    private List<Store> stores;

    public long calculateRevenue() {
        long revenue = 0;
        for (Store store : stores) {
            revenue += store.calculateRevenue();
        }

        return revenue;
    }

    public long calculateProfit() {
        long income = 0;
        for (Store store : stores) {
            income += store.calculateProfit();
        }

        return income;
    }
}
