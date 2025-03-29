import java.util.Scanner;

public class lower_case {
    static Scanner sc=new Scanner(System.in);
    public static void uppercase(String str){
       
        String str2=" ";

        for(int i=0;i<str.length();i++){
            if (str.charAt(i)>=65&&str.charAt(i)<=90) {
                str2+=(char)(str.charAt(i)+32);
            }
        }
        System.out.println("The lowercase  string is :"+str2);
    }
    public static void main(String[] args) {
        
        String str="AJINKYA";
        uppercase(str);

    }
}
