//定义数组循环
public class text06 {
    public static void main(String[] args) {
        int sum=0;
        int i=1;

        while (i<=10){
            sum=sum+i;
            i++;
        }
//        累加
//        System.out.println(sum);

//        定义一个数组
        String infos[]={"java","spark","storm","kafka","mongodb","redis","elasticSearch"};
//        循环
        for (int w=0;w<infos.length;w++){
            System.out.println("element:"+w+",value:"+infos[w]);
        }
    }
}
