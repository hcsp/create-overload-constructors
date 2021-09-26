package com.github.hcsp;

import com.github.hcsp.pet.Cat;

public class Home {
    public static void main(String[] args) {
        // Create two constructor in Cat.java: Cat() and Cat(String name)
        // 在Cat.java中创建两个构造器：Cat()和Cat(String name)
        System.out.println(new Cat("Black"));

        Cat white = new Cat();
        white.name = "White";
        System.out.println(white);
    }
}

