package api;

public class Value {
	int value;
	public Value(int value) {
		super();
		this.value=value;
	}
	
	//�ּҺ񱳰� �ƴ� �� �� ������
	@Override
	public boolean equals(Object obj) {
		//Object obj=value2;
		//obj instanceof Value : obj�� Value ��ü�� ��ȯ�� �� �ִ��� Ȯ��
		
		if(obj instanceof Value) {
			//���� Ÿ���� ���� ����ȯ
			Value v=(Value) obj;
			
			if(this.value == v.value) {
				return true;
			}
		}
		return false;
	}
}
