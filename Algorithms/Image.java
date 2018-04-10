package cn.com;

import java.util.Scanner;

public class Image {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Scanner scanner=new Scanner(System.in);
				String ISBN=scanner.nextLine();
				String S1="";
				int S2=0;//存放
				for(int a=0;a<13;a++){	
					if(ISBN.substring(a, a+1).equals("-")!=true){				
						S1=S1+ISBN.substring(a, a+1);
					}
				}
				for(int i=1;i<S1.length();i++){
					S2+=i*Integer.parseInt(S1.substring(i-1, i));//计算最后一位的值			
				}
				int result=S2%11;
				if(result==10){
					if(S1.substring(9,10).equals('X')){
						System.out.println("Right");
					}else{
						System.out.print(ISBN.substring(0,12));
						System.out.println('X');
					}
				}else if(Integer.parseInt(S1.substring(9,10))!=result){
					System.out.print(ISBN.substring(0,12));
					System.out.println(result);
				    }else{
					System.out.println("Right");
				}
				
			}
			//样例输入0-670-82162-0/0-670-82162-4

}
