package exam;

public class MemberService {
	//������� :id, password
	private String id;
	private String password;
	
	//default ������
	public MemberService() {}
	
	//�޼ҵ� : ����Ÿ��-boolean
	//�޼ҵ��(login) : id�� password�� �޾Ƽ� id�� hong�̰�, password 12345 �� ��츸 
	//			     true�� ����, �� �̿��� ���� false ����
	boolean login(String id, String password) {
		if(id.equals("hong")&&password.equals("12345")) {return true;
		
		}
		return false;
	}
	
	//logout : �Ű�����(����)�� ����/����Ÿ�� ����
	// 		   �α׾ƿ� �Ǿ����ϴ�. �޽��� ���
	void logout() {
		System.out.println("�α׾ƿ� �Ǿ����ϴ�");
	}
}
