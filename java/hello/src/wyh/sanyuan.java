package wyh;
import java.util.Scanner;
public class sanyuan {
    public static void main(String[] args) {
        int tiger1 = 180, tiger2 = 200;
        //System.out.println((tiger1 == tiger2) ? true :false);
        //三元运算符输出的结果为Boolean类型，所以算远运算符的结果可以复制给Boolean定义的变量；
        boolean weight = (tiger1 ==tiger2) ? true : false;
        System.out.println(weight);
        System.out.println("------");

        int h1 = 150, h2 = 210, h3 = 165;
        int maxh = (h1 > h2) ? h1 : h2;
        System.out.println("最高的身高数据是：" + (maxh > h3 ? maxh : h3) );


        Scanner sc = new Scanner(System.in);
        System.out.println("请输入分数以开始");
        int score = sc.nextInt();
        System.out.println("分数为" + score);
        if (score < 60 & score >0){
            System.out.println("这个时候应该找孩子谈谈心，找到原因并解决问题");
    }else if (score >60 & score <70) {
            System.out.println("鼓励孩子还可以做的更好，并承诺下次进步就会得到更大的奖励");
        }else if (score > 70 & score <80) {
            System.out.println("肯定孩子的成就，奖励孩子，询问孩子下次想要什么");
        }else if (score > 80 & score < 90) {
            System.out.println("奖励孩子，比如游乐场");
        }else if (score > 90 & score <= 100) {
            System.out.println("天才啊，询问孩子自己的想法");
        }else if (score < 0 | score >100){
            System.out.println("错误的分数");
        }
    }
}
