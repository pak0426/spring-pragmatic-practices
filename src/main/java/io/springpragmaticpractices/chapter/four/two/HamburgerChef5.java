package io.springpragmaticpractices.chapter.four.two;

import io.springpragmaticpractices.chapter.one.one.Food;

public class HamburgerChef5 {

    public Food make(Bread bread, Vegetable vegetable, Sauce sauce) {
        Meat meat = new BeefMeat();
        return Hamburger.builder()
                .bread(bread)
                .meat(meat)
                .vegetable(vegetable)
                .sauce(sauce)
                .bulid();
    }
}
