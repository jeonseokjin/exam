package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListEx6 {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		
		list.add("���");
		list.add("����");
		list.add("�ٳ���");
		list.add("Ű��");
		list.add("����");
		
		//list => �迭
		Object[] fruits=list.toArray();
		for(Object obj:fruits) {
			System.out.println(obj);
		}
		System.out.println();
		
		//�迭 => List
		String f[]= {"���","����","���","����","����","�ڵ�","�ٳ���"};
		List<String> list1=Arrays.asList(f);
		System.out.println(list1);
		//�迭���� �Ѿ�� �����̱� ������ �߰� ����� �ȵȴ�.
		//list1.add("����");  error:UnsupportedOperationException
		
		
		//�迭�κ��� ������ ����Ʈ�� ��ȭ�� �ʿ��� ��//�ٽ� ��üȭ ��Ų ������ �߰�
		List<String> list2=new ArrayList<String>(Arrays.asList(f));
		list2.add("����");
		System.out.println(list2);
	
	}
}
