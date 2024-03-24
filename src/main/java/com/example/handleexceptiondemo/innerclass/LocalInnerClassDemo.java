package com.example.handleexceptiondemo.innerclass;

public class LocalInnerClassDemo {

    private int outerVariable;

    public LocalInnerClassDemo() {
    }

    public LocalInnerClassDemo(int outerVariable) {
        this.outerVariable = outerVariable;
    }

    void outerMethod() {
        int x = 98;
        System.out.println("Outer method");

        class Inner {

            public Inner() {
            }

            void innerMethod() {
                System.out.println("Inner method");
                System.out.println("Accessing a variable of outer method : " + x);
            }
        }

        Inner inner = new Inner();
        inner.innerMethod();
    }
}

class GFG{
    public static void main(String[] args) {
        LocalInnerClassDemo outer = new LocalInnerClassDemo();
        outer.outerMethod();
    }
}



