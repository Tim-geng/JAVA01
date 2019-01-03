//100买100只鸡
public class text08 {
//    公鸡:5,母鸡:3,小鸡:1/3
    public static void main(String[] args) {

        for (int x=0;x<=100;x++) {
//            穷举
            for (int y = 0; y <= 100; y++) {
                for (double z=0;z<=100;z++){
                    if ((x*5+y*3+z/3)==100&&(x+y+z)==100){
                        System.out.println("X:"+x+" y:"+y+" z:"+z);
                    }
                }
            }
        }
    }
}
