package Algorithms;
/**
 * ���ǿ�����2*1��С���κ��Ż�������ȥ���Ǹ���ľ��Ρ�
 * ������n��2*1��С�������ص��ظ���һ��2*n�Ĵ���Σ��ܹ��ж����ַ�����
 * @author lenovo
 *
 */
public class Demo11 {
	public int RectCover(int target) {
        if(target <= 0) return 1;
        if(target == 1 || target == 2) return target;
        return RectCover(target - 1) + RectCover(target - 2);
    }
}
