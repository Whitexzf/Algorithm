package cn.com;

import java.util.Scanner;

public class TrainTicket {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int p[]=new int[n+1];
		for(int i=1;i<=n;i++){
			p[i]=sc.nextInt();
		}
		int b[]=new int[101];
		int a[][]=new int[21][7];
		int flag=1;
		for(int k=1;k<=n;k++){
			for(int i=1;i<=20;i++){			
				;//空余座位数
				for(int j=1;j<=5;j++){
					if(flag!=0&&a[i][6]!=0){//空余座位不为0
						for(int m=1;m<=p[k];m++){
							a[i][j]=1;
							j++;
						}	
						a[i][6]=5-p[k];//每一行空余座位数
					}
				}
		}
		}
		
	}

}
