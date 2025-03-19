import java.util.Scanner;
public class alpha {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a word : ");
        char ch=sc.nextLine().charAt(0);
         if (ch>='A' & ch<='Z') {
            System.out.println("It is a upper case");
         }
         else if(ch>='a'& ch<='z' ){
            System.out.println("It is a lower case value");
         }
         else{
            System.out.println("It is a invalid case");
         }
            
        
    }
}
