import java.util.Scanner;
public class vote {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the age : ");
        int a=sc.nextInt();
        if (a>=18) {
            System.out.println("Is eligible for voting");
        }
        else{
            System.out.println("Is not eligible for voting");
        }
    }
}
