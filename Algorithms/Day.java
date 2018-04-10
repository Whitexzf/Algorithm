package cn.com;

import java.util.Scanner;

public class Day {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       int year=s.nextInt();
       int day=s.nextInt();
       if((year%4==0&&year%100!=0)||year%400==0){
    	   int a[]={31,29,31,30,31,30,31,31,30,31,30,31};
    	   int i=0;
    	   while(day>a[i]){
    		   day=day-a[i];
    		   i++;
    	   }
    	   System.out.println(i+1);
    	   System.out.println(day);
    	   
       }else{
    	   int a[]={31,28,31,30,31,30,31,31,30,31,30,31};
    	   int i=0;
    	   while(day>a[i]){
    		   day=day-a[i];
    		   i++;
    	   }
    	   System.out.println(i+1);
    	   System.out.println(day);
       }
	}

}
