package org.example;

public class Rectangle {
    private float a;
    private float b;

    public Rectangle(float a, float b) {
        if (a <= 0 || b <= 0){
            throw new RuntimeException("There is no figure with such parameters.");
        }else {
            this.a = a;
            this.b = b;
        }
    }

    public float perim() {
        return (a + b)*2;
    }

    public float square() {
        return a * b;
    }
}
