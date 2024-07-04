package com.github.hcsp.pet;

public class Cat {
    public String name;

    // Create two constructor here: Cat() and Cat(String name)
    // 在这里创建两个构造器：Cat()和Cat(String name)
    public Cat() {}
    public Cat(String s) {
        this.name = s;
    }
    @Override
    public String toString() {
        return "Cat(" + name + ")";
    }
}
