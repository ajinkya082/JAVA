public class st{
    public static void main(String[] args) {
     String s="mukesh";
     String s1=new String("mukesh");
     s1=s.concat("mukesh");
     String s2="mukesh";
     s2=s1.concat(s2);
     System.out.println(s==s2);    
    }
}