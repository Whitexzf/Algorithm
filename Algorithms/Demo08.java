package Algorithms;
/**
 *��Ҷ�֪��쳲��������У�����Ҫ������һ������n���������쳲��������еĵ�n�
n<=39 
 * @author lenovo
 *
 */
public class Demo08 {
    public int Fibonacci(int n) {
    	int a=0;
    	if(n==1) {
    		return a;
    	}
    	int b=1;
    	for(int i=2;i<n;i++) {
    		int temp=b;
    		b=a+b;
    		a=temp;
    	}
    	return b;
    }
}
