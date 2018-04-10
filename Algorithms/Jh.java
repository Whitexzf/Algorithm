package cn.com;

import java.util.Scanner;

public class Jh {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       while(true){
    	   System.out.println("请输入一个两位数：（-1是推出程序）");
    	   Scanner sc=new Scanner(System.in);
    	   int n=sc.nextInt();
    	   if(n==-1){
    		   return;
    	   }
    	   for(int i=10;i<100;i++){
                if(n+i==reserval(n)+reserval(i)){
                	int k=n+i;
                	System.out.println(n+"+"+i+"="+reserval(n)+"+"+reserval(i)+"="+k);
                }
    	   }
    	   
    	   
       }
	}

	private static int reserval(int n) {
		int m=n/10+(n%10)*10;
		return m;
	}
	

}
