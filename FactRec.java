import java.util.*;


public class FactRec{
    
    public int Factorial(int n){
        if(n == 0) return 1;
        
        return n * Factorial(n-1);
    }

     public static void main(String []args){
        System.out.println("Hello World");
        
        // Scanner sc= new Scanner(System.in);
        //System.out.println("Enter first number- ");
        //int n = sc.nextInt();
        
        int n = 7;
        Fact ft = new Fact();

        int res = ft.Factorial(n);
        
         System.out.println("Factorial of " + n + " is " + res);
        

     }
}
