public class cube {
    public static void main(String[] args) {
        int a=154;
        while (a>0) {
            int s=a%10;
            System.out.println(s);
            a=a/10;
            int ds=s*s*s;
            System.out.println(ds);
        }
    }
}
