package exception;

import java.io.FileInputStream;


/*
 *  try{} : �ܵ� ��� �Ұ�
 *  try{}catch{}
 *  try{}finally{}
 *  try{]catch{]finally{} : ó�� ���� ���־���Ѵ�.
 */
public class FileInputEx {
	public static void main(String[] args) {
//		FileInputStream fis=null;
//		try {
//			fis = new FileInputStream("file.txt"); 
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {  //�ڿ�����
//			try {
//				fis.close();
//			} catch (Exception e2) {
//				e.printStackTrace();
//			}
		try(FileInputStream fis=new FileInputStream("file.txt")) {
			
		} catch(Exception e) {
		}
		
	}
}
