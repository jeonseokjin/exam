package interfacetest;

public interface RemoteControl {
	//���
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//�߻�޼���
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	//default �޼���(8�������� ����)
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("���� ó��");
		}else {
			System.out.println("���� ����");
		}
	}
	//static �޼���(8�������� ����)
	static void changeBattery() {
		System.out.println("������ ��ȯ");
	}
}

