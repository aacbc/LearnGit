package com.liangzi.day03;

import java.util.Scanner;

public class day03 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++ ) {
            System.out.println(i + "次" + "Hoeing in the paddy under the mid-day sun,Sweat dripping to the soil underneath the plant.");
            System.out.println("Who knows that the meals in our plates,Every morsel of them comes with toil and pains.");
        }

        int i = 1;
        do {
            System.out.println(i + "次" + "Hoeing in the paddy under the mid-day sun,Sweat dripping to the soil underneath the plant.");
            System.out.println("Who knows that the meals in our plates,Every morsel of them comes with toil and pains.");
            i++;
        }while (i <= 10);
    }
}

class dc{
    public static void main(String[] args) {
        //100之和；
        int sum = 0;
        for (int i = 1; i <= 100; i++){
            sum += i;
        }
        System.out.println(sum);

        //while
        sum = 0;
        int i = 1;
        while (i <=100){
           sum += i;
           i ++;
        }
        System.out.println(sum);
    }
}

class ouShuHe{
    public static void main(String[] args) {

        //for；
        int sum =  0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);

        //while 的continue;
        int sum1 =0;
        int i = 1;
        while (i <= 100){
            if (i % 2 != 0){
                i++;//必须在continue上面加上迭代初始化语句，否则不会运行后面的sum1 +=i和I++语句；
                //初始化语句不会变化就陷入了无限循环之中；所以在continue前，初始化语句必须要有变化；
                continue;
            }
            sum1 += i;
            i++;
        }
        System.out.println(sum1);

        //for的continue
         int sum2 = 0;
         for (int i2 = 1; i2 <= 100; i2++){
             if (i2 % 2 != 0){
                 continue;
             }
             sum2 += i2;
         }
        System.out.println(sum2);
    }
}

class PlusContinue{

}

class  Tbreak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//使用Scanner，用键盘录入数字；
        while (true){//死循环输入一个数字；
            System.out.println("input a number");
            int i = sc.nextInt();
            if (i <=60){//当数字小于等于60就会触发break；
                break;
            }else{
                System.out.println("please again");
            }
        }
    }
}

class b1{
    public static void main(String[] args) {
    //判断质数：
        int r = 10;
        for (int i = 2; i < r; i++){
            if (r % i ==0){
                System.out.println(r + " not this one");
                break;
            }
            System.out.println(r +" bingo");
            break;
        }
    }
}

class LoopNest{
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++){
            System.out.println(i);
            for (int i1 = 1; i1 <= 5; i1++){
                System.out.print(i1 +"\t");
            }

        }


        for (int h = 1; h <= 9; h++){//

            for (int l =1; l <= h; l++){//
                System.out.print(l + "*" + h + "=" + h*l + "\t");
            }
            System.out.println();
        }
    }
}