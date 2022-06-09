package com.liangzi.day;

import java.util.Scanner;

public class day0202 {
    //使用if做考试奖励
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("输入成绩");
//        int score = sc.nextInt();
//        if (score > 90) {
//            System.out.println("奖励一个鸡腿");
//        }else if (score > 80 & score <90) {
//            System.out.println("奖励奖励");
//        }else if (score > 60 & score < 70) {
//            System.out.println("快不及格了，简单批评下");
//        }else {
//            System.out.println("????");
//        }

        //各声明一个年和月，然后输出这个月的天数；
        Scanner sc = new Scanner(System.in);
        System.out.println("输入年月来判断有多少天");
        int year = sc.nextInt();
        int month = sc.nextInt();
        if (month ==1 || month == 3 || month == 5 || month ==7 || month == 8 || month == 10 || month ==12) {
            System.out.println("has 31 day");
        }else if (month ==2) {
            if (year % 4 == 0 & year %100 !=0){
                System.out.println("28");
            }else {
                System.out.println("29天");
            }
        } else if (month == 2 || month == 4 || month ==6 || month ==9 || month == 11) {
            System.out.println("has 30 day");
        }
    }
}
