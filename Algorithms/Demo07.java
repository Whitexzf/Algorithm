package Algorithms;
/**
 * ��һ�������ʼ�����ɸ�Ԫ�ذᵽ�����ĩβ�����ǳ�֮Ϊ�������ת��
 *  ����һ���ǵݼ�����������һ����ת�������ת�������СԪ�ء�
 *   ��������{3,4,5,1,2}Ϊ{1,2,3,4,5}��һ����ת�����������СֵΪ1�� 
 * NOTE������������Ԫ�ض�����0���������СΪ0���뷵��0��
 * @author lenovo
 *
 */
public class Demo07 {
	   public int minNumberInRotateArray(int [] array) {
		   if(array.length==0) return 0;
		   int mid=array.length/2;
		   int start=0;
		   int end=array.length-1;
		   while(end-start>1) {
		   if(array[mid]>=array[start]) {
			   start=mid;
		   }else {
			   end=mid;
		    }
		   mid=(end+start)/2;
		   }
		   return array[start]>array[end]?array[end]:array[start];
	    }
}
