package io;

import java.io.IOException;
import java.io.InputStream;

public class InputStreamEx1 {
	public static void main(String[] args) {
//		//�Է� : Ű����
//		InputStream in=System.in; //System.in => Ű���� //System.out => ȭ��
//		int input=0;
//		try {
//			while(in.read()!=-1) {
//				//read() : �� ����Ʈ�� �о��
//				
//			System.out.println((char)input);
//			}
//		} catch (IOException e) {
//			e.printStackTrace();
//		} finally {
//			try {
//	 			in.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		} 
//		
		//try-with-resource ���·� ����
		try(InputStream in=System.in) {
		    int input=in.read();
			System.out.println((char)input);
			}
		 	catch (IOException e) {
			e.printStackTrace();
		}
	}
	}

