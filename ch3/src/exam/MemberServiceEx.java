package exam;

public class MemberServiceEx {
	public static void main(String[] args) {
		
	
	//MemberService ��ü ����
	MemberService service=new MemberService();
	//login �޼ҵ� ȣ��
	boolean result = service.login("hong", "12345");
	//�޼ҵ�ȣ�� ����� �޾� true �� ��� "�α��� �Ǿ����ϴ�" �޽��� ���
	// �α׾ƿ� �޼ҵ� ȣ��
	if(result) {
		System.out.println("�α��εǾ����ϴ�");
		service.logout();
	}else {
		//false ��� "id �Ǵ� password�� �ùٸ��� �ʽ��ϴ�" �޼��� ���
		System.out.println("id �Ǵ� password�� �ùٸ��� �ʽ��ϴ�");
	}
}
}
