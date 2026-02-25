package io.springpragmaticpractices.chapter.four.two;

import io.springpragmaticpractices.chapter.one.one.Food;

public class HamburgerChef {

    public Food make() {
        Bread bread = new WheatBread();
        Meat meat = new Beef();
        Vegetable vegetable = new Lettuce();
        Sauce sauce = new TomatoSauce();
        return Hamburger.builder()
                .bread(bread)
                .meat(meat)
                .vegetable(vegetable)
                .sauce(sauce)
                .bulid();
    }
}
