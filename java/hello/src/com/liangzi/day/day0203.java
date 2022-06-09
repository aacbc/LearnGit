package com.liangzi.day;

import java.util.Scanner;

public class day0203 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("input scores");
//        int score = sc.nextInt();
//        switch (score / 10) {
//            case 0, 1, 2, 3 -> System.out.println(score + "worse");
//            case 4, 5 -> System.out.println(score + "worst");
//            case 6, 7, 8, 9 -> System.out.println(score + "good");
//            default -> System.out.println(score + "default");
//        }
        int a = 600 ;int b = 600;
        if (a % b == 0 || a + b > 1000) {
            System.out.println(a);
        }else {
            System.out.println(b);
        }

        int n1 = 5;
        switch(n1){
            case 1:
                System.out.println("dad");
                break;
            case 2:
                System.out.println("mom");
                break;
            case 3:
                System.out.println("grandpa");
                break;
            case 4:
                System.out.println("grandma");
                break;
            default:
                System.out.println("wrong:" + n1);
                break;
        }
        System.out.println("-------------------");

        double sum;
        int m1 = 10000;
        if (m1 >= 10000) {
            double b1 = (m1 - 10000) * 0.05;

            double b2 = 5000 * 0.03;
            double b3 = 4000*0.02;
            sum = b1 + b2 + b3;
            System.out.println(m1);
            System.out.println(sum);
        }else if (m1 < 10000) {

        }else if (m1 <= 5000){
           double b5 =(m1 - 1000) * 0.02;
            System.out.println(b5);
        }

        //12
        int x1 = 1,x2 = 2, x3 = 3;
        int max = 0,min =10;
        if (x1 > max){
            max = x1;
        }
        if (x2 > x1) {
           max = x2;
        }
        if (x3 > x2){
            max = x3;
        }
        System.out.println(max);
        if (x1 < min){
            min = x1;
        }
        if (x2 < x1) {
            min = x2;
        }if (x3 < x2){
            min = x3;
        }
        System.out.println(min);
    }
}

class ttt{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入工龄");
        int year = sc.nextInt();
        System.out.println("输入基本工资");
        int salary = sc.nextInt();
        int newsalary = 0;
        if (year >= 10 & year <= 15) {
            newsalary = salary + 5000;
            System.out.println("工资：" + newsalary);
        }

class ttu {
    public static void main(String[] args) {
        int x1 = 1, x2 = 2, x3 = 3;
        int max =0;int min = 10;
        if (x1 > max) {
            max = x1;
        }
        if (x2 > max) {
            max = x2;
        }
        if (x3 > max){
            max = x3;
        }
        System.out.println(max);
        if (x1 < min){
            x1 = min;
        }
        if (x2 < min){
            x2 = min;
        }if (x3 < min){
            x3 = min;
        }
        System.out.println(min);
    }
}












    }
}