class Parent12{
    private int id;
    Parent12(int id){
        this.id=id;
    }
    public void display(){
        
        System.out.println("Parent id is : "+this.id);
    }
}
class Child1 extends Parent12{
    private int childId;
    Child1(int childId, int id){
        super(id);
        this.childId=childId;
    }
    @Override
    public void display(){
        // super.id=21; // usable only when parent doesnot have private value
        super.display();
        
        System.out.println("Child id is : "+childId);
    }
}
public class singleinheritance {
    public static void main(String[] args) {
        // Child1 ch=new Child1(10,0);
        // ch.display();
        Parent12 p=new Child1(1, 02);
        p.display();
    }
}
