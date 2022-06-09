package wyh;

public class whileDemo {
    public static void main(String[] args) {
        //对比for 和 while 循环；
        //for
        int i = 1;
        for (i = 1; i <= 5; i++) {
            System.out.println("Hello Word");
        }
        System.out.println("------");

        //while 循环；
        int a = 1;
        while (a <= 5) {
            System.out.println("Hello Word");
            a++;
        }
        System.out.println("------");

        //while循环求珠穆朗玛峰的高度用纸循环折叠出来；
        int count = 0;
        double paper = 0.1;
        double zf = 88444330;
        while (paper <= zf) {
            paper *= 2;
            count++;
        }
        System.out.println("这么多次数:" + count);

        //打印1-100 所有的偶数；
        int oshu = 1;
        int ct = 0;
        while (oshu <= 100) {
            if (oshu % 2 == 0) {
                ct++;
            }
            oshu++;
        }
        System.out.println("多少个偶数" + ct);

        //do....while 的案例；
        //输出三次”Hello Word“
        int dint =1;
        do {
            System.out.println("Hello Word");
            dint++;
        }while (dint <= 3);
    }
}
