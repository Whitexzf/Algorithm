package Algorithms;
/**
 * һֻ����һ�ο�������1��̨�ף�Ҳ��������2��������Ҳ��������n����
 * �����������һ��n����̨���ܹ��ж�����������
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
