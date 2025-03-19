import java.util.Scanner;
public class chara {
    public static void main(String [] arggs){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string ");
        char ch=sc.nextLine().charAt(0);
        if(ch>='A'&ch<='Z' || ch>='a' & ch<='z'){
            System.out.println("it is a aplhabet");
        }
        else{
            System.out.println("Invalid case");
        }
    }
}
