package op;
//������
//�ҹ��ڷ� ����(��ҹ��� ����)- ex)filename fileName �� ���� �ٸ� �������̴�.
//�ΰ��� �ܾ ���� ��� ù ���ڸ� �빮�ڷ� �Ѵ�. (����)firstName, maxspeed
//$,_ �� �����ϴ� ���� ����. �ٸ� Ư�����ڴ� �Ұ���
public class Pencil {

	public static void main(String[] args) {
		//534�ڷ��� ������ 30���� �л��鿡�� �Ȱ��� ������ ������ �л� �� ��� ���� �� �ְ�
		//���������� �� ���� ������ ����Ͻÿ�.
		//���� ���, ��� ������ ���
		
		int pencil=534;
		int student=30;
		int result=pencil/student;
		int resultRest=pencil%student;
				System.out.println("result="+result);
				System.out.println("resultRest="+resultRest);    //���� �ۼ�
		
		int pens=534;
		int stu=30;
		System.out.println("�л� �� �� �� ���� ���� : "+(pens/stu));
		System.out.println("������ ���� ���� : "+(pens%stu));
				

	}

}
