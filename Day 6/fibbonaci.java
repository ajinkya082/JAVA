public class fibbonaci {
    public static void main(String[] args) {
        int r=0;
        System.out.println(r);
        int a=1;
        System.out.println(a);
        for(int i=3;i<=8;i++){
            int ar=r+a;
        System.out.println(ar);
        r=a;
        a=ar;
        }
    }
}
