package com.liangzi.day;

import java.util.Scanner;

public class day02 {
    public static void main(String[] args) {
        int r1 = 10;
        int r2 = ++r1;
        int r3 = r2++;
        int r4 = r3++;
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
        System.out.println("___________________");

        boolean s1 = 1 > 2;
        boolean s2 = 2 == 2;
        boolean s3 = 1 > 2 && 2 == 2;
        boolean s4 = 1 > 2 || 2 == 2;
        System.out.println(s3);
        System.out.println(s4);
        boolean s5 = 1 > 2 && 2/0 == 1;
        System.out.println("s5:" + s5);
        boolean s7 = 1 < 2 || 2/0 == 1;
        System.out.println("s7:" + s7);
        System.out.println(!(1 > 2));
        System.out.println(true || false);
        System.out.println("________________________");

        //第一题
        int a = 3; int b = 2;
//        int result = (a++) * (--b) + (--a) / (b++);
//        System.out.println(result);
//        System.out.println("______________________");
//
//        //第二题
//        int result2 = (--a) % (b++) + (++a) * (b--) - (a--);
//        System.out.println(result2);
//        System.out.println("-----------------------");
//
//        //第三题
//        System.out.println((a++)/3 + (b--) *2 - (a--) % 6 + (b++) * 3 - (b--));
//        System.out.println("---------------------------");

        //第四题
        System.out.println((++b) *2 - (a++) % 4 + (a++) *5 -(b--) /2 + (--a));
        System.out.println("============================");
        //3 * 2 - 4 % 4 + 4 * 5 - 1 / 2 + 2;
        //6 - 0 + 20 - 0 + 2

        //第八题
        Scanner sc = new Scanner(System.in);
        System.out.println("输入数字：");
        int ab = sc.nextInt();
        if (ab % 2 == 0) {
            System.out.println(ab + "偶数");
        }else {
            System.out.println("no");
        }

        //第九题输入三个数判断第三个数是否为前俩数字的公倍数或公因数，输出true或false；
        // 使用Scanner，定义三个数，定义布尔，判断是否公倍数或公因数，输出布尔；
        Scanner nine = new Scanner(System.in);
        System.out.println("填仨数字");
        int jj = nine.nextInt();
        int gg = nine.nextInt();
        int vv = nine.nextInt();






    }


}
