import java.util.Scanner;

class Studdent{
    private int id;
    private String name;
    private double percentage;
    Studdent(int id,String name, double p){
        this.id=id;
        this.name=name;
        this.percentage=p;
    }
    public void displayStudent(){
        System.out.println(id +" name is :" + name 
         + percentage);
    }
}
class Depts{
    private String name;
    private Studdent [] student;
    Depts(String name,int size){
        this.name=name;
        this.student=new Studdent[size];
    }

}

public class hass_a_relation_student_department {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int deptSize=sc.nextInt();
        sc.nextLine();
        Depts[] dept=new Depts[deptSize];
        for(int i=0;i<deptSize;i++){
            String name=sc.nextLine();
            int StudSize=sc.nextInt();
            dept[i]=new Depts(name, StudSize);
        }
    }
}
