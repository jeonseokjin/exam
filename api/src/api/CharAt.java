package api;

public class CharAt {
	public static void main(String[] args) {
		String str1 = "�ڹ� ���α׷���";
		System.out.println(str1.charAt(0));
		System.out.println(str1.charAt(1));
		System.out.println(str1.charAt(7));
		
		
		String str2 = "Hello!! Java";
		
		//str2 ���ڿ��� char�迭�� �����ϰ� ����ϱ�
		char[] arr1 = new char[str2.length()];
		
		for(int i=0; i<str2.length(); i++) {
			arr1[i]=str2.charAt(i);
		}
		System.out.println(arr1);
		
		//���ڿ��� '��' ���ڰ� ����ִ��� Ȯ���ϴ� ���α׷� �ۼ�
		//���ڰ� �������, ����
		boolean flag= false;
		for(int i=0; i<str1.length();i++) {
			if(str1.charAt(i)=='��') {
				flag=true;
				break;
			}
		}
		System.out.println(flag?"���ڰ� �������":"����");
	}
}
