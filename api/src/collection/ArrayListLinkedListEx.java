package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
 * ���������� �߰�, �����ϴ� ���� ArrayList �� LinkedList ���� ����
 * �߰��� �����͸� �߰�, �����ϴ� ���� LinkedList �� ArrayList ���� ����
 */


public class ArrayListLinkedListEx {
	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>(2000000);
		LinkedList<String> ll = new LinkedList<String>();
		
		System.out.println("---������ �߰�---");
		
		public static long add1(List<String> list) {
			long start = System.currentTimeMillis();
			for(int i=0; i<1000000; i++) {
				list.add(i+"");
			}
			long end = System.currentTimeMillis();
			return end-start;
		}
		public static long add12(List<String> list) {
			long start = System.currentTimeMillis();
			for(int i=0; i<10000; i)
		}
		public static long add1(List<String> list) {
		}
		public static long add1(List<String> list) {
		}
	}
}
