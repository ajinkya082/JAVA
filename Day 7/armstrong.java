import java.net.Socket;

public class armstrong {
    public static void main(String[] args) {
        int a=153;
        int temp=a;
        int sum =0;
        while (a>0) {
            int w=a%10;
        
            int cube=w*w*w;

            sum = sum + cube;
            
            
            
            a=a/10;
            

        }
        if (sum == temp) {
            System.out.println("The no is armstrong ");
        }else{
            System.out.println("It is not ");
        }
        
        System.out.println(sum);
    }
}
