import java.util.Scanner;

public class text4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("欢迎进入系统");
        System.out.println("==================");

        System.out.println("请输入账户类型");
//        键盘键入一个值
        String account=sc.next();
        if (!account.equals("1")){
            System.out.println("其他账户");
        }else {
            System.out.println("账户一");
        }

    }
}
