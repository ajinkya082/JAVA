import java.util.Scanner;
public class gtn {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first no :" );
        int a=sc.nextInt();
        System.out.println("Enter the second no :");
        int b=sc.nextInt();
        System.out.println("Enter the third no : ");
        int c=sc.nextInt();
        if(a>b&& a>c){
            System.out.println("First no is greater : " +   (a));
        }
        else if (b>c && b>a) {
            System.out.println("Second no is gretaer  :" +    (b));
        }
        else{
            System.out.println("third no is gretaer : " +    (c));
        }
    }
}
