// Don't place your source in a package 
import java.util.*; 
import java.lang.*; 
import java.io.*; 
import java.util.Arrays; 
 
// Please name your class Main 
class Main { 
    public static void main (String[] args) throws java.lang.Exception { 
        Scanner in = new Scanner(System.in); 
        int a = in.nextInt(); //number of cases 
        int[] nA=new int[2]; 
        for(int i=0;i<a;i++) 
        { 
            int S=in.nextInt();//sum to be checked 
            int E=in.nextInt(); //no of elements in list 
             
            int intArray[];    //declaring array 
            intArray = new int[E];  // allocating memory to array 
             for(int j=0;j<E;j++) 
             { 
                 //for reading array 
            intArray[j]=in.nextInt(); 
 
            } 
             
            if(E==0){ 
                System.out.println("!0K"); 
            } 
            else if(E==1){ 
                if(intArray[0]==S){ 
                    System.out.println(S); 
                } 
                else{ 
                    System.out.println("!0K"); 
                } 
            } 
            else{ 
             
            int count=0; 
             
            for(int k=0;k<E-1;k++){ 
                for(int l=k+1;l<E;l++){ 
                    if((intArray[k]+intArray[l])==S){ 
                        E=l; 
                        nA[0]=intArray[k]; 
                       nA[1]=intArray[l];
                       System.out.println(l-1);
                       
                        
                       // System.out.println(intArray[k]+" "+intArray[l]); 
                        count++; 
                         
                     }
                }
            }
            if(count!=0) 
            {    
                if(nA[0]>nA[1]) 
                  System.out.println(nA[1]+" "+nA[0]); 
                else 
                  System.out.println(nA[0]+" "+nA[1]); 
            } 
            else if( count==0) 
            { 
                System.out.println("!0K"); 
            } 
          }
        }
        
    }
}
  
