import java.util.Scanner;
public class ercent{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the marks of first subject :" );
        int a=sc.nextInt();
        System.out.println("Enter the marks of second subject : ");
        int b=sc.nextInt();
        System.out.println("Enter the marks of third subject :");
        int c=sc.nextInt();
        int sum=a+b+c;
        System.out.println("The total marks are : " + (sum));
        int percent=sum/3;
        System.out.println("The percentage is :" +  (percent));
        if (percent>=90) {
            System.out.println("Grade is A+" +   (percent));
            
        }
        else if (percent>=80 & percent<90) {
            System.out.println("Grade is A" +   (percent));
        }
        else if(percent>=70 & percent<80){
            System.out.println("Grade is B+" +   (percent));
        }
        else if (percent>=60 & percent<70) {
            System.out.println("Grade is B" +   (percent));
        }
        else if (percent>=50& percent>40) {
            System.out.println("Grade is C" +   (percent));
        }
        else{

            System.out.println("Fail");
        }


    }
}