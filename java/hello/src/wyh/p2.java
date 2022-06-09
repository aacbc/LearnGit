package wyh;

public class p2 {
        public static void main(String[] args) {
            int count = 0;
            for ( int i = 100; i <= 200; i++) {
                if (i % 7 == 0 && i % 2 != 0) {
                    count++;
                if (count == 5) {
                        System.out.print(i);
                        break;
                    }
                }
            }
        }


}
