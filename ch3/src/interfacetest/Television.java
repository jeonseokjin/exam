package interfacetest;

public class Television implements RemoteControl, Searchable {
	

	@Override
	public void search(String url) {
		System.out.println(url+ "�� �˻��մϴ�");
	}

	@Override
	public void turnOn() {
		System.out.println("�״�");
	}

	@Override
	public void turnOff() {
		System.out.println("����");
	}

	@Override
	public void serVolume(int volume) {
		// TODO Auto-generated method stub
		
	}

}
