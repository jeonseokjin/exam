package classtest;

public class PersonEx {
	public static void main(String[] args) {
		Person person= new Person("000000-000013", "ȫ�浿");
				
				System.out.println("���� : "+person.nation);
				System.out.println("�ֹι�ȣ : "+person.ssn);
				System.out.println("�̸� : "+person.name);
				
				person.name="ȫ�α�";
				System.out.println("�̸� : "+person.name);
				
				//finalŸ���� ���� �Ұ��ϴ�. person.ssn="000023";
	}

}
