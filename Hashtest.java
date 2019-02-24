/* IMPORTANT: Multiple classes and nested static classes are supported */


//imports for BufferedReader
import java.io.*;

//import for Scanner and other utility classes
import java.util.*;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TestClass {
	public static void main(String args[] ) throws Exception {

		Scanner s = new Scanner(System.in);
		int t=s.nextInt();
		String nroll[]=new String[t];
		for(int i=0;i<t;i++){
				int roll = s.nextInt();
				String name = s.nextLine();
				nroll[roll%t]=name;

		}
		t=s.nextInt();
		for(int i=0;i<t;i++){
			int q=s.nextInt();
			System.out.println("\b"+nroll[q%t]);
		}
		
		// Write your code here

	}
}
