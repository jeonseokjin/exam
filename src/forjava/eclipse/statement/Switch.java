package forjava.eclipse.statement;

public class Switch {

	public static void main(String[] args) {
		System.out.println("switch(1)");
		switch(4) {
		case 1 :
			System.out.println("one");
			break;
		case 2 :
			System.out.println("two");
			break;
		case 3 :
			System.out.println("three");
			break;
		default:
			System.out.println("default");                  //���⼭�� default�� �ʱⰪ�� �ǹ��ϴ� ���� �ƴ� ���и� �ǹ��Ѵ�. ���� case1,2,3�� �ش����� �ʴ� ���� (���� ��� 4)�� �´ٸ� default��� ������ �ߵ��� ������ ���̴�.
		}
		switch(2) {
		case 1 :
			System.out.println("one");
		case 2 :
			System.out.println("two");
		case 3 :
			System.out.println("three");
		}
		switch(3) {
		case 1 :
			System.out.println("one");
		case 2 :
			System.out.println("two");
		case 3 :
			System.out.println("three"); }

	}

}
                                                        /*swith ���� ����� �� �Ѱ��� ���� �� ���� swith�� �������δ� ��� ���ѵ� ������ Ÿ�Ը��� ����� �� �ִ�. byte, short, char , int, enum, String, Character, 
                                                          Byte, Short, Integer*/

                                                    
