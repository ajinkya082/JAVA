abstract class test{
    abstract public void display();
}
class demo extends test{
    public void display(){
        System.out.println("in demo");
    }
}
public class abstat {

    public static void main(String[] args) {
        demo d=new demo();
        d.display();
    }
}