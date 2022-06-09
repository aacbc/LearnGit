package wyh;

import java.util.Random;
import java.util.Scanner;

public class RandomDemo {
    public static void main(String[] args) {

        //使用for循环获取10个随机数；
        /*      Random r = new Random();
        int count = 0;
        System.out.println("接下来将会出现10个随机数");
        for (int i = 0; i < 10; i++) {
            int number = r.nextInt(10);
            count++;
            System.out.println("number:" + number);
            if (count == 10) {
                System.out.println("已经有10个数字了");
            }
        }

        //获取一个随机数
        int x = r.nextInt(100) + 1;
        System.out.println(x);
*/
        //猜数字游戏；
        Random r = new Random();
        int rnumber = r.nextInt(100) +1;
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入一个1-100的整数数字");
            int number = sc.nextInt();
            if (number < rnumber) {
                System.out.println("请向大的数字猜");
            break;
            }else if (number > rnumber) {
                System.out.println("请向小的数字猜");
                break;
            }else {
                System.out.println("Bingo");
                break;
            }
        }

    }
}