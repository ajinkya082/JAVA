import java.util.Scanner;

public class powerrec {
    static Scanner sc=new Scanner(System.in);
    public static int power(int a,int b){
        if (b==0) {
           return 1; 
        }
        return a*power(a, b-1);
    }
    public static void main(String[] args) {
        System.out.println("Enter base : ");
        int a=sc.nextInt();
        System.out.println("Enter power : ");
        int b=sc.nextInt();
        power(a, b);
        System.out.println(a+ " raised to " + b + " is : " + power(a, b));
    }
}
