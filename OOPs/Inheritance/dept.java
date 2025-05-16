import java.util.Scanner;

class department{
    String studentName;
    public void setName(String name){
        this.studentName=name;
    }
    public String getName(){
        return this.studentName;
    }
}
class student extends department{
    private int roll;
    private int year;
    String dept;
    public void setRoll(int roll){
        this.roll=roll;
    }  
    public int getRoll(){
        return this.roll;
    }
    public void setYear(int year){
        this.year=year;
    }
    public int getYear(){
        return this.year;
    }
    public void setDept(String dept){
        this.dept=dept;
    }
    public String getDept(){
        return this.dept;
    }
}
public class dept {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        student [] s=new student[5];
        for(int i=0;i<5;i++){
            System.out.println("enter dept name");
            String dept=sc.next();
            System.out.println("entr roll");
            int roll=sc.nextInt();
            System.out.println("entr year");
            int year=sc.nextInt();
            s[i]=new student();
            System.out.println("Enter student name :");
            String name=sc.next();
            s[i].setName(name);
        }
        for(int i=0;i<5;i++){
            System.out.println(s[i].getName());
            System.out.println(s[i].getRoll());
            System.out.println(s[i].getYear());
            System.out.println(s[i].getDept());
        }
    }
}
