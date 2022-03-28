package api;

public class StringCount {
	public static void main(String[] args) {
		String str1="aabbccAABBCCaa";
		
		int cnt=count(str1,"aa",0);
		System.out.println("���� ���ڿ��� aa ������ "+cnt+" �� ���Խ��ϴ�.");
	}
	public static int count(String src, String key, int pos) {
		//key�� �ش��ϴ� ������ ��� ���Դ°�?
		int count = 0;
		int index = 0;
		
		if(key==null || key.length()==0) {
			return -1;
		}
		while((index=src.indexOf(key,pos))!=-1) {
			count++;
			pos=index+key.length();
		}
		return count;
	}
}
