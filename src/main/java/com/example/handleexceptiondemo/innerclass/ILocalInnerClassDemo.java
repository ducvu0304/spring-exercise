package com.example.handleexceptiondemo.innerclass;

public interface ILocalInnerClassDemo {
    void show();

    class Inner implements ILocalInnerClassDemo {

        @Override
        public void show() {
            System.out.println("This is method of the outer interface");
        }
    }
};

class MainInterface {
    public static void main(String[] args) {
        ILocalInnerClassDemo.Inner inner = new ILocalInnerClassDemo.Inner();

        inner.show();
    }
}
