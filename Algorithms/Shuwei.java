package cn.com;

import java.util.Scanner;

public class Shuwei {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
          Scanner s=new Scanner(System.in);
          int n=s.nextInt();
          int sub=0;
          while(true){
        	  sub+=n%10;
        	  n=n/10;
        	  if(n==0){
        		  break;
        	  }
          }
          System.out.println(sub);

	}

}
