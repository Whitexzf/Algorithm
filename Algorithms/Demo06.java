package Algorithms;
import java.util.Stack;
/**
 * ������ջ��ʵ��һ�����У���ɶ��е�Push��Pop������ �����е�Ԫ��Ϊint���͡�
 * @author lenovo
 *
 */
public class Demo06 {
Stack<Integer> stack1 = new Stack<Integer>();
Stack<Integer> stack2 = new Stack<Integer>();

public void push(int node) {
    stack1.push(node);
}

public int pop() {
	int n=stack1.size();
	for(int i=0;i<n;i++) {
		stack2.push(stack1.pop());
	}
	int l=stack2.pop();
    int m=stack2.size();
	for(int i=0;i<m;i++){
        stack1.push(stack2.pop());
    }
	return l;
}}
