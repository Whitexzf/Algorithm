package cn.com;

import java.util.Scanner;

public class Yanghuisanjiao {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
     System.out.println("请输入杨辉三角的行数：");
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int a[][]=new int[n][n];
     for(int i=0;i<a.length;i++){
    	 for(int j=0;j<=i;j++){
    		 if(j==0||j==i){
    			 a[i][j]=1;
    		 }else{
    			 a[i][j]=a[i-1][j-1]+a[i-1][j];
    		 }
    	 }
     }
     System.out.println("杨辉三角：");
     for(int i=0;i<a.length;i++){
    	 System.out.print("第"+(i+1)+"行：");
    	 for(int j=0;j<=i;j++){
    		System.out.print(a[i][j]+"   ");
    	 }
    	 System.out.println();
     }
	}

}
