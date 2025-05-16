import java.util.Scanner;
class student{
    private int id;
    private String name;
    student(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the id :");
        id=sc.nextInt();
        name=sc.nextLine();
        System.out.println("Enter the name :");
        name=sc.nextLine();
    }
    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
}
public class default_constructor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); 
        System.out.println("Enter size of array:");
        int size=sc.nextInt();
        student[] s=new student[size];
        for(int i=0;i<size;i++){
            s[i]=new student();  
        }  
    }
}