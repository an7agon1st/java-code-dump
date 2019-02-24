// Don't place your source in a package
import java.util.*;
import java.lang.*;
import java.io.*;

// Please name your class Main
class Main {
	public static void main (String[] args) throws java.lang.Exception {
	    Scanner in = new Scanner(System.in);
		int nb = in.nextInt();
		int r=0,rp;
		int ex=0;
		int count=0;
		int[] an=new int[nb];
		System.out.print("Q");
		for(int i=0;i<nb;i++){
		    System.out.print(" ");
		    an[i]=0;
		    System.out.print(an[i]);
		    
		}
		
		    while(r!=nb){
		    rp=r;
		    r=in.nextInt();
		    
		  
		    
		    if(r==nb)
	        	break;
	        
	        System.out.print("Q");
	        
	        //starts here the fuction that didnt work

	          an[count]=1;
	    
	    if(r<=rp){
	    	if(count-1<0){
	    		    		
	    		System.out.println("\bA 1");ex++;
	    		break;

	    	}
	    	else
	        	an[count-1]=0;
	    }
	    for(int i=0;i<nb;i++){
		    System.out.print(" ");
		    System.out.print(an[i]);
		    
		}
	
		    count++;
	        
	        //ends here
	        
	        System.out.flush();
	        System.out.println();
	        
	        
		}
		    
		    //try ends here
		if(ex==0){
				System.out.print("A");
				for(int i=0;i<nb;i++){
				    System.out.print(" ");
				    System.out.print(an[i]);
				    }
		
		
		}
		
	}
	
	
	

}