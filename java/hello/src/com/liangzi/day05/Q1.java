package com.liangzi.day05;

import java.util.Scanner;

public class Q1 {
       //数组的追加
       public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
           int[] scores = new int[100];//最多100个成绩
           int size = 0;
           while (true){//使用无限循环录入无限次成绩，无限次受数组长度制约；
               System.out.println("请输第" + (size+1) + "个同学的成绩");
               int  cj = sc.nextInt();
               if (cj == -1){ break; }//如果输入的是非法数字就会break；
               scores[size] = cj;//第size同学的成绩，而且size初始值0，同数组的第一个索引。
                                 //size从0，0即索引的开头，开始，第一个录入的成绩；
               size++;//第一个第二个......的成绩；在循环提示中使用；
           }

           //数组的遍历

       }

    //数组的查找；


}
