/* IMPORTANT: Multiple classes and nested static classes are supported */

//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TestClass {
    public static void main(String args[] ) {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        */
        int x=0,y=0;
        // Write your code here
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        try{
            int i=0;
           //int x=0,y=0;
            while(i<200){
                if(name.charAt(i)=='L')
                    x--;
                else if(name.charAt(i)=='U')
                    y++;
                else if(name.charAt(i)=='R')
                    x++;
                else
                    y--;
                i++;
            }
            
        }
        
        catch (Exception e){
            System.out.println(""+x+" "+y);
        }
        

    }
}
