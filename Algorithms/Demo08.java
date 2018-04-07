package Algorithms;
/**
 *大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项。
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
