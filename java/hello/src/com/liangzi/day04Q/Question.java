package com.liangzi.day04Q;

import java.util.Scanner;

class Question {
    /*
    定义一个计算类：包含方法：
    加（接收参数num1和num2）{
    返回两数之和
   }
   减（接收参数num1和num2）{
   返回两数之差
   }
*/

//计算和；；；；；；方法
    public void add(double num1,double num2){
        System.out.println(num1 + num2);
    }

    //差;;;;方法
    public  void subtraction(double num1,double num2){
        System.out.println(num1 - num2);
    }

    public void calc(){
        Scanner sc = new Scanner(System.in);
        System.out.println("第一个数字");
        double num1 = sc.nextDouble();
        System.out.println("第二个数字");
        double num2 = sc.nextDouble();
        System.out.println("选择+ -");
        char op =sc.next().charAt(0);///Scanner中char用法；
        switch (op){
            case '+':
                add(num1,num2);
                break;
            case '-':
                subtraction(num1,num2);
                break;
            default:
                System.out.println("不符合本程序");
                break;
        }
    }

    public static void main(String[] args) {
        Question q = new Question();
        q.calc();
    }
}
