package io.springpragmaticpractices.chapter.four.one;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Rectangle {

    protected long width;
    protected long height;

    public long calculateArea() {
        return width * height;
    }
}
