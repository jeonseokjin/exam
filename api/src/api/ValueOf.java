package api;

public class ValueOf {
	public static void main(String[] args) {
		//������ ���� ���ڿ��� ��ȯ
		String b=String.valueOf(false);
		System.out.println(b);
		
		String c= String.valueOf('c');
		System.out.println(c);
		
		String f1= String.valueOf(10f);
		System.out.println(f1);
		
		String l= String.valueOf(10L);
		System.out.println(l);
		
		//"false" => boolean Ÿ��
		boolean b1=Boolean.parseBoolean(b);
		System.out.println(b1);
		//"3" => int Ÿ��
		int i=Integer.parseInt("3");
		System.out.println(i);
		// "10.0" => floatŸ��
		float f2=Float.parseFloat(f1);
		System.out.println(f2);
	}
}
