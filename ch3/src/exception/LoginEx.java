package exception;

public class LoginEx {
	public static void main(String[] args) {
		
		try {
			login("white","12345");
		} catch (NotExistIDExecption | WrongPasswordException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			login("blue","54321");
		} catch (NotExistIDExecption e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (WrongPasswordException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void login(String id, String password) throws NotExistIDExecption, WrongPasswordException {
		//id�� blue�� �ƴ϶�� NotExistIDException �߻�
		//��� : ���̵� �������� �ʽ��ϴ�.
		if(!id.equals("blue")) {
			throw new NotExistIDExecption("���̵� �������� �ʽ��ϴ�.");
		}
		//password�� 12345�� �ƴ϶�� WrongpasswordException �߻�
		//��� : �н����尡 Ʋ���ϴ�.
		if(!password.equals("12345")) {
			throw new WrongPasswordException("�н����尡 Ʋ���ϴ�.");
		}
	}
}
