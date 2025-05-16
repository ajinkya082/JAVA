class counts{
    private int num; // count of each digit
    private int no; // sum of each digit
    private int sh;
    public void setNum(int num){ // count of each digit 
        this.num=num;
    }
    public int getNum(){
        return this.num;
    }
    public int count_digit( ){
      
        int count=0;
        while (num>0) {
            count++;
            num=num/10;
        }
        return count;
    } 
    public void setNo(int no){  // sum of each digit
        this.no=no;
    }
    public int getNo(){
        return this.no;
    }
    public int sum_Of_each_digit(){
        int sum=0;
        while (no>0) {
            int rem=no%10;
            sum=sum+rem;
            no=no/10;
        }
        return sum;
    }
    public void setSh(int sh){
        this.sh=sh;
    }
    public int getSh(){
        return this.sh;
    }
    public int sum_of_even_digit(){
        int suming=0;
       
        while(sh>0){
            int rem=sh%10;
            if (rem%2==0) {
                suming=suming+rem;
            }
            sh=sh/10;
        }
        return suming;
    }

}
public class numbers{
    public static void main(String [] args){
        
        counts b=new counts();
        b.setNum(1253);
       int c= b.count_digit();
       System.out.println(c);// count of each digit 
       b.setNo(1253);
       int e=b.sum_Of_each_digit();
       System.out.println(e); // sum of each digit
       b.setSh(523568);
       int f=b.sum_of_even_digit();
       System.out.println(f);

    }
}