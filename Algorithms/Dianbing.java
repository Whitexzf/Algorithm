package cn.com;

import java.util.Scanner;

public class Dianbing {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		int num=0;
		for(int i=10;i<100;i++){
			if(i%3==a&&i%5==b&&i%7==c){
				num=i;
			}
		}
		if(num==0){
			System.out.println("no answer");
			return;
		}
		System.out.println(num);
	}

}
