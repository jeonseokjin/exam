package classtest;

public class PhysicalInfo {
	//�Ӽ� - �̸�, ����, Ű, ������
	String name;
	int age;
	double height;
	double weight;
	//������ - ������� 4���� ��� �������ڷ� �޴� ����
	public PhysicalInfo(String name, int age, double height, double weight) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	//�޼ҵ� - update
	//age �� �޾Ƽ� ���� age�� ����
	void update(int age) {
		this.age=age;
	}
	//age, height �޾Ƽ� ���� age, height ����
	void update(int age, double height) {
		this.age=age;
		this.height=height;
	}
	void update(int age, double height, double weight) {
		this.age=age;
		this.height=height;
		this.weight=weight;
	}
}
