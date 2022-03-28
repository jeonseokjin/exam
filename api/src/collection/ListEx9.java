package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ListEx9 {
	public static void main(String[] args) {
		//�� ����� Ű�� 2015~2021�� ���̿� 1�� ������ �Է¹޾�
		//ArrayList�� ����, ���� Ű�� ���� �ڶ� ���� ����ϱ�
		//����)
		//�Է°� : 120 122 125 130 139 145 149
		//��°� : ���� Ű�� ���� �ڶ� �⵵�� 2019�� 9cm
		
		Scanner sc=new Scanner(System.in);
		List<Integer> list=new ArrayList<Integer>();
		System.out.println("2015~2021���̱��� 1�� ������ Ű(cm)�� �Է��ϼ���");
		String input=sc.nextLine();
		
		StringTokenizer token=new StringTokenizer(input);
		while(token.hasMoreTokens()) {
			list.add(Integer.parseInt(token.nextToken()));
		}
		
		int between=0, pos=0;
		for(int i=0;i<list.size();i++) {
			int diff=list.get(i+1)-list.get(i);
			if(between<diff) {
				between=diff;
				pos=i;
			}
		}
		System.out.println("���� Ű�� ���� �ڶ� ������ "+(pos+2015)+" ��"+between+"cm");
	}
}
