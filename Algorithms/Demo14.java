package Algorithms;

public class Demo14 {

	public static void main(String[] args) {
		String a[][]=new String[3][15];
		int x=0;int h=0;
		for(int j=0;j<15;j++) {
			if(j%4==1) {
				a[0][j]="_";
			}else {
				a[0][j]=" ";
			}
		}
		for(int i=1;i<3;i++) {
			for(int j=0;j<15;j++) {
				if(j%4==1) {
					a[i][j]="_";
				}else if(j%2==0) {
					a[i][j]="|";
				}else if(j==7) {
					a[i][j]="*";
				}else {
					a[i][j]=" ";
				}
			}
		}
//		if(x==1) {
//			
//		}
		for(int i=0;i<3;i++) {
			for(int j=0;j<15;j++) {
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
	}

}
