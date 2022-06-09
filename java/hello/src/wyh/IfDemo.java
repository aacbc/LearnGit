package wyh;
//if 适合做区间的值
//switch适合做某一确定值的执行；
//switch具有穿透性；
import java.util.Scanner;

public class IfDemo {
    public static void main(String[] args) {
        int a = 10, b = 20;
//        b = 5;
        if (a > b) {
            System.out.println("greater than");
        } else {
            System.out.println("not greater than");
        }
        System.out.println("end");

        //使用if else
        //判断奇偶并输出结果；
//       Scanner sc = new Scanner(System.in);
//        System.out.println("请输入一个整数，我将会自动判断其奇偶并输出结果");
//        int number = sc.nextInt();
//        if (number % 2 == 0) {
//            System.out.println("是偶数" + number);
//        } else {
//            System.out.println("是奇数" + number);
//        }

        //使用 if else的多重嵌套语句；
        //判断1-7为星期几并输出；
/*        Scanner sc = new Scanner(System.in);
        System.out.println("请输入1-7,我会判断是周几并展示结果给你看。");
        int weekday = sc.nextInt();
        if (weekday == 1) {
            System.out.println("你输入的数字代表周一，听说周一被后裔射熄火了");
        }else if (weekday == 2){
            System.out.println("周二");
        }else if (weekday == 3) {
            System.out.println("周三");
        }else if (weekday == 4) {
            System.out.println("周四");
        }else if (weekday == 5) {
            System.out.println("周五");
        }else if (weekday == 6) {
            System.out.println("周六");
        }else if (weekday == 7) {
            System.out.println("周日");
        }else {
            System.out.println("请”亲亲“输入1-7这里才好做出正确的判断呢！");
        }
*/
        //switch () {}
        //判断输入的年份是哪个季节；
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入任意月份，我来告诉你属于哪个季节");
        int month = sc.nextInt();
       switch (month) {
           case 1:
            case 2:
            case 12:
                System.out.println("Winter");
            break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Autumn");
            default:
                System.out.println("请输入正确的月份");
                break;
        }

    }
}
