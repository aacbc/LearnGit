package com.liangzi.day03;

import java.util.Scanner;

public class practices {
    public static void main(String[] args) {
        int i;
        for (i = 1; i <= 100; i++ ){
            if (i % 2 !=0){
                System.out.println("奇数" +i);
            }else {
                System.out.println(i);
            }
        }
    }
}

class $99{
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i ++){
            for (int j = 1 ; j <= i; j++){
                //System.out.println(i);
                System.out.println(j);
               // System.out.print(j + "*" + i +"=" + i*j + "\t");
            }
            System.out.println();//不输入内容表示换行；i=1-9换了九次行；
        }
    }

}

class nircissus{
    public static void main(String[] args) {
       int ii,a,b,c;
       for (ii = 100; ii <= 999; ii++){
            a = ii / 100;
            b = ii /10 % 10;
            c = ii % 100;
           if ( ii == a*a*a + b*b*b + c*c*c){
               System.out.println(ii);
           }
       }
        System.out.println(ii);
    }

}