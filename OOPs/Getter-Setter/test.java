 class Number{
    private int num;
    public void setNum(int n){
        this.num=n;
    }
    public int getNum(){
        return this.num;
    }
}
public class test{
    public static void main(String[] args) {
        int no;
        Number n=new Number();
        n.setNum(10);
        no=n.getNum();
        System.out.println(no);
    }
}