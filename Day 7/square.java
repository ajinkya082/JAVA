public class square {
    public static void main(String[] args) {
        int a=256;
        int som=0;
        while (a>0) {
            som=a%10;
            System.out.println(som);
            a=a/10;
            int s=som*som;
            System.out.println(s);
        }
    }
}
