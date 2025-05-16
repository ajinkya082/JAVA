import java.util.Scanner;

public class staircase {
    static Scanner sc=new Scanner(System.in);
    public static int stair(int n){
        if (n<=2) {
            return n;
        }
        int stairways=stair(n-1) + stair(n-2);
        return stairways;
    }   
    public static void main(String[] args) {
        System.out.println("Enter number : ");
        int n=sc.nextInt();
        int ways=stair(n);
        System.out.println(ways);
    }
}
