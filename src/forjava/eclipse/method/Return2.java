package forjava.eclipse.method;

public class Return2 {
	public static String[] getmembers() {
		String[] members = { "��", "��", "��" };

		return members;
	}

	public static void main(String[] args) {
		String[] members1 = getmembers();
		System.out.println(members1);

	}

}
