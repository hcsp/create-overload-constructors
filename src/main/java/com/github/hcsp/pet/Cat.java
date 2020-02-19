package com.github.hcsp.pet;

public class Cat {
    public String name;

    // Create two constructor here: Cat() and Cat(String name)
    // 在这里创建两个构造器：Cat()和Cat(String name)
    public   Cat(){  //此方法不传参数

    }
   public  Cat(String name){  //此方法传递一个name参数
    this.name=name;  //获取到传过来的参数 赋值给本类name变量
   }
    @Override
    public String toString() {
        return "Cat(" + name + ")";
    }
}
