package cn.com;

import java.util.Scanner;

public class huoche {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n+1];
		for(int x=1;x<=n;x++){
			a[x]=s.nextInt();
		}
		int b[]=new int[101];
		for(int i=1;i<=100;i++){
			b[i]=1;
		}
	int x=1;
   while(x<n+1){
		int p=0;
		while(p<20){
				if(a[x]==1){
					for(int k=1;k<=5;k++){
						if(b[(p*5)+k]==1){
							b[(p*5)+k]=0;
							System.out.print((p*5)+k);
							System.out.println();
							p=22;
							break;
						}
					}
				}else if(a[x]==2){					
						if(b[p*5+1]+b[p*5+2]==2){
							b[p*5+1]=0;
							b[p*5+2]=0;
							System.out.print(p*5+1+" ");
							System.out.print(p*5+2);
							System.out.println();
							p=22;
							break;

						}else if(b[p*5+2]+b[p*5+3]==2){
							b[p*5+3]=0;
							b[p*5+2]=0;
							System.out.print(p*5+2+" ");
							System.out.print(p*5+3);
							System.out.println();
							p=22;
							break;
						}else if(b[p*5+4]+b[p*5+3]==2){
							b[p*5+4]=0;
							b[p*5+3]=0;
							System.out.print(p*5+3+" ");
							System.out.print(p*5+4);
							System.out.println();
							p=22;
							break;

						}else if(b[p*5+4]+b[p*5+5]==2){
							b[p*5+4]=0;
							b[p*5+5]=0;
							System.out.print(p*5+4+" ");
							System.out.print(p*5+5);
							System.out.println();
							p=22;
							break;

					}
				}else if(a[x]==3){
					if(b[p*5+1]+b[p*5+2]+b[p*5+3]==3){
						b[p*5+1]=0;
						b[p*5+2]=0;
						b[p*5+3]=0;
						System.out.print(p*5+1+" ");
						System.out.print(p*5+2+" ");
						System.out.print(p*5+3);
						System.out.println();
						p=22;
						break;
					}else if(b[p*5+2]+b[p*5+3]+b[p*5+4]==3){
						b[p*5+3]=0;
						b[p*5+2]=0;
						b[p*5+4]=0;
						System.out.print(p*5+2+" ");
						System.out.print(p*5+3+" ");
						System.out.print(p*5+4);
						System.out.println();
						p=22;
						break;
					}else if(b[p*5+4]+b[p*5+3]+b[p*5+5]==3){
						b[p*5+3]=0;
						b[p*5+4]=0;
						b[p*5+5]=0;
						System.out.print(p*5+3+" ");
						System.out.print(p*5+4+" ");
						System.out.print(p*5+5);
						System.out.println();
						p=22;
						break;
					}
				}else if(a[x]==4){
					if(b[p*5+1]+b[p*5+2]+b[p*5+3]+b[p*5+4]==4){
						b[p*5+1]=0;
						b[p*5+2]=0;
						b[p*5+3]=0;
						b[p*5+4]=0;
						System.out.print(p*5+1+" ");
						System.out.print(p*5+2+" ");
						System.out.print(p*5+3+" ");
						System.out.print(p*5+4);
						System.out.println();
						p=22;
						break;
					}else if(b[p*5+2]+b[p*5+3]+b[p*5+4]+b[p*5+5]==4){
						b[p*5+3]=0;
						b[p*5+2]=0;
						b[p*5+4]=0;
						b[p*5+5]=0;
						System.out.print(p*5+2+" ");
						System.out.print(p*5+3+" ");
						System.out.print(p*5+4+" ");
						System.out.print(p*5+5);
						System.out.println();
						p=22;
						break;
					}
				}else{
				if(b[p*5+2]+b[p*5+3]+b[p*5+4]+b[p*5+5]+b[p*5+1]==5){
					b[p*5+3]=0;
					b[p*5+2]=0;
					b[p*5+4]=0;
					b[p*5+5]=0;
					b[p*5+1]=0;
					System.out.print(p*5+1+" ");
					System.out.print(p*5+2+" ");
					System.out.print(p*5+3+" ");
					System.out.print(p*5+4+" ");
					System.out.print(p*5+5);
					System.out.println();
					p=22;
					break;
				}
			}	
			p++;

			}
	
            x++;
		}
	}

}
