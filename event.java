import java.io.*;
import java.util.*;
import java.lang.*;

class Event{
	public static void main(String[] args) throws IOException{	
		try{
				Scanner in = new Scanner(System.in);
				Scanner tt= new Scanner (System.in);
				int t=tt.nextInt();
	
				for(int i=0;i<t;i++){
					String ip=in.nextLine();
					String ipsep[]=ip.split(" ");
					int sday=daytoInt(ipsep[0]);
					int eday=daytoInt(ipsep[1]);
					int count =1;
					if(sday>eday){
						eday+=7;
						count=eday-sday+1;
					}
					else if(sday<eday){
						count=eday-sday+1;
					}
					else{
						count=7;
					}
					if(count>Integer.parseInt(ipsep[3])){
						System.out.println("impossible");
						continue;
					}
					else if (count<Integer.parseInt(ipsep[2])){
						if(Integer.parseInt(ipsep[3])<count+7){
							System.out.println("impossible");
							continue;
						}
						else
							while(count<Integer.parseInt(ipsep[2]))
								count+=7;
					}
	
					if(count<=Integer.parseInt(ipsep[3])&&count>=Integer.parseInt(ipsep[2])){
						if(Integer.parseInt(ipsep[3])<count+7)
							System.out.println(count);
						else
							System.out.println("many");
					}
					System.out.println("Sday "+sday+" Eday "+eday+" count "+count);
	
				}
			}
			catch(Exception e){
				return;
			}
		}

		public static int daytoInt(String day){
			switch(day){
				case "saturday":
				return 6;
				case "sunday":
				return 7;
				case "monday":
				return 1;
				case "tuesday":
				return 2;
				case "wednesday":
				return 3;
				case "thursday":
				return 4;
				case "friday":
				return 5;
			}
			return 0;
		}

		}