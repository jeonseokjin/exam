package api;

import java.util.StringTokenizer;

public class StringTokenEx {
	public static void main(String[] args) {
		StringTokenizer st=new StringTokenizer("THis is a test");
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
		
		StringTokenizer st1 = new StringTokenizer("This/is/a/test","/");
		while(st1.hasMoreTokens()) {
			System.out.println(st1.nextToken());
		}
		
		
		System.out.println();
		String exp="1,��õ��,100,100,100|2,�ڼ���,95,80,90|3,���ڹ�,80,90,90";
		StringTokenizer st2 = new StringTokenizer(exp,"|,");
		while(st2.hasMoreTokens()) {
			System.out.println(st2.nextToken());
		}
		
	}
}
