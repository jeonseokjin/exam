package api;

import java.util.Arrays;
import java.util.Comparator;

public class ArrysSort3 {
	public static void main(String[] args) {
		String arr[]= {"good","height","very","apple","zero","zoo"};
		
		//�������� ����
		//=> Arrays.sort(arr);
		
		//�������� ����
		Arrays.sort(arr,Comparator.reverseOrder());
		System.out.println(Arrays.toString(arr));
	}
}
