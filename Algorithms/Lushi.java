 package cn.com;   
import java.io.InputStreamReader;
import java.sql.ResultSet;
import java.util.ArrayList;  
import java.util.List;  
import java.util.Scanner;  
      

    public class Lushi {
    	public static List<role> p1=new ArrayList<>();
    	public static List<role> p2=new ArrayList<>();
    	public static List<role> f=new ArrayList<>();
    	public static List<role> l=new ArrayList<>();
        public static void main(String[] args) {
        	Scanner s=new Scanner(System.in);
        	int n=s.nextInt();
        	f=p1;
        	l=p2;
        	role hero1=new role(0, 30);
        	role hero2=new role(0, 30);
        	p1.add(0, hero1);
        	p2.add(0, hero2);
        	for(int i=0;i<n;i++){
        		String st=s.nextLine();
        		String []std=st.split(" ");
        		if(std.length==4){
        			action(std[0],Integer.parseInt(std[1]),Integer.parseInt(std[2]),Integer.parseInt(std[3]));
        		}else if(std.length==3){
        			action(std[0],Integer.parseInt(std[1]),Integer.parseInt(std[2]),0);
        		}else{
        			action(std[0],0,0,0);
        		}
        	}
        	System.out.println();
        	if(p1.get(0).health<=0){
        		System.out.println(-1);
        	}else if(p2.get(0).health<=0){
        		System.out.println(1);
        	}else{
        		System.out.println(0);
        	}
        	result(p1);
        	result(p2);
        	
        }
		private static void result(List<role> list) {
			// TODO Auto-generated method stub
			System.out.println(list.get(0).health);  
	        System.out.print(list.size() - 1 + " ");
	        if (list.size() > 1) {
	            for (int i = 1; i < list.size(); i++)  
	                System.out.print(list.get(i).health + " ");  
	            System.out.println();  
	        } else { 
	            System.out.println();  
	        } 
		}
		private static void action(String opt,int a,int b,int c) {
			// TODO Auto-generated method stub
			if(opt.equalsIgnoreCase("summon")){
				f.add(a, new role(b,c));
			}else if(opt.equalsIgnoreCase("attack")){
				f.get(a).health=f.get(a).health-l.get(b).attack;
				l.get(b).health=l.get(b).health-f.get(a).attack;
				vaildef();
			}else{
				List<role> ll;
				ll=f;
				f=l;
				l=ll;
			}
		}
		private static void vaildef() {
			// TODO Auto-generated method stub
			for(int i=0;i<p1.size();i++){
				if(p1.get(i).health<=0){
					p1.remove(i);
				}
			}
			for(int i=0;i<p2.size();i++){
				if(p2.get(i).health<=0){
					p2.remove(i);
				}
			}
		}  
      
    }  
    class role {  
        public int health;  
        public int attack;  
        public role(int a, int h) {  
            health = h;  
            attack = a;  
        }  
    }  