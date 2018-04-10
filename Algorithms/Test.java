package cn.com;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        StringBuffer sb=new StringBuffer("字符串内容");
        String st="ZHONG";
        sb.setCharAt(1, '我');
        sb.setLength(3);
//        sb.append("的增加");
//        String ss[]=s.split(" ");
        System.out.println(sb);
//      char c[]=s.toCharArray();
//        for(String cc:ss){
//    	  System.out.println(cc); 
//        }
//      String st=String.valueOf(c);
//      System.out.println(st);
		
	}

}
