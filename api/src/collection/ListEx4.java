package collection;

import java.util.List;
import java.util.Vector;

//ArrayList �� Vector ����
//�����͸� �о���� �����ϴ� �� ȿ���� ����
//��, �뷮 ������ ���� ȿ���� ������

public class ListEx4 {
	public static void main(String[] args) {
		List<String> list = new Vector<String>();
		
		list.add("1");
		list.add("3");
		list.add("5");
		list.add("7");
		
		System.out.println(list);
		
		list.clear();
		
		System.out.println("clear() �� "+list);
	}
}
