package cn.com;

import java.util.Scanner;

public class Shulie {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner s=new Scanner(System.in);
       int n=s.nextInt();
       int a[] =new int[n];
       int num=1;
       for(int i=0;i<n;i++){
    	   a[i]=s.nextInt();
       }
       for(int i=1;i<n;i++){
    	   if(a[i]!=a[i-1]){
    		   num++;
    	   }
       }
       System.out.println(num);
	}

}
