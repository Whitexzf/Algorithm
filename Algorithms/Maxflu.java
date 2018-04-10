package cn.com;

import java.util.Scanner;

public class Maxflu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int a[]=new int[num];
		int max=0;
		for(int i=0;i<num;i++){
			a[i]=sc.nextInt();
		};
	    for(int i=0;i<num-1;i++){
	    	int r=a[i]-a[i+1];
	    	if(r<0){
	    		r=a[i+1]-a[i];
	    	}
	    	if(r>max){
	    		max=r;
	    	}	
	    }	
	    System.out.println(max);
	}

}
