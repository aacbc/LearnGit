package com.liangzi.day03;

import java.util.Scanner;

public class question {
    public static void main(String[] args) {
        double i = 5;
        int count = 0;
        while (i >= 0.1){
            count++;
            i *= 0.3;
        }
        System.out.println(count);
    }
}

class zhishu{
    public static void main(String[] args) {
        for (int i = 2;i <= 1000; i++){
            boolean result = true;//为甚么要假设这句话？因为后面有个if需要用到result，这里就是个变量，可以随意设置只要和后面的俩result等于什么各自对应；
            for (int n = 2; n < i; n++){

                if (i % n == 0){//i会一直对你进行取余从2开始，然后是3、4、5、
                                //第一个循环中的i没变一个数字，都要从n=2 时来进行取余；
                    result = false;//为什么这行不可以删去；
                                   //如果这行删去，那么result就一直是true了；
                    break;
                }

            }
            if (result == true){
                System.out.println(i +":" + result);
            }

        }
    }
}

class GongBeiShu{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("填俩数");
        int i2 = sc.nextInt();
        int i1 = sc.nextInt();
        int count = 0;
        for (int i = 1;i <= i1 || i <=i2;i++){
            if (i1 % i == 0 & i2 % i==0){
                count = i;
            }

        }
        System.out.println("最大公约数：" + count);
    }
}