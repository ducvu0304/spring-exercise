package com.example.handleexceptiondemo.innerclass;

public class AnonymousClassDemo {
    void show() {
        System.out.println("Outer Method");
    }
}

class AnonymousClassDemoMain {
    public static void main(String[] args) {
        AnonymousClassDemo inner =  new AnonymousClassDemo() {
           void show() {
                super.show();
           }
        };

        inner.show();
    }
}
