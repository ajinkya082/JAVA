public class increasing {
    public static void inc(int n){
        if (n==0) return;
        System.out.println(n);
        inc(n-1);
        System.out.println(n);
        return;
    }
    public static void simple_forward(int no){
            for(int i=1;i<=no;i++){
                System.out.println(i);
            }
            
        }
        public static void increasing_simple(int n){ //forward recursion
            System.out.println(n);
            if (n==10) {
                return;
            }
            increasing_simple(n+1);
        }
        public static void decreasing(int n){ //forward recursion
            System.out.println(n);
            if (n==1) {
                return;
            }
            decreasing(n-1);
        } 
        public static int  factorial(int n){
            
            if (n==1||n==0) {
                return 1;

            }
            
            return n*factorial(n-1);
            
        }
        public static void backword_recursion_increasing(int n){
            if (n==10) {
                return;
            }
            backword_recursion_increasing(n+1);
            System.out.println(n);
        }
    public static void main(String[] args) {
        // inc(3);
        // int no=10;
        // for(int i=1;i<=no;i++){
        //     System.out.println("the number is :" + i);
        // }
        // simple_forward(10);
        // System.out.println("Recursion increasing numbers are :");
        // increasing_simple(1);
        // System.out.println("Recursion decreasing numbers are :");

        // decreasing(10);
        int fact = factorial(5);
        System.out.println("The factorial is :" + fact);
        System.out.println("Recursion using backward :");
        backword_recursion_increasing(1);
    }
}
