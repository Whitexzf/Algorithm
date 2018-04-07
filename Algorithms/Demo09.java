package Algorithms;

/**
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 * @author lenovo
 */
public class Demo09 {
	  public int JumpFloor(int target) {
	    	int a=0;
	    	if(target==1) {
	    		return a;
	    	}
	    	int b=1;
	    	for(int i=2;i<target;i++) {
	    		int temp=b;
	    		b=a+b;
	    		a=temp;
	    	}
	    	return b;
	    
	    }
}
