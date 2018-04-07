package Algorithms;



import java.util.ArrayList;
import java.util.List;

public class Demo03 {
/**
 * 输入一个链表，从尾到头打印链表每个节点的值。
 * @param args
 */
	public static void main(String[] args) {
		ListNode no1=new ListNode(6);
		ListNode no2=new ListNode(7);
		ListNode no3=new ListNode(9);
		ListNode no4=new ListNode(10);
		ListNode no5=new ListNode(3);
		ListNode no6=new ListNode(1);
		no1.next=no2;
		no2.next=no3;
		no3.next=no4;
		no4.next=no5;
		no5.next=no6;
		System.out.println(printListFromTailToHead(no1));
	}
	  public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
		  List<Integer> list=new ArrayList<>();
	      List<Integer> list2=new ArrayList<>();
		  if(listNode==null) {
			  return (ArrayList<Integer>) list2;
		  }
	     while(listNode.next!=null){
	    	 list.add(listNode.val);
	    	 listNode=listNode.next;
	     };
	     list.add(listNode.val);
	     System.out.println(list.size());
		  for(int i=list.size()-1;i>=0;i--) {
	    	  list2.add(list.get(i));
	      }  
		  return (ArrayList<Integer>) list2;
	    }
	
}
