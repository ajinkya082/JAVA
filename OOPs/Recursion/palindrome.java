import java.util.Scanner;

public class palindrome {
    static Scanner sc=new Scanner(System.in);
    public static int reverse(int n,int rev){
        if (n==0) {
            return rev;
        }
        rev=rev*10 + n%10;
        return reverse(n/10, rev);
    }
    public static boolean Is_pallindrome(int n){
        return n==reverse(n,0);
    }
    public static void main(String[] args) {
        System.out.println("Enter number :");
        int n=sc.nextInt();
        boolean s=Is_pallindrome(n);
        if (s) {
            System.out.println( n+ " Is pallindrome");
        }
        else{
            System.out.println("Not pallindrome");
        }
    }
}
