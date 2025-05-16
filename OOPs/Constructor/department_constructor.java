import java.util.Scanner;
class student_constructor{
    private int id;
    private String name;
    student_constructor(){
        System.out.println("Default Constructor");
    }
    student_constructor(int id,String name){
        this.id=id;
        this.name = name;
    }
    // public void setId(int id){
    //     this.id=id;
    // }
    public int getId(){
        return this.id;
    }
    
    // public void setName(String name){
    //     this.name=name;
    // }
    public String getName(){
        return this.name;
    }
}
public class department_constructor{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size=sc.nextInt();
        student_constructor[] s=new student_constructor[size];
        for(int i=0;i<size;i++){
            System.out.println("enter the id");
            int id=sc.nextInt();
            System.out.println("Enter the name :");
            sc.nextLine();
            String name=sc.nextLine();
            s[i]=new student_constructor(id,name);
            
        }

        for(int j=0;j<size;j++){
            System.out.println(s[j].getId());
            System.out.println(s[j].getName());
        }
    }
}