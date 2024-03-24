package com.example.handleexceptiondemo.innerclass;

public class MemberInnerClassDemo {

    private int number;

    public MemberInnerClassDemo() {
    }

    public MemberInnerClassDemo(int number) {
        this.number = number;
    }

    static void staticMethod() {
        System.out.println("This is a static method");
    }

    class Inner {
        public void show() {
            staticMethod();
            System.out.println("In a nested class method");
            System.out.println("The private variable of outer class: " + number);
        }
    }
}


class Main {
    public static void main(String[] args) {
        MemberInnerClassDemo outer = new MemberInnerClassDemo(10);

        MemberInnerClassDemo.Inner inner = outer.new Inner();

        inner.show();
    }
}
