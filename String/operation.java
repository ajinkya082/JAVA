import java.util.Arrays;

public class operation {
    // public static void reverse (String str){
    //     for(int i=0;i<str.length();i++){

    //     }
    // }
    public static void main(String[] args) {
        String s=" Ajinkya Raut ";
      System.out.println(s.substring(1));
      System.out.println(s.length());
      String[] s3 = s.split("R");
      System.out.println(Arrays.toString(s3));
      String s2= s.trim();
      System.out.println(s2);
      
    }
}
