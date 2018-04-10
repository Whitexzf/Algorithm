package cn.com;

import java.util.Scanner;

public class Snake {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int m=1;
		int n=s.nextInt();
		int a[][]=new int[n][n];
	    int row=0;
	    int col=n-1;
		for(int i=0;i<=n-1;i++){
			for(int j=0;j<=n-1;j++){
				a[i][j]=0;
			}
		}
		for(int i=0;i<=n-1;i++){
			for(int j=0;j<=n-1;j++){
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		while(m<=n*n){
            while(row<n&&a[row][col]==0){
            	a[row][col]=m;
            	m++;
            	row++;
            }
            row--;
            col--;
            while(col>=0&&a[row][col]==0){
            	a[row][col]=m;
            	col--;
            	m++;
            }
            col++;
            row--;
            while(row>=0&&a[row][col]==0){
            	a[row][col]=m;
            	row--;
            	m++;
            }
            row++;
            col++;
            while(col<n&&a[row][col]==0){
            	a[row][col]=m;
            	m++;
            	col++;
            }
            col--;
            row++;
		}
		for(int i=0;i<=n-1;i++){
			for(int j=0;j<=n-1;j++){
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}
