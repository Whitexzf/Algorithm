package cn.com;

import java.util.Scanner;

public class Sort {

	/**
	 * @param args
	 */
	static class person{
		public int key;
		public int value;
	}
	public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       int n=s.nextInt();
       int a[]=new int[n];
       int b[]=new int [1001];
       person c[]=new person[1001];
       for(int j=0;j<=1000;j++){
    	   c[j]=new person();
       }
       for(int j=0;j<=1000;j++){
    	   b[j]=0;
       }
       for(int i=0;i<n;i++){
    	   a[i]=s.nextInt();
    	   b[a[i]]++;
       }
       for(int j=0;j<=1000;j++){ 
    		   c[j].key=j;
    		   c[j].value=b[j];
       }
       person temp;
       for(int x=0;x<1000;x++){
    	  for(int y=0;y<1000-x;y++){
    		  if(c[y].value<c[y+1].value){
    			  temp=c[y+1];
    			  c[y+1]=c[y];
    			  c[y]=temp;
    		  }
    	  } 
       }
       for(int i=0;i<=1000;i++){
    	   if(c[i].value!=0){
    		   System.out.print(c[i].key+" ");
    		   System.out.print(c[i].value);
    		   System.out.println();
    	   }
       }
	}

}
