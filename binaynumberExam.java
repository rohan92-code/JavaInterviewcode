// if in in the method i pass n=4 we need to find all possible 4 digit binary number and if conscutive bit(1) for binary increase count than retuen count



import java.util.*;
public class Main {
    
  


public static void printBin(String soFar,int iterations, ArrayList<String> results) {

    if(iterations == 0) {
        System.out.println(soFar);
        results.add(soFar);
    }
    else {
      
         //int var = iterations - 1;
        //System.out.println("printBin(" + soFar + "0" + " , "  + var + ")" );
        printBin(soFar + "0", iterations - 1,results);
        //int var2 = iterations - 1;
       //System.out.println("printBin( " + soFar + "1" + " , "  + var2 + " )" );
       printBin(soFar + "1", iterations - 1,results);
        
       //System.out.println("finish");
    }
    
      //System.out.println("done");
}


public static int cheekconsecutivebit(String arr[]){
    
  System.out.println(Arrays.toString(arr));
    
    int count = 0;
    
    for(int j=0; j<arr.length;j++){
         int flag = 1;
    
    String[] yo = arr[j].split(""); 
    
     System.out.println(Arrays.toString(yo));
    for(int i = 0; i< yo.length -1; i++){
        
        if((yo[i].equals("1")) && (yo[i+1].equals("1"))){
            flag = 0;
            break;
        }
       
    }
     System.out.println("flag " + flag);
     if(flag == 1){
            count ++;
        }
    }
    
    return count;
}


   public static void fun(int n){
       
         ArrayList<String> myList = new ArrayList<String>();
       
       printBin("",n,myList);
       
         String[] myArray = new String[myList.size()];
       
        myList.toArray(myArray);
        System.out.println("arr " + myArray[1]);
       
       int m = cheekconsecutivebit(myArray);
       
       System.out.println(m);
   } 
   
   
	public static void main(String[] args) {
	    fun(3);
	
	}
}

