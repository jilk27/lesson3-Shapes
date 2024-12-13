package org.example;

public class Circle {
    private float a;

    public Circle(float a) {
        if (a <= 0){
            throw new RuntimeException("There is no figure with such parameters.");
        }else {
            this.a = a;
        }
    }

    public float perim() {
        return 3.14f * 2 * a;
    }

    public float square() {
        return a * a * 3.14f;
    }
}
