public class reverse1 {
    public static String reverse(String str){
        String str2=" ";
       
        for(int i=str.length()-1;i>=0;i--){
            str2+=str.charAt(i);
        }
        System.out.println(str2);
        return str2;
    }
    public static void Isreverse(String str){
        // int s=0;
        int e=str.length();
        String str1="";
        for(int i=str.length()-1;i>=0;i--){
            if(str.charAt(i)==' '){
                str1=str1+ str.substring(i+1, e)+" ";
                e=i;
            }
        }
        str1=str1+str.substring(0,e);
        System.out.println(str1);
    }
    public static void main(String[] args){
        String str="Ajinkya Raut";
        // reverse(str);
        Isreverse(str);
    }
}
