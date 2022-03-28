package io;

import java.io.File;
import java.io.FileWriter;
import java.io.Writer;
import java.util.Scanner;

public class FileWriterEx2 {
	public static void main(String[] args) {
		//사용자로부터 데이터 입력받기 : Scanner 사용
		//output1.txt 파일 생성
		//입력받은 데이터를 파일 출력
		File f=new File("C:\\Users\\seok jin jeon\\Desktop\\seok jin\\test\\output1.txt");
		
		if(!f.exists()) {
			try {
				f.createNewFile();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		try(Scanner sc=new Scanner(System.in); 
		Writer writer =new FileWriter(f)) {
			//입력받은 데이터를 파일 출력 : output.txt
			System.out.println("데이터를 입력(q를 입력하면 종료) >> ");
			
			String input= "";
			while(!(input=sc.nextLine()).equalsIgnoreCase("q")) {
				writer.write(input+"\r\n");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
