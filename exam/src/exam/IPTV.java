package exam;

public class IPTV extends ColorTV{
	String add;
	public IPTV(int size, int color, String add) {
		super(size, color);
		this.add=add;
	}
	@Override
	public void printProperty() {
		System.out.println("���� IPTV�� "+add+" �ּ��� "+getSize()+"��ġ "+color+"�÷�");
	}

}
