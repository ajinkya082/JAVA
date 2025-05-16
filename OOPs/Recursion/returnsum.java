import java.util.Scanner;

public class returnsum {
    static Scanner sc=new Scanner(System.in);
    public static int sum(int n){
        if (n==1||n==0) {
             
            return 1;
           
        }
        // System.out.println("The sum is  " + n);
        return n+sum(n-1);
    }
    public static void main(String[] args) {
        System.out.println("Enter number : ");
        int n=sc.nextInt();
        int sum1=sum(n);
        System.out.println("The sum is : "+sum1);
    }
}
