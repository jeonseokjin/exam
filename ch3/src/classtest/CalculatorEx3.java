package classtest;

public class CalculatorEx3 {
	public static void main(String[] args) {
		Calculator3 cal = new Calculator3();
		
		cal.a= 10;
		cal.b= 5;
		
		System.out.println("a+b= "+cal.add());
		System.out.println("a-b= "+cal.substract());
		System.out.println("a*b= "+cal.multiple());
		System.out.println("a/b= "+cal.divide());
		
		//Ŭ���� �޼ҵ� ȣ��
		System.out.println("a+b= "+Calculator3.add(10,5));
		System.out.println("a-b= "+Calculator3.substract(10,5));
		System.out.println("a*b= "+Calculator3.multiple(10,5));
		System.out.println("a/b= "+Calculator3.divide(10,5));
	}
}
