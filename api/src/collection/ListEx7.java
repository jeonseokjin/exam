package collection;

import java.util.LinkedList;
import java.util.List;

//ArrayList, Vector ������ ����
//ũ�� ����, ��������� �������� �߰�, ������ �ð��� ���� �ɸ�

public class ListEx7 {
	public static void main(String[] args) {
		List<String> list= new LinkedList<String>();
		
		list.add("���");
		list.add("����");
		list.add("�޷�");
		list.add("�ٳ���");
		list.add("����");
		list.add("����");
		
		System.out.println(list);
	}
}
