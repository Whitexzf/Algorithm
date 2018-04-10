package cn.com;

import java.util.Scanner;

public class Isbn {
	public static void main(String[] args) {
				Scanner scanner=new Scanner(System.in);
				String ISBN=scanner.nextLine();	
				String S1="";
				int S2=0;//´æ·Å
				for(int a=0;a<ISBN.length();a++){	
					if(ISBN.substring(a, a+1).equals("-")!=true){				
						S1=S1+ISBN.substring(a, a+1);
					}
				}
				for(int i=1;i<S1.length();i++){
					S2=S2+i*Integer.parseInt(S1.substring(i-1, i));		
				}
				int result=S2%11;
				if(S1.substring(S1.length()-1,S1.length()).equals("X")!=true){
					if(result!=10){
						if(Integer.parseInt(S1.substring(9,10))!=result){
							System.out.print(ISBN.substring(0,12));
							System.out.println(result);
						}else{
							System.out.println("Right");
						}
					}else{				
						System.out.print(ISBN.substring(0,12));
						System.out.println("X");
					}
				}else{
					if(result==10){
						System.out.println("Right");
					}else{
						System.out.print(ISBN.substring(0,12));
						System.out.println(result);
					}			
				}				
			}
}
