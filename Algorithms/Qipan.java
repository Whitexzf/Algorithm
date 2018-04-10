package cn.com;

import java.util.Scanner;

public class Qipan {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
          Scanner s=new Scanner(System.in);
          int n=s.nextInt();
          int m=s.nextInt();
          int o=1;
          int p=1;
          int a[][]=new int[n][m];
          int d[][]=new int[n][m];
          for(int i=0;i<n;i++){
        	  for(int j=0;j<m;j++){
        		  a[i][j]=s.nextInt();
        		  d[i][j]=a[i][j];
        	  }
          }
          for(int i=0;i<n;i++){
        	  for(int j=0;j<m;j++){
        		  for(int k=j+1;k<m;k++){
        			  if(a[i][j]==a[i][k]){
        				  o++;
        			  }else{
        				  break;
        			  }
        		  }
        		  for(int g=i+1;g<n;g++){
        			  if(a[i][j]==a[g][j]){
        				  p++;
        			  }else{
        				  break;
        			  }
        		  }
        		  if(o>=3){
      				for(int b=j;b<o+j;b++){
      					d[i][b]=0;
      			  }	
        	     }
        		  o=1;
        		  if(p>=3){
      				for(int c=i;c<i+p;c++){
      					d[c][j]=0;
      			  }
        	  }
    				p=1;
          }
	  }
          for(int i=0;i<n;i++){
        	  for(int j=0;j<m;j++){
        		  System.out.print(d[i][j]+" ");
        	  }
        	  System.out.println();
          }
   }
}