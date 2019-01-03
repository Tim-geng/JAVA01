import java.util.Scanner;

public class text03 {
    public static void main(String[] args) {

//        接收用户输入Scanner
        Scanner sc=new Scanner(System.in);

        System.out.println("欢迎进入系统.");
        System.out.println("请输入姓名.");
        String name=sc.next();
        System.out.println("请输入密码.");
        String pwd=sc.next();

//        比较纯粹的值得时候用equals
        System.out.println(name.equals("tom"));
        System.out.println(pwd.equals("123"));
//        联合判断
        System.out.println(name.equals("tom")&&pwd.equals("123"));

    }
}
