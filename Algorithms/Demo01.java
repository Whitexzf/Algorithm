package Algorithms;

import java.io.File;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo01 {
/**
 * ��һ����ά�����У�ÿһ�ж����մ����ҵ�����˳������ÿһ�ж����մ��ϵ��µ�����˳�����������һ��������
 * ����������һ����ά�����һ���������ж��������Ƿ��и�����
 * @param args
 */
	public static void main(String[] args) {
		int [][] a=new int[][] {{1,3,4,7,9},{12,49,85,96,100}};
		System.out.println(Find(3,a));
	}
	public static boolean Find(int target, int [][] array) {
		
		for(int i=0;i<array.length;i++) {
			if(Arrays.binarySearch(array[i], target)>=0) {
				return true;
			  }
			}
		return false;
		}
}
