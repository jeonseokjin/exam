package access;

import sun.jvm.hotspot.code.SingletonBlob;

/*
 * �̱��� ���� : �� �ϳ��� �ν��Ͻ��� ���
 * 1.�����ڸ� private ���� �ۼ�
 *  -�ڵ����� �����ڸ� ����� ���θ� public ���� ������ ����
 * 2.Ŭ���� ���ο� static ���� ������ �ν��Ͻ� ����
 * 3.�ܺο��� ���� ������ public �޼ҵ� �ۼ�
 */
public class Signleton {
	private static Singleton= new Singleton;
	private Signleton() {}
	public static SingletonBlob getInstance() {
		if(singleton==null) {
			singleton=new Singleton();
		}
		return singleton;
	}
}
