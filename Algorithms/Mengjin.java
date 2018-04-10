package cn.com;

import java.util.Scanner;

public class Mengjin {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int [n];
        int b[]=new int [n];
        for(int i=0;i<n;i++){
          a[i]=s.nextInt();
          for(int j=0;j<=i;j++){
        	  if(a[i]==a[j]){
        		  b[i]++;
        	  }
          }
        }
        for(int i=0;i<n;i++){
        	System.out.print(b[i]+" ");
        }
        
	}

}
