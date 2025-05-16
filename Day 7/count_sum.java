public class count_sum {
    public static void main(String[] args) {
        int a=146;
        int count=0;
        int store=0;
        while (a>0) {
         count++;
        
         a=a/10;
         store=store+a;

        }
        System.out.println(count);
        System.out.println(store);
    }
}
