package api;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;

public class DateEx1 {
	public static void main(String[] args) {
		Date date1 = new Date();
		System.out.println(date1);
		
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy�� MM�� dd�� hh:mm:ss");
		System.out.println(sdf.format(date1));
		
		Calendar today = Calendar.getInstance();
		System.out.println("���� ���� "+today.get(Calendar.YEAR));
		System.out.println("��(0~11), 0 :1�� "+today.get(Calendar.MONTH));
		System.out.println("�̴��� ���° �� "+today.get(Calendar.WEEK_OF_MONTH));
		System.out.println("���� �� "+today.get(Calendar.MINUTE));
		
		LocalDate date2=LocalDate.now();
		System.out.println(date2);
		
		LocalTime time1=LocalTime.now();
		System.out.println(time1);
		
		LocalDateTime date3=LocalDateTime.now();
		System.out.println(date3);
	}
}
