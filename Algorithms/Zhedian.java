package cn.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Scanner;

public class Zhedian {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args){
		// TODO Auto-generated method stub
	  Scanner s=new Scanner(System.in);
	  int n=s.nextInt();
      int m=0;
      int a[]=new int[n];
      for(int k=0;k<n;k++){
    	  a[k]=s.nextInt();
      }
      for(int i=1;i<(n-1);i++){
    	  if((a[i-1]<a[i]&&a[i]>a[i+1])||(a[i-1]>a[i]&&a[i]<a[i+1])){
    		  m++;
    	  }
    		  
    	  
      }
      System.out.println(m);
	}
}
