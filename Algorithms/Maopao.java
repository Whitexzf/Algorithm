package cn.com;

public class Maopao {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int []a={900,878,891,904,865,912,868,870,898,903};
      int temp;
      System.out.print("δ�������飺");
      for(int i=0;i<10;i++){
    	  System.out.print(a[i]+" ");
      }
      System.out.println();
      for(int j=0;j<a.length-1;j++){
    	  for(int k=0;k<a.length-j-1;k++){
    		  if(a[k]<a[k+1]){
    			  temp=a[k+1];
    			  a[k+1]=a[k];
    			  a[k]=temp;
    		  }
    	  }
    	  System.out.print("��"+(j+1)+"������");
    	  for(int i=0;i<10;i++){
        	  System.out.print(a[i]+" ");
          }
    	 System.out.println();
      }
	}

}
