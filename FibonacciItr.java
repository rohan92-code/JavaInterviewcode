import java.util.*;


public class FibonacciItr{
    
    public int Fib(int n){
        if(n <= 1) return n;
        
        int f = 0;
        int f1 = 0;
        int f2 = 1;
        
        
        
        for(int i = 2; i<= n ; i++){
            f = f1 + f2;
            f1 = f2;
            f2 = f;
        }
        
        return f ;
    }

     public static void main(String []args){
        
        
        // Scanner sc= new Scanner(System.in);
        //System.out.println("Enter first number- ");
        //int n = sc.nextInt();
        
        int n = 10;
        FibonacciItr ft = new FibonacciItr();

        int res = ft.Fib(n);
        
         System.out.println("Fibonacci of " + n + " is " + res);
        

     }
}
