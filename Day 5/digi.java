import java.util.Scanner;
public class digi {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the input :" );
        int a=sc.nextInt();
        if (a>10) {
            System.out.println("It is a number : " + a);
            
        }
        else{
            System.out.println("It is a digit : " +
             a);
        }
    }
}
