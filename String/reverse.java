import java.util.Scanner;

public class reverse {
    static Scanner sc=new Scanner(System.in);
    public static void rerverse(String str){
        // StringBuilder reversed=new StringBuilder();
        String  reverse="";  // string   reverse 
        for(int i=str.length()-1;i>=0;i--){
            reverse+=str.charAt(i);
        }
        System.out.println("Reverse string is :" + reverse);
        
        
        str=str.trim();// string word reverse   or sentence reverse
        StringBuffer sb=new StringBuffer();
        int start=str.length()-1;
        int end=str.length();
        for(int i=str.length()-1;i>=0;i--){
            if (str.charAt(i)!=' ' && (i!=0)) {
                start--;
            }
            else if(str.charAt(i)==' '){
                if (start+1 !=end) {
                    sb.append(str,start+1,end).append(" ");
                }
                end=i;
                start--;
            }
            else if(i==0){
                sb.append(str,start,end).append(" ");
            }
        }
        System.out.println("reverse string is : "+sb);


    }
    public static void main(String[] args) {
        System.out.println("Enter string : ");
        String str=sc.nextLine();
        rerverse(str);
    }
}
 