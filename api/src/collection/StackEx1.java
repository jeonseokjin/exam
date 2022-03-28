package collection;

import java.util.Stack;

/*
 * Stack
 * �������� ������ �����͸� ���� ���� ���� => LIFO(Last In First Out)
 * 
 * push() : ����
 * pop() : ����
 * 
 * Queue : ó���� ������ �����͸� ���� ���� ���� => FIFO(First In First Out)
 * offer() : ����
 * poll(): ����
 * 
 * 
 */
public class StackEx1 {
	public static void main(String[] args) {
		Stack<String> stack=new Stack<String>();
		stack.push("0");
		stack.push("1");
		stack.push("2");
		stack.push("3");
		stack.push("4");
		
		while(!stack.empty()) {
			System.out.println(stack.pop());
		}
	}

}
