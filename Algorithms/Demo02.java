package Algorithms;

import java.util.List;

/**
 * 请实现一个函数，将一个字符串中的空格替换成“%20”。例如，当字符串为We Are Happy.
 * 则经过替换之后的字符串为We%20Are%20Happy。
 * @author lenovo
 *
 */
public class Demo02 {

	public static void main(String[] args) {
		String s="We Are Happy";
		StringBuffer ss=new StringBuffer(s);
		System.out.println(replaceSpace(ss));
	}
	  public static String replaceSpace(StringBuffer str) {
		  	String s=str.toString();
		  	s=s.replaceAll(" ", "%20");
	    	return s;
	    }
}
