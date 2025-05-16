public class operations{
    public static boolean isEmpty( String str){
        String str1="";
        
        if(str1.length()>0){
            return false;
        }else{
           return true;
        }
      
    }
    public static void main(String[] args) {
        // String str;//declaration
        // String s1=new String("anand");
        // String s2=new String("anand");
        // System.out.println(s1==s2);
        // String s3="anand";
        // System.out.println(s1.equals(s3));
        // System.out.println(s3==s3);
        // String s4="anand";
        // System.out.println(s4==s3);
        // String s5="anand" + "barge";
        // String s6=s1.concat(s5)+"barge";
        // System.out.println(s6==s5);
       System.out.println(isEmpty(""));
        
    }
}