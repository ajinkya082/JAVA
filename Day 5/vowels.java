import java.util.Scanner;
public class vowels {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the alphabet : " );
        char ch = sc.next().charAt(0);
        if (ch=='a' ||ch=='A' || ch=='e' || ch=='E' || ch=='I' || ch=='i' || ch=='O' || ch=='o' || ch=='U' || ch=='u') {
            System.out.println("It is a vowel : " +  (ch) );
        }
        else{
            System.out.println("It is a consonant : " + (ch));
        }

    }
}
