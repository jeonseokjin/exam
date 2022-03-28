package collection;

import java.util.ArrayList;
import java.util.List;

/*
 *  List �������̽�
 *  -������ ����
 *  -������ �ߺ� �����
 *  -����Ŭ���� : ArrayList, Vector, LinkedList, Stack....
 *  -�迭�� ����(���� ������)
 */
public class ListEx1 {
	public static void main(String[] args) {
		
		//���� : int => Integer
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(2);
		
		System.out.println(list);
		
		list.add(3,11);
		
		System.out.println(list);
		
		System.out.println();
		for(Integer i:list) {
			System.out.println(i);
		}
	}

}
