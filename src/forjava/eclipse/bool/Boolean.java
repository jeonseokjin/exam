package forjava.eclipse.bool;

public class Boolean {

	public static void main(String[] args) {
		System.out.println(1==2); //false
		System.out.println(1==1); //true
		System.out.println("one"=="two");
		System.out.println("one"=="one");
		System.out.println(1!=2);
		System.out.println(1!=1);
		System.out.println(10>20);
		System.out.println(10>=10);
		System.out.println(10>=11);
		
		String a="Hello world";
		String b= new String("Hello world");
		System.out.println(a==b);
		System.out.println(a.equals(b));


	}

}
