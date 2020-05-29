

//Write a program to print the higher version of a Value?
     //  Ex: Value1=7.3.4.2.5.9
       // Value2=7.3.2.3.8.1
         //o/p: 7.3.4.2.5.9
         
import java.util.Arrays;
public class Test{

     public static void main(String []args){
        String ip1 = "7.3.4.2.5.9";
        String ip2 = "7.3.2.3.8.1";
        
        String[] arr1 = ip1.split("\\.");
        String[] arr2 = ip1.split("\\.");
        
        int[] intarr1 = new int [arr1.length];
        int[] intarr2 = new int [arr2.length];
        
        
        
        System.out.println(Arrays.toString(arr1));
         
        int i =0;
         
        
          for(String str:arr1){
            intarr1[i]=Integer.parseInt(str);//Exception in this line
          i++;
          }
          
          i= 0;
          
          for(int k =0; k > arr2.length ; k++){
            intarr2[k]=Integer.parseInt(arr2[k]);//Exception in this line
          }
          
        
        String output = null;
        
        for(int j=0; i < intarr1.length ; j++){
            
            if(intarr1[j] > intarr2[j]){
                output = "7.3.4.2.5.9";
                break;
            }else if(intarr1[j] == intarr2[j]){
                
                continue;
            }else{
                output = "7.3.2.3.8.1";
                break;
            }
        }
        
          
            if(output == null){
                 output = "both are equal";
            }
            
            System.out.println("output is : " + output);
        
        
     }
}
