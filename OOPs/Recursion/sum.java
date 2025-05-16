public class sum {
    // static Scanner sc=new Scanner(System.in);
    public static int sumntoo(int n){
        if (n==1) {
            return 1;
        }
        return n+sumntoo(n-1);
    }
    public static void main(String[] args) {
       int add= sumntoo(10);
        System.out.println("The addition is:"+add);
    }
}
