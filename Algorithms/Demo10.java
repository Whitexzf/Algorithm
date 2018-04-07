package Algorithms;
/**
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。
 * 求该青蛙跳上一个n级的台阶总共有多少种跳法。
 * @author lenovo
 *
 */
public class Demo10 {
	  public int jumpN(int n) {
			if (n==0 ||n==1) {
				return 1;
			}
		return 2 * jumpN(n - 1);

	  }
}
