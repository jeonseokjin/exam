package api;

public class Contains {
	public static void main(String[] args) {
		String str1="�ڹ� ���α׷���";
		
		str1.contains("��");
		boolean result=str1.contains("��");
		System.out.println(result);
		
		System.out.println(str1.contains("������"));
	}
}
