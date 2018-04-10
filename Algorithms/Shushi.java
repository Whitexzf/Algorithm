package cn.com;

import java.io.InputStreamReader;
import java.util.Scanner;

public class Shushi {

	/**
	 * @param args
	 */
	public static boolean validate(int a,int b[]){
		boolean bool=false;
		for(int j=0;j<=b.length;j++){
			if(a==b[j]){
				bool=true;
			}
	}
		return bool;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int i=s.nextInt();
		int a=i/10000;
		int b=(i/1000)%10;
		int c=(i/100)%10;
		int d=(i/10)%10;
		int e=i%10;
		int[] x={a,b,c,d,e};
		int abc,de,l,y,z;
		for(abc=100;abc<1000;abc++){
			for(de=10;de<100;de++){
				if(validate(abc/100,x)&&validate((abc/10)%10,x)&&validate(abc%10,x)&&validate(de/10,x)&&validate(de%10,x)){
					l=abc*(de%10);
					y=abc*(de/10);
					z=abc*de;
				}
			}
		}
	}
}
