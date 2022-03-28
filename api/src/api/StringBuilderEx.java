package api;

public class StringBuilderEx {
	public static void main(String[] args) {
		//String Ŭ������ �ٸ����� mutable(���氡��) : append, insert, delete
		//StringBuilder : ���ڿ� Ŭ����
		//StringBuffer : ���ڿ� Ŭ����
		
		//builder = "ttt" (x) ������
		StringBuilder builder = new StringBuilder("Hello Java");
		builder.append("�ȳ��ϼ���");
		System.out.println(builder);
		
		System.out.println(builder.delete(0,2));
		System.out.println(builder);
		
		System.out.println(builder.insert(2, "T"));
		System.out.println(builder);
		
		StringBuilder builder1=new StringBuilder("Hello");
		StringBuilder builder2=new StringBuilder("Hello");
		
		//equals() �������̵� �ȵǾ� ����
		System.out.println(builder.equals(builder2));
		
		
		String str1=new String(builder1);
		String str2=new String(builder2);
		System.out.println(str1.equals(str2));
		
		//StringBuilder reverse
		builder1.reverse();
		System.out.println(builder1);
		
	}
}
