import java.util.Scanner;
class number{
    private int number;
    public void setNumber(int number){
        this.number=number;
    }
    public int getNumber(){
        return this.number;
    }
    public int count_digit(int number){
        int count=0;
        while (number>0) {
            count++;
            number=number/10;

        }
        System.out.println(count);
        return count;
    }
} 
public class if_else_count {
    public static void main(String[] args) {
        number n=new number();
        n.setNumber(1260);
        int num = n.getNumber();
        n.count_digit(num);
        // n.setNumber(1260);
        // System.out.println(n.getNumber());

    }
}
