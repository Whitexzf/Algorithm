package Algorithms;

public class Demo04 {
/**
 * 把只包含因子2、3和5的数称作丑数（Ugly Number）。例如6、8都是丑数，但14不是，因为它包含因子7。
 *  习惯上我们把1当做是第一个丑数。求按从小到大的顺序的第N个丑数。
 * @param args
 */
	public static void main(String[] args) {

	}
	 public int GetUglyNumber_Solution(int index) {
		    int []i=new int[index];
		    i[0]=1;
		    int m2=0;
		    int m3=0;
		    int m5=0;
		    for(int j=1;j<index;j++) {
		    	i[j]=min(i[m2]*2,i[m3]*3,i[m5]*5);
		    	if(i[m2]*2<=i[j]) {
		    		m2++;
		    	}
		    	if(i[m3]*3<=i[j]) {
		    		m3++;
		    	}
		    	if(i[m5]*5<=i[j]) {
		    		m5++;
		    	}
		    }
	        return i[index-1];
	    }
	private int min(int i, int j, int k) {
		return (i>j?j:i)>k?k:(i>j?j:i);
	}
}
