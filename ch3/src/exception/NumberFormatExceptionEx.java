package exception;

public class NumberFormatExceptionEx {
	public static void main(String[] args) {
		String data1="200";
		String data2="100";
		
		
		try {
			int value1 = Integer.parseInt(data1); //"a100"
			int value2 = Integer.parseInt(data2);
			
			System.out.println(value1+value2);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {//���� ���ο� ������� ������ �����ؾ� �ϴ� ��
			System.out.println("����");
		}
	}

}
