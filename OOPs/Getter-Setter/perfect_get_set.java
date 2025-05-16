class perfect_number{
    private int number;
    public void setNumber(int number){
        this.number=number;
    }
    public int getNumber(){
        return this.number;
    }
    public void perfect_no(int number){
        int a=number;
        int sum=0;
       for(int i=1;i<number;i++){
        if (number%i==0) {
            sum=sum+i;
        }
        
       }
       System.out.println(sum);
       if (a==sum) {
        System.out.println("It is a perfect no : " + sum);
       }
       else{
        System.out.println("It is not a perfect no : "  + sum);
       }
    }
}
public class perfect_get_set {
    public static void main(String[] args) {
        perfect_number p=new perfect_number();
        p.setNumber(6);
        int q=p.getNumber();
        p.perfect_no(q);
    }
}
