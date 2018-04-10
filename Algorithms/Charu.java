package cn.com;

import java.util.Scanner;

public class Charu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int []a={900,878,891,904,865,912,868,870,898,903};
	      int temp;
	      System.out.print("未排序数组：");
	      for(int i=0;i<10;i++){
	    	  System.out.print(a[i]+" ");
	      }
	      System.out.println();
	      for(int i=1;i<a.length;i++){
	    	  for(int j=0;j<i;j++){
	    		  if(a[j]<a[i]){
	    			  temp=a[j];
	    			  a[j]=a[i];
	    			  a[i]=temp;
	    		  }
	    	  }
		      System.out.print("第"+i+"次排序：");
	    	  for(int j=0;j<10;j++){
	        	  System.out.print(a[j]+" ");
	          }
	    	 System.out.println();
	      }

	}

}
