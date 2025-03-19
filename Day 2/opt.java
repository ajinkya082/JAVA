public class opt {
    public static void main(String[] args) {
        int x=10;
        int y=10;
        int z=0;
       // z= ++x + y++ - --x- --y;
       //z=x++ - --y +x++ + ++y;
       z=++y + y-- + --x -x++;
        System.out.println(z);
        System.out.println(x)
        ;
        System.out.println(y);



    }
    
}
