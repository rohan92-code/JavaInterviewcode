import java.util.*;


public class FibonaccRec{
    
    public int Fib(int n){
        if(n <= 1) return n;
        
         return Fib(n-1) + Fib(n-2);
        }
        


 
     public static void main(String []args){
        
        
        // Scanner sc= new Scanner(System.in);
        //System.out.println("Enter first number- ");
        //int n = sc.nextInt();
        
        int n = 10;
        FibonaccRec ft = new FibonaccRec();

        int res = ft.Fib(n);
        
         System.out.println("Fibonacci of " + n + " is " + res);
        

     }
}
