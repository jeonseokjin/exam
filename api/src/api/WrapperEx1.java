package api;
/*
 * Wrapper 클래스
 * 기본형 타입을 객체로 다루기 위한 클래스들
 * 
 * int => Integer
 * boolean => Boolean
 * byte => Byte
 * short => Short
 * char => Character
 */
public class WrapperEx1 {
	public static void main(String[] args) {
		Boolean b = Boolean.valueOf(true);
		Integer i = Integer.valueOf(100);
		
		int i2=100;
		
		System.out.println(i==i2);
		System.out.println();
	}
}
