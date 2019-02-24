import java.io.*;
import java.util.*;
import java.lang.*;

class Main{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Hello");
		int he=in.nextInt();
		System.out.println("TUX MSG "+args);
		Main mn= new Main();
		int i=mn.prnt();
		int j=mn.prnt(69);
		int k=mn.prnt("420");
		System.out.println("() "+i+" int "+j+" string "+)k;

	}

	int prnt(){
		System.out.println("Hello");
		return 0;
	}
	int prnt(int i){
		return 69;
	}
	int prnt(String rr){
		return 420;
	}
}