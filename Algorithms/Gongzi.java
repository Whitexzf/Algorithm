package cn.com;

import java.util.Scanner;

public class Gongzi {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入税后工资：");
		Scanner ss=new Scanner(System.in);
		int a=ss.nextInt();
		int n = 0,b;
		int s=0;
		for (s = 1;s<= 100000;s++) 
		{
			b= s-3500;
			if (b <= 0) { n = s; }
		      else if(b <= 1500){ n = (int) (s - a*0.03); }
		        else if (1500 < b&&b <= 4500) { n = (int) (s - 1500 * 0.03 - (b - 1500)*0.1);}
		          else if (4500 < b&&b <= 9000) { n = (int) (s - 1500 * 0.03 - 3000 * 0.1 - (b - 4500)*0.2); }
		            else if (9000 < b&&b <= 35000) { n = (int) (s - 1500 * 0.03 - 3000 * 0.1 - 4500 * 0.2 - (b - 9000)*0.25); }
		              else if(35000 < b&&b <= 55000) { n = (int) (s - 1500 * 0.03 - 3000 * 0.1 - 4500 * 0.2 - 26000 * 0.25 - (b - 35000)*0.3);}
		                else if (55000 < b&&b <= 80000) { n = (int) (s - 1500 * 0.03 - 3000 * 0.1 - 4500 * 0.2 - 26000 * 0.25 - 20000 * 0.3 - (b - 55000)*0.35); }
		                  else if(b > 80000) { n = (int) (s - 1500 * 0.03 - 3000 * 0.1 - 4500 * 0.2 - 26000 * 0.25 - 20000 * 0.3 - 25000 * 0.35 - (b - 80000)*0.45);}	
			if (n == a) {
				break; }
		} 
		System.out.println(s);
	}

}
