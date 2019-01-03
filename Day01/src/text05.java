import java.util.Scanner;

public class text05 {
    public static void main(String[] args) {
//        定义页大小为5
        int pageSize=5;
        System.out.println("请输入总记录数");

        Scanner sc=new Scanner(System.in);
        int totalRows=sc.nextInt();

        int result=totalRows%pageSize==0?totalRows/pageSize:totalRows/pageSize+1;
        System.out.println("分页数:"+result);
    }
}
