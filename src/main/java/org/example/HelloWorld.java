package org.example;

import org.springframework.beans.factory.annotation.Autowired;

public class HelloWorld implements Hello{
    @Override
    public void hello() {
        System.out.println("Hello world");
    }
}
