import java.util.Scanner;
public class posi {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int a=sc.nextInt();
        if(a>=0){
            System.out.println("It is positive number :" + a);
        }else{
            System.out.println("It is negative number :" 
            + a);
        }
    }
}
