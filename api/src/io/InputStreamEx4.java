package io;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class InputStreamEx4 {
	public static void main(String[] args) {
		InputStream in=System.in;
		OutputStream out=System.out;
		
		byte arr[]=new byte[100];
		try {
			while(in.read(arr)!=-1) {
				out.write(arr);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				in.close();
				out.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	}
	}
