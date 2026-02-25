package io.springpragmaticpractices.chapter.four.two;

import io.springpragmaticpractices.chapter.one.one.Food;

public class HamburgerChef2 {

    public Food make(Bread bread, Meat meat, Vegetable vegetable, Sauce sauce) {
        return Hamburger.builder()
                .bread(bread)
                .meat(meat)
                .vegetable(vegetable)
                .sauce(sauce)
                .bulid();
    }
}
