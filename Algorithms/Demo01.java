package Algorithms;

import java.io.File;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo01 {
/**
 * 在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个函数，
 * 输入这样的一个二维数组和一个整数，判断数组中是否含有该整数
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
