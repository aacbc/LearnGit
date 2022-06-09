package wyh;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class ttttt {
    public static void main(String[] args) {
//        System.out.println("你好\n世界")；
//        System.out.println("你好\nJava");
//        System.out.println("电脑要干净不要乱安装一些垃圾软件，一定要去官网下载");
        //创建Scanner对象，具有具体的格式；
        Scanner input = new Scanner(System.in);
        //Scanner didi = new Scanner(System.in);这里中的“input 和 didi 是可以随意改变的”，
        //这里的都是变量。
        System.out.println("请输入您的姓名，然后我就会知道您的姓名/笑哭");
        String name = input.next();
        //String name = didi.next();
        System.out.println("您的姓名是："  + name);
        double num1 = 10.666;
        int num2 = (int)num1;
        System.out.println(num1);

        int havehouse = 1;
        //三元表达式： 表达式 ？ 这 ： 那；
        String result = (havehouse == 1) ? "牵手成功" : "再来一次";
        System.out.println(result);

        double r = 2;//定义圆的半径R 且赋值为2；
        final double PAI = 3.14;
        //定义变量存储Π
        //被final修饰的变量叫做常量；
        //final double pai = 3.14;
        double area2 = PAI*r*r;
        //定义面积变量并且用公式计算面积，且赋值给定义的变量；
        System.out.println("这是面积" + area2);//输出sout；

        ArrayList <Integer> list = new ArrayList<>();
        Random ra = new Random();
        for (int i =0; i < 20; i++) {
            int i1 = ra.nextInt (100);
            list.add(i1);
        }
        for(int i = 0; i < list.size(); i++) {
            int score = list.get(i);
            if (score <  80) {
                list.remove(i);
                i--;
            }
            System.out.println(list);
        }



















    }
}
