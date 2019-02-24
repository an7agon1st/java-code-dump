import java.io.*;
import java.lang.*;
import java.util.*;

class Subs{
		int aa=100;
		int bb=200;
		Subs(){
			this.aa=100;
			this.bb=200;
		}
		Subs(int i, int j){
			this.aa=i;
			this.bb=j;	
		}
		int getDef(){
			return (aa-bb);
		}
}


class Add{
	static Scanner in = new Scanner (System.in);
	public static void main(String[] args) {
		int a=in.nextInt();
		int b=in.nextInt();
		Add addit = new Add();
		Subs sub= new Subs();
		//int d = sub.subst(a,b);
		int dd=sub.getDef();
		Subs sub2= new Subs(a,b);
		int d=sub2.getDef();
		int c=addit.add(a,b);
		System.out.println("Default val = "+dd);
		System.out.println("Add sum "+c+"\n Subs diff "+d);
	}

	public int add(int a,int b){
		int c=a+b;
		return c;
	}
}