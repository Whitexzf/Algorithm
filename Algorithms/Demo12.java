package Algorithms;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Demo12 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		List<String>list=new ArrayList<String>();
		String s1=s.replaceAll("[a-z]", " ");
		String str[]=s1.split(" ");
		for(int i=0;i<str.length;i++){
			if(str[i].length()>0){
				if(str[i].charAt(0)!=' ')
					list.add(str[i]);
			}
		}
		Collections.sort(list,new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				 return Integer.valueOf(o1.length()).compareTo(Integer.valueOf(o2.length()));
			}
		});
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<list.size();i++){
			if(list.get(i).length()==list.get(list.size()-1).length())
				sb.append(list.get(i));
		}
		System.out.println(sb+"\n"+list.get(list.size()-1).length());
	}	
}
