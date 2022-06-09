package com.liangzi.day04Q;

public class Waiter {
    String name;
    int age ;
    int phone;

    //方法；
    public String dc(String name){
        return name;
    }
   }
class Customer{
    String name;
    int age;

    public void eat(String name){
        Waiter w1 = new Waiter();
        String cj = w1.dc("caiji");
        System.out.println(name + "has"+ cj);
    }

}
class Test{
    public static void main(String[] args) {
        Customer waiter = new Customer();
        waiter.eat("菜人");
    }
}
