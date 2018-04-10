package cn.com;

import java.util.Scanner;

public class Guandeng {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner s=new Scanner(System.in);
			int n=s.nextInt();
			int k=s.nextInt();
			boolean b=true;
			for(int i=1;i<=n;i++){
				int m=0;
				for(int j=2;j<=k;j++){
					if(i%j==0&&i/j!=0){
						m++;
					}
				}
				if(m%2==0){
					System.out.println(i);
				}
			}
	}

}
