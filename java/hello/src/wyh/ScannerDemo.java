package wyh;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的年龄：");
        int age = sc.nextInt();
        System.out.println("您的年龄是" + age);
        System.out.println("请输入您的名字");
        String name = sc.next();
        System.out.println("您的名字是" + name);
    }
}
