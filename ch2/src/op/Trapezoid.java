package op;

public class Trapezoid {

	public static void main(String[] args) {
		//사다리꼴 넓이 구하기
		//윗변 = 5, 아랫변 =10, 높이=7로 변수 선언하기
		//넓이 구하기
		double up=5;
		double down=10;
		double h=7;
		double result=(up+down)*h/2 ;
		System.out.println("result="+result); // 본인 작성
		
		
		int lengthTop =5;
		int lengthBottom=10;
		int height= 7;
		//넓이 구하기
		double area =(double)(lengthTop+lengthBottom)*height/2;
		System.out.println("넓이="+area);

	}

}
