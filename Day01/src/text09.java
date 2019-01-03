import java.util.Arrays;

//把传地址改为传值
public class text09 {
    public static void main(String[] args) {
//        定义数组a,给其赋值
        int a[]={1,2,3,4,5};
//        定义数组b,让其占位
        int b[]=new int[5];
//        循环,把数组a值赋值给数组b
        for (int i=0;i<a.length;i++){
            b[i]=a[i];
        }
        b[0]=10;
        System.out.println(a[0]);


//        数组拷贝第二种方法
        int c[]={1,2,3,4,5};
        int d[]=new int[5];

        System.arraycopy(c,0,d,0,a.length);
        int e[]=Arrays.copyOf(a,10);
        System.out.println(Arrays.toString(e));
    }
}
