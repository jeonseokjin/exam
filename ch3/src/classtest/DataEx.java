package classtest;

public class DataEx {
	public static void main(String[] args) {
		 Data d= new Data();
		 
		 d.x=10;
		 System.out.println("main d.x= "+d.x);
		 
		 change(d.x);
		 change(d);
		 System.out.println("change() ȣ�� ��");
		 System.out.println("main d.x = "+d.x);
	}
	static void change(int x) { //�⺻�� �Ű�����(����)
		x=1000;
		System.out.println("change x= "+x);
	}
	static void change(Data obj) { //������ �Ű�����
		obj.x=1000;
		System.out.println("change x= "+obj.x);
	}

}
