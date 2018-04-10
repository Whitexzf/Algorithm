package cn.com;

import java.util.Scanner;

public class Picture {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int m=s.nextInt();
		int a[][]=new int [n][m];
		int b[][]=new int [m][n];
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				a[i][j]=s.nextInt();
			}
		}
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				b[j][i]=a[i][j];
			}
		}
		for(int i=m-1;i>=0;i--){
			for(int j=0;j<n;j++){
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
	}

}
