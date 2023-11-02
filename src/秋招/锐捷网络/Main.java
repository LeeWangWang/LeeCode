package 秋招.锐捷网络;

/**
 * @ClassName: Main
 * @Description:
 * @Author: lww
 * @Date: 11/2/23 6:40 PM
 * @Version: V1
 **/
public class Main {
    public static void main(String[] args) {
        Man lee = new Man();
        lee.work();
        lee.eat();
        lee.sleep();
    }
}

class Person {
    private String name;
    private int age;
    private String sex;

    final public void work(){ // final 修饰的最终方法 可以被子类继承，但不能被重写
        System.out.println("a person can do work");
    }

    final public void work(int age){ //重载一个final类
        System.out.println("a person can do another work");
    }

    public void eat(){   //普通方法  可以被子类继承、重写
        System.out.println("a person need to eat");
    }

    public void sleep(){  //静态方法  可以被继承
        System.out.println("a person need to sleep");
    }
}


class Man extends Person{

    public void eat(){
        System.out.println("the man also need do eat");
    }

    public void sleep(){
        System.out.println("the man also need to sleep");
    }

}


