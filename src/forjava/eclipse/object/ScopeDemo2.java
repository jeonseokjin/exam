package forjava.eclipse.object;

public class ScopeDemo2 {
	static int i=5;
	static void a() {
		int i =10;
		b();
		
	}
	static void b() {
		int i =30;
		System.out.println(i);
	}
	public static void main(String[] args) {
			
			a();
	
	
	
	}

}
