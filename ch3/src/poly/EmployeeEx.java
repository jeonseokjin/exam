package poly;

public class EmployeeEx {
	public static void main(String[] args) {
		Employee employee1=new Employee();
		employee1.setName("ȫ�浿");
		employee1.setPosition("���");
		//employee1.work();
		work(employee1);
		
		
		Ceo employee2= new Ceo();
		employee2.setName("�赿ȣ");
		employee2.setPosition("������");
		//employee2.work();
		work(employee2);
		
		Adminstrator employee3=new Adminstrator();
		employee3.setName("���켺");
		employee3.setPosition("����");
		//employee3.work();
		work(employee3);
		}
	//�Ű������� ������
	public static void work(Employee employee1) {
		//Employee employee1 = employee1;
		//Employee employee1 = employee2; == Employee employee1 = new Ceo();
		//Employee employee1 = employee3; == Employee employee1 = new Adminstrator();
		employee1.work();
	}
//	public static void work(Ceo employee2) {
//		employee2.work()
//	}

}
