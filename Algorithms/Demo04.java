package Algorithms;

public class Demo04 {
/**
 * ��ֻ��������2��3��5��������������Ugly Number��������6��8���ǳ�������14���ǣ���Ϊ����������7��
 *  ϰ�������ǰ�1�����ǵ�һ���������󰴴�С�����˳��ĵ�N��������
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
