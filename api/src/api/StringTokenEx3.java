package api;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokenEx3 {
	public static void main(String[] args) {
		//����ڷκ��� ���ڿ��� �Է¹޾� �������� �и��� ������ �� ���ΰ� ���
		Scanner sc=new Scanner(System.in);
		System.out.println("���ڿ��� �Է��ϼ���");
		while(true) {
			System.out.println(">> ");
			String input=sc.nextLine();
			
			if(input.equals("exit")) {
				break;
			}else {
				StringTokenizer st=new StringTokenizer(input);
				System.out.println("�������� �и��� ���� �� : "+st.countTokens());
			}
			
		}
		//������ ȭ���� �Դϴ�. =>
		//exit ���ڸ� �Է��ϸ� �ݺ��� ����
	}
}
