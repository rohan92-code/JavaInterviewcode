import java.util.*;


public class FactItr{
    
    public int Factorial(int n){
        int res = 1;
        
        
        for(int i = 2; i<= n ; i++){
            res = res * i;
        }
        
        return res;
    }

     public static void main(String []args){
        
        
        // Scanner sc= new Scanner(System.in);
        //System.out.println("Enter first number- ");
        //int n = sc.nextInt();
        
        int n = 7;
        FactItr ft = new FactItr();

        int res = ft.Factorial(n);
        
         System.out.println("Factorial of " + n + " is " + res);
        

     }
}
