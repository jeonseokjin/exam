package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ListEx8 {
	public static void main(String[] args) {
		//Scanner�� ����Ͽ� 5���� �Ǽ� ���� ����ڷκ��� �޾Ƽ� ArrayList�� ������ �� �˻��Ͽ�
		//���� ū �� ���
		//����)
		//�Է°� : 3.14 2.1 -5.5 99.9 33.7 =>"
		//��°� : ���� ū ���� 99.9
		Scanner sc=new Scanner(System.in);
		List<Double> list=new ArrayList<Double>();
		System.out.println("�Ǽ� �Է�");
		String input=sc.nextLine();
		
		StringTokenizer token= new StringTokenizer(input); //������ �������� �и� default ���� ���� �и��� �����ڰ� ������ ex) (input, " / ");
		while(token.hasMoreTokens()) {
			list.add(Double.parseDouble(token.nextToken()));
		}
		
		System.out.println(list);
		
		double max=0;
		for(Double value : list) {
			if(max< value) {
				max=value;
			}
		}
		System.out.println("���� ū ���� "+max);
		
		//Collection.sort(), Collection.max()
		System.out.println("���� ū ���� "+Collections.max(list));
		
		
	}
}
