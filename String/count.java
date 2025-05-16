public class count {
    public static void counting(String str){
        int digitcount=0;
        int uppercasecount=0;
        int lowercasecount=0;
        int symbolcount=0;
        for(int i=0;i<str.length();i++){
            if (str.charAt(i)>=48&&str.charAt(i)<=57) {
                digitcount++;
            }
            else if (str.charAt(i)>=65&&str.charAt(i)<=90) {
                uppercasecount++;
            }
            else if (str.charAt(i)>=97&&str.charAt(i)<=122) {
                lowercasecount++;
            }
            else{
                symbolcount++;
            }
        }
        System.out.println("Digit count is : " + digitcount);
        System.out.println("Upper case count is : " + uppercasecount);
        System.out.println("Lower case count is : " + lowercasecount);
        System.out.println("Symbol count is  : "+ symbolcount);
    }
    public static void main(String[] args) {
        String str="Anand@14";
        String str1 ="barge";
        String str2=str + str1;
        System.out.println(str2);
        counting(str2);
    }
}
