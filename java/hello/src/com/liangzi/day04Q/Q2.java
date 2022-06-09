package com.liangzi.day04Q;

import javax.naming.Name;

    /*
    定义一个人类Person。 该类中应该有两个私有属性： 姓名 (name) 和年龄 (age) ，定义显示(display()) 方法将姓名和年龄打印出来。
    在 main 方法中创建人类的实例然后将信息显示
     */

 class person {
        String name;
         int age;


        public void display(String name,int age) {
            System.out.println("姓名" + name);
            System.out.println("年龄" + age);
        }

        public static void main(String[] args) {
            person bb = new person();
            bb.display("jj", 18);
        }
    }
