package classtest;

public class SubscriberInfoEx2 {
	public static void main(String[] args) {
		
		//�⺻Ÿ���� �ʱ�ȭ�� null �� �� ����(�տ� �ҹ��ڷ� �����ϴ� �ֵ�. ex)int, byte, short, char// String���� �빮�ڽ����ϴ� Ÿ���� null�Է� �����ϴ�)
//		int a=null;
//		String str=null;
//		TV tv=null;
		
		
		//SubscriberInfo ��ü�� ���� �迭 ����
		SubscriberInfo info[]=new SubscriberInfo[3];
		//������ �迭�� subscriberInfo ��ü ���� �� ���
		info[0]= new SubscriberInfo("ȫ�浿", "hong1234");
		info[1]= new SubscriberInfo("������", "sung1234", "sung1234", "123-123-1234", "��⵵ �����ֽ�");
		info[2]= new SubscriberInfo("���߱�", "song1234", "song1234", null );
		
		//������ ���� Ȯ��
		print(info)
	}
	
	static void print(SubscriberInfo info[]){
		//for(Ÿ�� ������ : �迭��)
		for(SubscriberInfo s:info) {
			System.out.println("���� : "+s.name);
			System.out.println("���̵� : "+s.id);
			System.out.println("��й�ȣ : "+s.password);
			System.out.println("��ȭ��ȣ : "+s.phone);
			System.out.println("�ּ� : "+s.address);
			System.out.println();
		}
	}
}
