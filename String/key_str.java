import java.util.Scanner;

public class key_str {
    static Scanner sc=new Scanner(System.in);
    public static void key(String str){
        System.out.println("Enter key :");
        char key =sc.next().charAt(0);
        int count=0;
        for(int i=0;i<str.length();i++){
            if (key==str.charAt(i)) {
                count++;
            }
        }
System.out.println(count);
    }
    public static void first_occurence(String str){
        System.out.println("Enter first key :");
        char key=sc.next().charAt(0);
        for(int i=0;i<str.length();i++){
            if (key==str.charAt(i)) {
            System.out.println(i);
            break;
            }
        }
    }
    public static void last_occurence(String str){
        System.out.println("Enter last key :");
        char key=sc.next().charAt(0);
        for(int i=str.length()-1;i>=0;i--){
            if (key==str.charAt(i)) {
            System.out.println(i);
            break;
            }
        }
    }
    public static boolean keyIs(String str){
        System.out.println("Enter the key :");
        char key=sc.next().charAt(0);
        for(int i=0;i<str.length();i++){
            if (key==str.charAt(i)) {
                return true;
            }
        }
        return false;

    }
    public static void uppercase_count(String str){
        int count=0;
        int lowercase=0;
        int digit=0;
        int symbol=0;
        for(int i=0;i<str.length();i++){
            if (str.charAt(i)>='A'&& str.charAt(i)<='Z' ) {
                count++;
            }
        }
        System.out.println(count);
        for(int i=0;i<str.length();i++){
            if (str.charAt(i)>='a'&& str.charAt(i)<='z') {
                lowercase++;
            }
        }
        System.out.println(lowercase);
        for(int i=0;i<str.length();i++){
            if (str.charAt(i)>='0'&&str.charAt(i)<='9') {
                digit++;
            }
        }
        System.out.println(digit);
        for(int i=0;i<str.length();i++){
            if (str.charAt(i)>='A'&& str.charAt(i)<='Z' ) {
                count++;
            }
            else  if (str.charAt(i)>='a'&& str.charAt(i)<='z') {
                lowercase++;
            }
            else  if (str.charAt(i)>='0'&&str.charAt(i)<='9') {
                digit++;
            }
            else{
                symbol++;
            }
        }
        System.out.println(symbol);

    }
    
    public static void main(String[] args) {
        String str="Vivek Patil@123#";
        // key(str);
        // first_occurence(str);
        // last_occurence(str);
        // boolean found = keyIs(str);
        // System.out.println(found);
        uppercase_count(str);
        
    }
}
