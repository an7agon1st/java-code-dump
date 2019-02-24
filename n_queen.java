import java.io.*;
import java.util.*;


class NQueen{
	
	int[][] chessBoard;
	int size;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter chess board size");
		NQueen nq=new NQueen();
		nq.size=in.nextInt();
		nq.chessBoard=new int[nq.size][nq.size];
		nq.checkQueens();

	}
	void checkQueens(){
		int pi=0,pj=0;
		chessBoard[0][0]=69;
		int full=0;
		while(full==0){
			for(int i=0;i<size;i++){				//vertical filling of 1s
				chessBoard[pi][i]=1;
				for (int j=0;j<size ;j++ ) {
					chessBoard[j][pj]=1;			//horizontal filling of 1s
					if(pi+i<size&&pj+j<size)
						chessBoard[pi+i][pj+j]=1;	//**diagonal filling board w 1s
					if(pi-i>0&&pj+j<size)
						chessBoard[pi-i][pj+j]=1;
					if(pi+i<size&&pj-j>0)
						chessBoard[pi+i][pj-j]=1;
					if(pi+i>0&&pj-j>0)
						chessBoard[pi+i][pj-j]=1;	//**
				}
			}
			
		}
	}

}