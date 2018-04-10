package cn.com;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner s=new Scanner(System.in);
      int a[][]=new int[15][10];
      int b[][]=new int[4][4];
      int n;
      for(int i=0;i<15;i++){
    	  for(int j=0;j<10;j++){
    		  a[i][j]=s.nextInt();
    	  }
      }
      for(int i=0;i<4;i++){
    	  for(int j=0;j<4;j++){
    		  b[i][j]=s.nextInt();
    	  }
      }
     n=s.nextInt();
      for(int i=0;i<4;i++){
    	  the:
    	  for(int j=0;j<4;j++){
    		  if(b[i][j]==1){		  
    			  for(int p=0;p<15;p++){
    				 if(a[p][i+n-1]==1){
    					 a[p-1][i+n-1]=1;
    					 continue the;
    				 }
    			  }
    			  a[14][i+n-1]=1;
    		  }
    	  }
      }
      for(int i=0;i<15;i++){
    	  for(int j=0;j<10;j++){
    		  System.out.print(a[i][j]);
    		  System.out.print(" ");
    	  }
      System.out.println();
	}
	}
}
