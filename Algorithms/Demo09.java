package Algorithms;

/**
 * һֻ����һ�ο�������1��̨�ף�Ҳ��������2���������������һ��n����̨���ܹ��ж�����������
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
