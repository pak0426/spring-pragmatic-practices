package io.springpragmaticpractices.chapter.four.two;

import io.springpragmaticpractices.chapter.one.one.Food;
import lombok.Setter;

@Setter
public class HamburgerChef4 {

    private Bread bread;
    private Meat meat;
    private Vegetable vegetable;
    private Sauce sauce;

    public HamburgerChef4(Bread bread, Meat meat, Vegetable vegetable, Sauce sauce) {
        this.bread = bread;
        this.meat = meat;
        this.vegetable = vegetable;
        this.sauce = sauce;
    }

    public Food make() {
        return Hamburger.builder()
                .bread(bread)
                .meat(meat)
                .vegetable(vegetable)
                .sauce(sauce)
                .bulid();
    }
}
