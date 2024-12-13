package org.example;

public class Tringle {
    private float a;
    private float b;
    private float c;

    public Tringle(float a, float b, float c) {
        if (a <= 0 || b <= 0 || c <= 0 || (c + a) <= b || (c+b) <= a || (a+b) <= c){
            throw new RuntimeException("There is no figure with such parameters.");
        }else {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }

    public float perim() {
        return (a + b + c);
    }

    public double square() {
        float p;
        double s;
        p = (a + b + c)/2;
        s = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return s;
    }
}
