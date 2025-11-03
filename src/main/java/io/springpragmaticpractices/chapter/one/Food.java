package io.springpragmaticpractices.chapter.one;

import lombok.Getter;

@Getter
public class Food {
    private long price;
    private long originCost;

    public long calculateRevenue() {
        return price;
    }

    public long calculateProfit() {
        return price - originCost;
    }
}
