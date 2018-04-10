package cn.com;

public class Paixu {
	public static void main(String[] args) {
		int q[]={1,2,3,4,5,6,7,8,9};
		int m,n,l;
		for(int a=0;a<9;a++){
			for(int b=0;b<9;b++){
				for(int c=0;c<9;c++){
					m=q[a]*100+q[b]*10+q[c];
					for(int d=0;d<9;d++){
						for(int e=0;e<9;e++){
							for(int f=0;f<9;f++){
								n=q[d]*100+q[e]*10+q[f];
								for(int g=0;g<9;g++){
									for(int h=0;h<9;h++){
										for(int i=0;i<9;i++){
											l=q[g]*100+q[h]*10+q[i];
											if(l/m==3&&n/m==2&&l%m==0&&n%m==0){
												      if(a!=b&&a!=c&&a!=d&&a!=e&&a!=f&&a!=g&&a!=h&&a!=i&&
														 b!=c&&b!=d&&b!=e&&b!=f&&b!=g&&b!=h&&b!=i&&
														 c!=d&&c!=e&&c!=f&&c!=g&&c!=h&&c!=i&&
														 d!=e&&d!=f&&d!=g&&d!=h&&d!=i&&
														 e!=f&&e!=g&&e!=h&&e!=i&&
														 f!=g&&f!=h&&f!=i&&
														 g!=h&&g!=i&&
														 h!=i
														){
												System.out.print(m+" ");
												System.out.print(n+" ");
												System.out.print(l);
												System.out.println();}
												
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
