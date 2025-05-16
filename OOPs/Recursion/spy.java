import java.util.Scanner;

public class spy {
    static Scanner sc=new Scanner(System.in);
    public static int sum(int n){
        if (n==0) {
            return 0;
        }
        // int r=n%10;
        // s=s+r; 
        return (n%10)+sum(n/10);
    }
    public static int mult(int n){
        if (n==1) {
            return 1;
        }
        
        return (n%10) * mult(n/10);
    }
    public static boolean is_spy(int n){
        return sum(n)==mult(n);
    }
    public static void main(String[] args) {
        System.out.println("Enter the number : ");
        int n=sc.nextInt();
        boolean s=is_spy(n);
        if (s) {
            System.out.println(n+ " Is a spy number ");
        }else{
            System.out.println(n+ " Not a spy number");
        }
    }
}
