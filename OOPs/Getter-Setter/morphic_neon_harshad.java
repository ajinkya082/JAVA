class program{
    private int number;
    public void setNumber(int number){
        this.number=number;
    }
    public int getNumber(){
        return this.number;
    }
    public void Is_Neon(int number){ // Neon number
        int sum=0;
        int square=number*number;
        System.out.println("the square is :" + square);
        // int temp=number;
        while(square>0){
            int rem=square%10;
            sum=sum+rem;
            square=square/10;
        }
        System.out.println(sum);
        if(sum==number){
            System.out.println("Is Neon number : " + sum);
        }
        else{
            System.out.println("Is not a Neon number : "+ sum);
        }
    }
}
public class morphic_neon_harshad {
    public static void main(String[] args){
        program p=new program();
        p.setNumber(9);
        int num=p.getNumber();
        p.Is_Neon(num);
    }
}
