package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * Iterator
 * -�÷��ǿ� ����� ��Ҹ� �����ϴ� �� ���Ǵ� �������̽�
 * -hasNext() : �о�� ��Ұ� �ִ���?
 * -next() : ���� ��� �о����
 * -remove() : next()�� �о�� ��� ����
 */

public class IteratorEx1 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(2);
		
		Iterator<Integer> it=list.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
