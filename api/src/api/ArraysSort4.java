package api;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysSort4 {
	public static void main(String[] args) {
		String arr1[]= {"���ѹα�","�츮����","����","�뱸","�λ�","����"};
		
		Arrays.sort(arr1);
		System.out.println(Arrays.toString(arr1));
		
		Arrays.sort(arr1,Comparator.reverseOrder());
		System.out.println(Arrays.toString(arr1));
	}
}
