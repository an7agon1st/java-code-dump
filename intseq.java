import java.util.*;
import java.lang.*;
import java.io.*;

// Please name your class Main
class Intseq {
	public static void main (String[] args) throws java.lang.Exception {
	    Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int count=0;
		long finalshit=1;
		long finalprint=0;
		int b[]=new int[n];
		for(int i=0;i<n;i++){
			b[i]=in.nextInt();
		}
		int g=b[0];
		for(int i=1;i<n;i++){
			if(g<b[i])
				g=b[i];
		}
		int sum=0;
		
				for(int i=0;i<=g;i++){
					for(int j=i;j<=g;j++){
						if(i+j<=g){
							count++;
							//System.out.println(i+" "+j);
						}
					}
					
				}
		finalprint=finalprint+finalshit;
		System.out.println(count);
	}
}