import java.util.Scanner;
public class calci{
    public static void main(String[] args){
        Scanner sc=new Scanner(System
        .in);
        System.out.println("Enter your choice");
        char v=sc.nextLine().charAt(0);
        System.out.println("Enter the no 1:");
        int a=sc.nextInt();
        System.out.println("Enter the no 2:");
        int b=sc.nextInt();
       
        switch(v){
            case '+': System.out.println("The addition is :" + (a+b));
             break;
            case '-':System.out.println("The substaction is :" + (a-b));
            break;
            case '*':System.out.println("The multiplication is :" + (a*b));
            break;
            case '/':System.out.println("The division is :" + (a/b));
            break;
            default:System.out.println("Default not any addiotion");
            
            
        }
        
    }
}