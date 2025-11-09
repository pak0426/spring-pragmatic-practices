package io.springpragmaticpractices.chapter.three.one;

public class CarB {

    private int degree;

    public void drive() {}
    public float changeDirection(int amount) {
        float result = (degree + amount) % 360;
        if (result < 0) {
            result += 360;
        }
        return result;
    }
    public void accelerate(float speed) {}
    public void decelerate(float speed) {}
}
