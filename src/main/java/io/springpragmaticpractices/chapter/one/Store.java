package io.springpragmaticpractices.chapter.one;

import lombok.Getter;

import java.util.List;

@Getter
public class Store {
    private List<Order> orders;
    private long rentalFee;
}
