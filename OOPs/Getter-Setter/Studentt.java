import java.util.Scanner;
class chaman{
    private int id;
    private String name;
    private String address;
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
    public void setAddress(String address){
        this.address=address;
    }
    public String getaddress(){
        return this.address;
    }
    public void display(){
        System.out.println(id);
        System.out.println(name);
        System.out.println(address);
    }
}
public class Studentt{
    public static void main(String[] args){
       /*  chaman s=new chaman();
        chaman s1=new chaman();
        chaman s2=new chaman();
        chaman s3=new chaman();
        chaman s4=new chaman();
        s.setId(1);
        s.setName("Aman");
        s.setAddress("Baramati");
        s.display();
        s1.setId(2);
        s1.setName("Vivek");
        s1.setAddress("Pachora");
        s1.display();
        s2.setId(3);
        s2.setName("Anand");
        s2.setAddress("Shurur");
        s2.display();
        s3.setId(4);
        s3.setName("Ankita");
        s3.setAddress("Koregaon");
        s3.display();
        s4.setId(5);
        s4.setName("Shruti");
        s4.setAddress("Kuruli");
        s4.display();*/
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size");
        int size;
        size=sc.nextInt();
        chaman[] s=new chaman[size];
        for(int i=0;i<size;i++){
            s[i]=new chaman();
            System.out.println("Enter the id :");
            int id=sc.nextInt();
            s[i].setId(id);
           
            System.out.println("Enter the name :");
            sc.nextLine();
            String name=sc.nextLine();
            s[i].setName(name);
           
            System.out.println("Enter the address :");
            String address=sc.nextLine();

            s[i].setAddress(address); 
        }
        for(int j=0;j<size;j++){
            s[j].display();
        }
        sc.close();
    }
    
}
