package cn.com;

import java.util.Scanner;

public class Zimage {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       int n=s.nextInt();
       int a[][]=new int[n][n];
       int b[]=new int[n*n];
       for(int i=0;i<n;i++){
    	   for(int j=0;j<n;j++){
    		   a[i][j]=s.nextInt();
    	   }
       }
       int x=0;
       int y=0;
       for(int i=0;i<n*n;i++){
    	   b[i]=a[x][y];
    	   System.out.print(b[i]+" ");
    	   if(x==0){
	    		   if(y!=0){if(b[i-1]!=a[0][y-1]){
	    			   y++;
	    		   }else{
	    			   x++;
	    			   y--;
	    		   } 
    		   }else{
    			   y++;
    		   }
    		    
    	   }else if(y==0){
    		   if(x!=n-1){
    			   if(a[x-1][0]!=b[i-1]){
        			   x++;
        		   }else{
        			   x--;
        			   y++;
        		   }
    		   }else if(a[x-1][0]==b[i-1]){
    			   y++;
    			   x--;
    		   }else{
    			   y++;
    		   }
    		   
    	   }else if(x==n-1){
    		   if(b[i-1]!=a[n-1][y-1]){
    			   y++;
    		   }else{
    			   x--;
    			   y++;
    		   }
    	   }else if(y==n-1){
    		   if(b[i-1]!=a[x-1][n-1]){
    			   x++;
    		   }else{
    			   x++;
    			   y--;
    		   }
    	   }else if(b[i-1]==a[x+1][y-1]){
    		   x--;
    		   y++;
    	   }else{
    		   y--;
    		   x++;
    	   }
       }
	}

}
