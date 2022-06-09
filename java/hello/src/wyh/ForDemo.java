package wyh;

public class ForDemo {
    public static void main(String[] args) {
        //1-5的和；
        //for循环；
        int sum = 0,number = 1;
        for (number = 1; number <=5; number++) {
            sum += number;
        }
        System.out.println("1-5的和：" + sum);

        //1-100的偶数和；
        //for循环；
        int he = 0, n1 = 1;
        for (n1 = 1; n1 <= 100; n1++) {
           if (n1 % 2 == 0) {
               he += n1;
           }
        }
        System.out.println("1-100的偶数和：" + he);
        int narsum = 0;
        //水仙花数目的输出；
        int narcissus = 100;
        for (narcissus = 100; narcissus <= 999; narcissus++) {
         int a = narcissus / 100 ;
         int b = narcissus / 10 %10;
         int c = narcissus %10 ;
            if (narcissus == a*a*a + b*b*b +c*c*c) {
                narsum += 1;
            }
        }
        System.out.println("水仙花个数有" + narsum + "个");
    }
}
