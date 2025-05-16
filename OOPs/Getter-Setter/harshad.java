class numbers{
    private int number;
    public void setNumber(int number){
        this.number=number;
    }
    public int getNumber(){
        return this.number;
    }
    public void IsHarshad(int number){
        int sum=0;
        int temp=number;
        while (number>0) {
            int rem=number%10;
            sum=sum+rem;
            number=number/10;
        }
        System.out.println(sum);
        if (temp%sum==0) {
            System.out.println("It is Harshad number : " + temp);
        }else{
            System.out.println("It is not Harshad number : " + temp);
        }
    }
}
public class harshad {
    public static void main(String[] args) {
        numbers n=new numbers();
        n.setNumber(18);
        int num=n.getNumber();
        n.IsHarshad(num);
    }
}
