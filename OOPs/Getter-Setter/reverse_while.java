class number_1{
    private int number;
    public void setNumber(int number){
        this.number=number;
    } 
    public int getNumber(){
        return this.number;
    }
    public void reverse(int number){
        int temp=number;
        int rev=0;
        while (number>0) {
            int rem=number%10;
            rev=rev*10+rem;
            number=number/10;
        }
        System.out.println(rev);
        if (temp==rev) {
            System.out.println("It is a pallindrome number :" + rev);
        }
        else{
            System.out.println("It is not a pallindrome number : " + rev);
        }
    }
}
public class reverse_while {
    public static void main(String[] args) {
        number_1 r=new number_1();
        r.setNumber(323);
        int a=r.getNumber();
        r.reverse(a);
    }
}
