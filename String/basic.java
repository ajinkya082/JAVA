import java.util.Scanner;

public class basic {
    static Scanner sc=new Scanner(System.in);
    public static void display(String str){
        for(int i=0;i<str.length();i++){
            System.out.println(str.charAt(i));
            // System.out.println(str[i]);0..
        }
    }
    public static void displayCapital(String str ){
        for(int i=0;i<str.length();i++){
            if (str.charAt(i)>=65 && str.charAt(i)<= 90) {
                System.out.println(str.charAt(i));
            }
        }
    }
    public static void digit(String str){
        for(int i=0;i<str.length();i++){
            if (str.charAt(i)>=48 && str.charAt(i)<=57) {
                System.out.println(str.charAt(i));
            }
        }
    }
    public static void symbol(String str){
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(!(ch>='A'&&ch<='Z')&& !(ch>='a'&&ch<='z')&& !(ch>=48 && ch<=57) && (ch!=' ')){
                System.out.println(ch);
            }
        }
    }
    // count of each digit starts from here 
    public static int strcount(String str){
        int count=0;
        for(int i=0;i<str.length();i++){
            count++;
        }
        System.out.println(count);
        return count;
    }
    public static int uppercount(String str){
        int uppercasecount=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>=65&& str.charAt(i)<=90){
                uppercasecount++;
            }
        }
        System.out.println(uppercasecount);
        return uppercasecount;
    }
    public static int lowercount(String str){
        int lowercasecount=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>=97&& str.charAt(i)<=122){
                lowercasecount++;
            }
        }
        System.out.println(lowercasecount);
        return lowercasecount;
    }
    public static int symbolcount(String str){
        int symbol=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(!(ch>='A'&&ch<='Z')&& !(ch>='a'&&ch<='z')&& !(ch>=48 && ch<=57) && (ch!=' ')){
                symbol++;
            }
        }
        System.out.println(symbol);
        return symbol;
    }
    public static int digitcount(String str){
        int digit=0;
        for(int i=0;i<str.length();i++){
            if (str.charAt(i)>=48&&str.charAt(i)<=57) {
                digit++;
            }
        }
        System.out.println(digit);
        return digit;
    }
    public static int charactercount(String str){
        System.out.println("enter key");
       char key=sc.next().charAt(0);
        int keycount=0;
        for(int i=0;i<str.length();i++){
            if (str.charAt(i)==key) {
                keycount++;
            }
        }
        System.out.println("The key count is : "+ keycount);
        return keycount;
    }
     // count of each digit ends from here 
    // public static int duplicate(String str){
    //     String str2=" ";
    //     for(int i=0;i<str.length();i++){
    //         str2+=str.charAt(i);
             
    //     }
        
    // }
    public static int reverse(String str){
        int start;
        int end;
        int temp;
        for(int i=0;i<str.length();i++){
            start=temp;
            start=end;
            end=temp;
        }
        return reverse;
    }
    public static void main(String[] args) {
        String str="Bright01239Path@";

        // display(str);
        // displayCapital(str);
        // digit(str);
        // symbol(str);
        strcount(str);
        uppercount(str);
        lowercount(str);
        symbolcount(str);
        digitcount(str);
        charactercount(str);
    }
}