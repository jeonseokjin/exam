package io;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

/*
 * InputStreamReader : 문자 변환 보조 스트림
 * 바이트 스트림 => 문자 기반
 */

public class InputStreamReaderEx1 {
	public static void main(String[] args) {
		

		try(InputStream in=new FileInputStream("C:\\Users\\seok jin jeon\\Desktop\\seok jin\\test\\file1.txt");
			InputStreamReader reader= new InputStreamReader(in);){
				char cbuf[]=new char[100];
				while(reader.read(cbuf)!=-1) {
					System.out.println(cbuf);
				}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
