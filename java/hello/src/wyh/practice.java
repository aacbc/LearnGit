package wyh;

public class practice {
    public static void main(String[] args) {
        char ch1 ='a';
        System.out.println(ch1 + 1);

        char ch2 = 'A';
        System.out.println(ch2 + 1);

        char ch3 = '0';
        System.out.println(ch3 + 1);

        //表达式子类型自动提升；
        int num1 = 10;
        double num2 = 11.11;
        double num = num1 + num2;//使用double接收结果，表达式中num2是double，类型自动提升；
        System.out.println(num);

        //当使用“+”时候，出现了字符串，此后“+”表示的是“连接符”而不是“算术运算符";
        System.out.println("加号是连接符，连接字符串和后面的"+ 666);
        //字符产出现前的”+“是”算数运算符“，字符串出现后的”+“是”连接符“；
        System.out.println(1 + 2 +"多个+时候，从左至右运算" + 3 + 4);
        System.out.println(1 + 99 + "是多少");
        System.out.println(1 + 2 + "加个小阔号使运算提前" +( 3 + 4 ));

        //扩展的赋值运算符隐含了强制类型转换；
        short s = 10;
        s += 10;//相当于s = (short)s + 10;
        System.out.println(s);

        //自增运算符；
        //当自增运算符参与操作时，其在变量前，则先自增 或者自减，再参与操作；
        //当自增运算符参与运算时，其在变量后，则先参与操作，在变量自增或自减；
        int a = 10;
        int b = ++a;
        System.out.println("a:" + a + "b:" + b);
        int c = b++;
        System.out.println("c:" + c + "b:" + b );
        int d = c + b + a;
        System.out.println("d:" + d);
        int x = 11;
        int y = x++ + x-- + x;
        System.out.println("y:" + y);
        //
        int e = 10;
        int f = 20;
        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a >= b);
        System.out.println(s <= b);
        //关系运算符的结果是Boolean类型的值，所以其值可以赋值给Boolean的变量；
        boolean b1 = e < f;
        System.out.println(b1);
        System.out.println("。。。");

        //逻辑运算符：&；|；^；！：逻辑与；逻辑或；逻辑异或；逻辑非；
        int i = 10 , j = 20 , k = 30;
        //逻辑与的应用；全对则对；
        System.out.println((i > j) & (i > k));
        System.out.println((i < j) & (i < k));
        System.out.println((i > j) & (i < k));
        System.out.println((i < j) & (i > k));
        //逻辑或的应用，只要有对则对；
        System.out.println((i > j) & (i > k));
        System.out.println((i < j) & (i < k));
        System.out.println((i > j) & (i < k));
        System.out.println((i < j) & (i > k));
        System.out.println("------");
        //逻辑异或；相同为对，不同为错；
        System.out.println((i > j) & (i > k));
        System.out.println((i < j) & (i < k));
        System.out.println((i > j) & (i < k));
        System.out.println((i < j) & (i > k));
        System.out.println("-------");
        //逻辑非；取相反值；
        System.out.println((i > j));
        System.out.println(!(i > j));
        System.out.println("。。。");

        //短逻辑运算符：&&；||：短路与；短路或；
        //&&短路与：左边为真 → 则右边继续执行；左边为假则右边不执行；
        //||短路或：左边为假 → 则右边继续执行；左边为真则右边不执行；
        int g = 2 , h = 1;
        System.out.println((g++ >= 3) && (h++ >= 2));
        System.out.println("g:" + g);
        System.out.println("h:" + h);
        System.out.println("------");
        System.out.println(!(g++ > 3) ||(h++ >2));
        System.out.println("g:" + g);
        System.out.println("---l---");

        //三元运算符：关系表达式1 ？ 表达式1 ： 表达式2；
        int v = 1 , t = 2 ;
        System.out.println((v > t ? v : t));

    }


}
