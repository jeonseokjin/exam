package poly;

public class Adminstrator extends Employee {
	@Override
	public void work() {
		System.out.println(super.getName()+" "+super.getPosition()+" ���� �մϴ�");
	}
}
