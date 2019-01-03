import java.lang.reflect.Array;
import java.util.Arrays;

//练习一
public class text01 {
    public static void main(String[] args){
//        System.out.println("你好，世界！");

        //System.out.println(Arrays.toString(args));
//    给这个可变数组赋值
//        show(...infos:"a","b","c");

//       不用循环输出一个数组
        String ge[]={"张哥","李哥","王哥"};
        int i=0;
        System.out.println(ge[i++%3]);
        System.out.println(ge[i++%3]);
        System.out.println(ge[i++%3]);
        System.out.println(ge[i++%3]);
        System.out.println(ge[i++%3]);
        System.out.println(ge[i++%3]);

    }

//    这也是一个数组，可变数组
//    static void show(String ...infos){
//        System.out.println(Arrays.toString(infos));
//    }






}
