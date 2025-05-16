class Parent{
    private int id;
    public void setId(int id){
        this.id=id;
    }
    public int getId(){
        return this.id;
    }
}
class child{
    private int chlidId;
    private Parent parent=new Parent();
    public void setChildid(int childId){
        this.chlidId=childId;
    }
    public int getChildId(){
        return this.chlidId;
    }
    public void setParent(Parent p){
        this.parent=p;
    }
    public Parent getParent(){
        return this.parent;
    }
}
public class has_a_relationship_inheritance { // without using extends method
    public static void main(String[] args) {
        child c=new child();
        c.getParent().setId(1);
        c.getParent().setId(20);
        System.out.println(c.getParent().getId());
    }
}
