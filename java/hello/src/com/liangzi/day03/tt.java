package com.liangzi.day03;

import java.util.Scanner;

public class tt {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
        System.out.println("填俩数");
    int i2 = sc.nextInt();
    int i1 = sc.nextInt();
    int count = 0;
        for (int i = 1;i <= i1 || i <=i2;i++){
        if (i1 % i == 0 & i2 % i==0){//i1和i2对i进行求余；
            count = i;
        }
    }
System.out.println("最大公约数：" + count);
}
}
class bb{
    public static void main(String[] args) {
        //最小公倍数
        Scanner sc = new Scanner(System.in);
        System.out.println("输入俩数字");
        int i2 = sc.nextInt();
        int i1 = sc.nextInt();

    }
}
