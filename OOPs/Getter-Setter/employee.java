import java.util.Scanner;
class shruu{
    private int id;
    private String name;
    private String dept;
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
    public void setDept(String dept){
        this.dept=dept;
    }
    public String getDept(){
        return this.dept;
    }
    public void display(){
        System.out.println(id);
        System.out.println(name);
        System.out.println(dept);
    }
}

public class employee {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int size;
        System.out.println("Enter the size of array :");
        size=sc.nextInt();
        shruu[] e=new shruu[size];
        for(int i=0;i<size;i++){
            e[i]=new shruu();
            System.out.println("Enter the id :");
            int id=sc.nextInt();
            e[i].setId(id);
            System.out.println("Enter the name :");
            sc.nextLine();
            String name=sc.nextLine();
            e[i].setName(name);
            System.out.println("Enter the dept");
            String dept=sc.nextLine();
            e[i].setDept(dept);
        }
        for(int j=0;j<size;j++){
            e[j].display();
        }

    }
}
