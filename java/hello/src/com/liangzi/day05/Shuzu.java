package com.liangzi.day05;

public class Shuzu {
    //数组的基本形式；
    //数据类型 变量名（）【】 = new 数据类型【】 {}；
    //数据类型 变量名 [] = {};;;;;;[]这个是数组的标识；
    public static void main(String[] args) {
        //常用形式；
     double[]  dd = {1.1,2.2};
        System.out.println(dd[1]);

        //基本形式
        float [] f1 = new float[2];
        System.out.println(f1[1]);
    }
}

class student{
    String name;
    int age;

    public student(String name,int age) {
        this.name = name;
        this.age = age;
    }

    public void instro(){}
    public void instr(String name,int age){
        System.out.println("is" + name + "and" + age);
    }
}
class dd{
    public static void main(String[] args) {
        student [] s = new student[5];
        s[0] = new student("zz",18);
        student s1 = s[0];
        s1.instro();
    }
}
