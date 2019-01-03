public class text02 {
    public static void main(String[] args) {
        int a=1;
        a=++a;//2
        System.out.println(a);

        a=a++;//2
        System.out.println(a);

        a=a++ + ++a;//6
        System.out.println(a);

        System.out.println(a--+ ++a +a++ +a);//6+6+6+7=25
        System.out.println(a);
    }
}
