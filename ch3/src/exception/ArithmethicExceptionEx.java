package exception;

public class ArithmethicExceptionEx {
	public static void main(String[] args) {
		
		int num1=5, num2=0;
		//java.lang.ArithmeticException
		try {//���ܰ� �߻��� ���� �ڵ���� �־��ָ� �ȴ�.
			System.out.println(num1/num2);
		} catch (Exception e) {//���ܰ� �߻��ϸ� ó��
			System.out.println("0���� ���� �� �����ϴ�");
			e.printStackTrace();
		}
	}

}
