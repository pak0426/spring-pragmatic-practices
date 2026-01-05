package io.springpragmaticpractices.chapter.four.one;

public class Square2 extends Rectangle {

    public Square2(long length) {
        super(length, length);
    }

    @Override
    public void setWidth(long width) {
        super.width = width;
        super.height = width;
    }

    @Override
    public void setHeight(long height) {
        super.width = width;
        super.height = width;
    }
}
