package Algorithms;
import java.util.Stack;
/**
 * 用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
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
