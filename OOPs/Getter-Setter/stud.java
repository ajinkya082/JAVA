class Student{
    private int roll;
    private double mark;
    private String name;
    public void setRoll(int s){
        this.roll=s;
    }
    public int getRoll(){
        return this.roll;
    }
    public void setMark(double a){
        this.mark=a;
    }
    public double getMark(){
        return this.mark;
    }
    public void setName(String fname){
        this.name=fname;
    }
    public String getName(){
        return this.name;
    }

}
public class stud {
    public static void main(String[] args){
                int no;
        double a;
        String str;
        Student s=new Student();
        s.setRoll(10);
        no=s.getRoll();
        s.setMark(90.5);
        a=s.getMark();
        s.setName("Ajinkya");
        str=s.getName();
        System.out.println(no);
        System.out.println(a);
        System.out.println(str);
    }
}
