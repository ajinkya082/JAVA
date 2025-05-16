class method{
    public void display(double a){
        System.out.println("hello");
    }
    public void display(Integer a){// wrapper parameter
        System.out.println("hi");
    }
}
public class over {

    public static void main(String[] args) {
        method m=new method();
        m.display(10);
        m.display(12);
        m.display('a');
    }
}