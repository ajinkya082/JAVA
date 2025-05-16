class Student{
    private int roll;
    private String studname;
    public void setRoll(int roll){
        this.roll=roll;
    }
    public int getRoll(){
        return this.roll;
    }
    public void setStudname(String name){
        this.studname=name;
    }
    public String getStudname(){
        return this.studname;
    }
}
class Department{
    private String deptname;
    private Student student=new Student();

    public void setDeptname(String dname){
        this.deptname=dname;
    }
    public String getDeptname(){
        return this.deptname;
    } 
    public void setStudent(Student s){
        this.student=s;
    }
    public Student getStudent(){
        return student;
    }
}
public class has_a_relationship_dept_std {
    public static void main(String[] args) {
        Department d= new Department();
        d.getStudent().setStudname("aman");
        System.out.println(d.getStudent().getStudname());
        d.getStudent().setRoll(10);
        System.out.println(d.getStudent().getRoll());
        d.setDeptname("Comp");
        System.out.println(d.getDeptname());
    }
}
