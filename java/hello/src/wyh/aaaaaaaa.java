package wyh;

public class aaaaaaaa {
    String name;
    public  static int tickets = 10;
    public  boolean sale(){
        if (tickets > 0){
            tickets--;
            System.out.println(name + "出售一，余：" +tickets);
            return true;
        }else {
            System.out.println(name + "票不足");
            return false;
        }
    }

    public static void main(String[] args) {
        aaaaaaaa saler1 = new aaaaaaaa();saler1.name= "张";
        aaaaaaaa saler2 = new aaaaaaaa();saler2.name= "wang";
        aaaaaaaa saler3 = new aaaaaaaa();saler3.name= "zhao";
        while (true){
            boolean state1 = saler1.sale();
            if (state1 == false)break;
            boolean state2 = saler2.sale();
            if (state2 = false)break;
            boolean state3 =saler3.sale();
            if (state3 = false)break;
        }
    }
}
class aa{

}