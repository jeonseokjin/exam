package exception;
// catch(Exception e){} : ��� Exception ó�� ����
public class CatchExceptionEx2 {
	public static void main(String[] args) {
		try {
			//ArrayIndexOutOfBoundsException�� ���� �� �ִ� ����
			String data1=args[0];
			String data2=args[1];
			
			//NumberFormatException
			int value1 = Integer.parseInt(data1); //"a100"
			int value2 = Integer.parseInt(data2);
			
		} catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
			System.out.println("���� �Ű����� ���� �����ϰų� ���ڷ� ������ �� �����ϴ�.");
		
		}
	}

}
