package Algorithms;

import java.util.List;

/**
 * ��ʵ��һ����������һ���ַ����еĿո��滻�ɡ�%20�������磬���ַ���ΪWe Are Happy.
 * �򾭹��滻֮����ַ���ΪWe%20Are%20Happy��
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
