package com.kodilla.patterns2.proxy;

public class ProxySubject implements Subject{

    public RealSubject realSubject;
    // realSubject getter and setter


    @Override
    public void Foo() {
        realSubject.Foo();

    }
}
