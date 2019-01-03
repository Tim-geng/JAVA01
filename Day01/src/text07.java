//画一个正方形
import java.util.Scanner;

public class text07 {
    public static void main(String[] args) {
//        接收用户输入
        Scanner sc=new Scanner(System.in);

//        定义十行
        int size=10;
//        定义计数器
        int i=1;
//        画一个正方形
        while (i<=size){

//            判断横向的
            if (i==1||i==size){
                for (int j = 1; j < size; j++) {
                    System.out.print("O");
                }
            }else {
//                中间部分
                for(int j=1;j<size-1;j++){
                    if (j==1){
                        System.out.print("O");
                    }
                    System.out.print("M");
                }
            }
//            纵向的O
            System.out.println("O");
            i++;
        }



    }
}
