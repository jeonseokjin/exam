package interfacetest;

public class Audio implements RemoteControl, Searchable {
	

	@Override
	public void search(String url) {
		System.out.println(url+ "�� �˻��մϴ�");
	}

	@Override
	public void turnOn() {
		System.out.println("��");
	}

	@Override
	public void turnOff() {
		System.out.println("��");
	}

	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub
		
	}

}
