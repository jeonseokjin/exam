package api;

public class SystemEx1 {
	public static void main(String[] args) {
		
//		for(int i=0;i<10;i++) {
//			System.out.print(i+"\t");
//			
//			if(i==5) {
//				System.exit(0); //���α׷� ����
//			}
//		}
		
		long sum = 0;
		long start=System.currentTimeMillis();
		for(int i=1; i<10000000; i++) {
			sum+=i;
		}
		long end = System.currentTimeMillis();
		System.out.println("1~10,000,000 �� : "+sum);
		System.out.println("1~10,000,000 �� ���ϴ� �� �ɸ��� �ð� : "+(end-start)+"ms");
		
		
	}
}
