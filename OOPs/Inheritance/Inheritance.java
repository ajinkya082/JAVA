import java.util.Scanner;

class company {
    String companyName;
    // company(){};    //constructor 
    // company(String name){
    //     this.companyName=name;
    // }
    public void setCompanyname(String name){
        this.companyName=name;
    }
    public String getcompanyName(){
        return this.companyName;
    }
}
class Employee extends company{
    private int id;
    private String name;
    Employee(int id, String name){
     this.id=id;
        this.name=name;
    }
    public void setId(int id){
        this.id=id;
    
       
    }
    public int getId(){
        return this.id;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
} 
public class Inheritance{
    static Scanner sc=new Scanner(System.in);

    public static void main(String[] args) {
      
        Employee[] em=new Employee[5];
        // System.out.println(e.getId());
        // System.out.println(e.getName());
        // e.setCompanyname("SVPM");
        // System.out.println(e.getcompanyName());
        for(int i=0;i<5;i++){
            String name=sc.next();
            int id=sc.nextInt();
             em[i]=new Employee(id,name);
            String cName=sc.next();
            em[i].setCompanyname(cName);
        }
        for(int i=0;i<5;i++){
        System.out.println(em[i].getId());
        System.out.println(em[i].getName());
        System.out.println(em[i].getcompanyName());
        }
    }
    
}