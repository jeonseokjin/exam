package abstracttest;


public abstract class Car {
	
	
	//�߻�޼ҵ� : ���ø� �޼ҵ�
	public abstract void drive();
	public abstract void stop();
	
	public void startCar() {
	    System.out.println("�õ��� �մϴ�");
	}
	public void  turnOff() {
		System.out.println("�õ��� ���ϴ�");
	}

}
