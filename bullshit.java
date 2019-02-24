import java.io.*;
import java.util.*;
import java.math.*;
import java.lang.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int t=in.nextInt();          // for the test cases
        int ans;
        
        for(int x=0;x<t;x++){
            int n= in.nextInt();     // array elements
            int q=in.nextInt();      //number of queries
            int[] a=new int[n];      // init array
            for(int i=0;i<n;i++){
                a[i]=in.nextInt();  //accepting array elements
            }
            for(int y=0;y<q;y++){
                int qn=in.nextInt();    //query number(1 or 2)
                int lcm;
                
                
               if(qn==1){
                   int mode;
                   int l=in.nextInt()-1;   //left index
                   int r=in.nextInt()-1;   //right index
                   int great=a[l];
                   
                   int median,all=0;
                   median=(int)Math.ceil(r-l+1);
                   for(int xx=0;xx<median;xx++){
                       all=all+a[xx];
                       if(all>median){
                           median=xx+1;
                           break;
                       }
                           
                   }
                   for(int xx=l+1;xx<=r;xx++){
                        if(great<a[xx]){
                         great=a[xx];
                         mode=xx+1;
                    }
                }
        

        // maximum number between n1 and n2 is stored in lcm
                 lcm = (median > mode) ? median : mode;

        // Always true
                 while(true)
                 {
                    if( lcm % median == 0 && lcm % mode == 0 )
                    {
                    ans= lcm;
                      break;
                    }
                    ++lcm;
                }
             }
               else{
                    int z,i;
                    i=in.nextInt()-1;
                    z=in.nextInt();
                    a[i]=z;
               }
                
                System.out.println(ans);
            }
            
        }
        
        
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
    
 
    
  
    
}