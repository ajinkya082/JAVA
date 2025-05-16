import java.util.Scanner;

public class harshad {
    static Scanner sc=new Scanner(System.in);

     public static int sum(int n){
        if (n==0) {
            return 0;
        }
        // int r=n%10;
        // s=s+r; 
        return (n%10)+sum(n/10);
    }
    public static boolean is_harshad(int n){
        return n%sum(n)==0;
    }

    public static boolean is_neon(int n,int squre){
        return n==sum(squre);
    }

    public static void main(String[] args) {
        System.out.println("enter number ");
        int n=sc.nextInt();
       
        boolean s=is_harshad(n);
        System.out.println(s);
        if (s) {
            System.out.println("harshad number is :"+ n);
        }
        else{
            System.out.println("not harshad number : "+n);
        }

         boolean neaon=is_neon(n,n*n);
        System.out.println(s);
        if (neaon) {
            System.out.println("neaon number is :"+ n);
        }
        else{
            System.out.println("not neaon number : "+n);
        }
    }
}
