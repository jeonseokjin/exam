package interfacetest;

public class RemoteEx {
	public static void main(String[] args) {
		
		RemoteControl rc=new Television();
		rc.turnOn();
		rc.turnOff();
		
		System.out.println();
		
		rc=new Audio();
		rc.turnOn();
		rc.turnOff();
		
		//RemoteControl rc1=new RemoteControl(); //���� ��ü ���� �Ұ�
		//�͸� ���� ��ü
		
		RemoteControl rc1= new RemoteControl() {

			@Override
			public void turnOn() {
				System.out.println("������ ŵ�ϴ�");
			}

			@Override
			public void turnOff() {
				System.out.println("������ ���ϴ�.");
			}

			@Override
			public void setVolume(int volume) {
				System.out.println("���� ����"+ volume);
			}
			
		};
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
	}
}
