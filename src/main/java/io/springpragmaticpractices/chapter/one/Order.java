package io.springpragmaticpractices.chapter.one;

import lombok.Getter;

import java.util.List;

@Getter
public class Order {
    private List<Food> foods;
    private double transactionFeePercent = 0.03;
}
