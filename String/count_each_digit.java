import java.util.Scanner;

public class count_each_digit {
    static Scanner sc=new Scanner(System.in);
    public static void count(String str){
        String str1=" ";
        for(int i=0;i<str.length();i++){
            int count=0;
            char key=str.charAt(i);
            if (str1.indexOf(key)==-1) {
                for(int j=i;j<str.length();j++){
                    if (key==str.charAt(j)) {
                        count++;
                    }
                }
                System.out.println(key + " - " + count);
                str1=str1+ key;
            }
        }
    }
    public static void main(String[] args) {
        String str="Aman atar";
        count(str);
        
    }
}
