import java.util.Scanner;

class stud{
    private int id;
    private String name;
    private double percentage;
    stud(int id, double percentage,String name){
        this.id=id;
        this.name=name;
        this.percentage=percentage;
    }
    public void display(){
        System.out.println(id);
        System.out.println(name);
        System.out.println(percentage);
    }
    public double getPercentage(){
        return this.percentage;
    }
    public void studisplay(){
       
            System.out.println("id " + id+ "name:" + name + "percent :" + percentage);
        
    }
}
class dept{
     String dname;
     stud[] Stud;
    dept(String name, int size){
        this.dname=name;
        this.Stud=new stud[size];
    }
    public void dpdisplay(){
        System.out.println(dname);
    }
    public void setStudent(Scanner sc){
        for(int i=0;i<Stud.length;i++){
            System.out.println("Enter id of student " + (i+1)+ " student :");
            int id=sc.nextInt();
            sc.nextLine();
            System.out.println("Enter name of student " + (i+1) + " student :");
            String name=sc.nextLine();
            System.out.println("Enter percentage of " + (i+1) + " student :");
            double percentage=sc.nextDouble();
            Stud[i]=new stud(id, percentage, name);
        }
    }
    public void Display(){
        if (this.dname.equals("it")) {
         System.out.println("dname :"+ dname);
         for(int i=0;i<Stud.length;i++){
            Stud[i].studisplay();
         }   
        }
    }
}
public class constructor {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter department numbers : ");
        int deptsize=sc.nextInt();
        sc.nextLine();
        dept [] dp=new dept[deptsize];
        for(int i=0;i<deptsize;i++){
            System.out.println("Enter department  name : ");
            String name=sc.nextLine();
            name=name.toLowerCase();
            System.out.println("Enter student size : ");
            int studsize=sc.nextInt();
            sc.nextLine();
            dp[i]=new dept(name, studsize);
        }
        for(dept d:dp){
            d.setStudent(sc);
        }
        for(dept d:dp){
            d.Display();
        }
    }
}
