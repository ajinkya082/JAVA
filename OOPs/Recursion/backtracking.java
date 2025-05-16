public class backtracking{
    public static void print(int no){
        if (no==3) {
            return;
        }
        print(no+1);
        System.out.println(no);
    }
    public static void increasing(int no){
        System.out.println(no);
        if (no==10) {
            return;
        }
        increasing(no+1);
    }
    public static void decreasing(int no){
        System.out.println(no);
        if (no==1) {
            return;
        }
        decreasing(no-1);
    }
    public static void main(String[] args) {
        increasing(1);
        // print(no);
        System.out.println("Decreasing :");
        decreasing(10);

    }
}