package interfacetest;

public class MyAdder implements Adder {

	@Override
	public void print() {
		System.out.println("���");
	}

	@Override
	public int add(int x, int y) {
		return x+y;
	}

}
