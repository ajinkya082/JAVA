import java.util.Scanner;
public class paramerterized {
    public static void sum(int n,int s){
        if (n==0) {
            System.out.println("The sum number is :" + s);
            return;
        }
        sum(n-1, s+n);
        return;
    }
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter number : ");
     int n=sc.nextInt();
     sum(n, 0);   
    }
}
