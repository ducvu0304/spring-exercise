package com.example.handleexceptiondemo.innerclass;

public class Demo {
    void show() {
        System.out.println("I am in show method of super class");
    }
}

class FlavorDemo {

    // An anonymous class with Demo as base class
    static Demo d = new Demo() {
        void show () {

            super.show();

            System.out.println("I am in FlavorDemo class");
        }
    };


    public static void main(String[] args) {
        d.show();
    }
}
