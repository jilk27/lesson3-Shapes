package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.printf("Hello and welcome!\n");
        Tringle f = new Tringle(10f, 8f, 5f);
        System.out.println(f.perim());
        System.out.println(f.square());
    }
}