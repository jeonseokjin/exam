package api;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokenEx2 {
	public static void main(String[] args) {
		//����ڷκ��� ���ڿ��� �Է¹��� �� �����ؼ� ���
		//����) �ƺ�/����/����/ö��/����
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڿ��� �Է��� �ּ���");
		StringTokenizer st = new StringTokenizer(sc.nextLine(),"/");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
	}

}
