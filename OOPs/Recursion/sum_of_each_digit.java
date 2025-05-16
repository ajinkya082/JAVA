import java.util.Scanner;

public class sum_of_each_digit {
    static Scanner sc=new Scanner(System.in);
    public static int sum(int n){
        if (n==0) {
            return 0;
        }
        // int r=n%10;
        // s=s+r; 
        return (n%10)+sum(n/10);
    }
    public static void main(String[] args) {
        System.out.println("enter number:");
        int n=sc.nextInt();
        int add=sum(n);
        System.out.println("sum of each digit is : " + add);
    }
}
