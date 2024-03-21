package com.example.handleexceptiondemo.innerclass;

public class StaticNestedClassDemo {

    private static void outerStaticMethod() {
        System.out.println("Outer Static Method");
    }

    // Static nested class are not technically inner class.
    // They are like a static member of outer class
    static class Inner {
        public static void innerStaticMethod() {
            outerStaticMethod();
            System.out.println("Inner Static Method");
        }
    }
}

class StaticNestedMain {
    public static void main(String[] args) {
        StaticNestedClassDemo.Inner.innerStaticMethod();
    }
}
