package enumtest;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class EnumWeekEx {
	public static void main(String[] args) {
		Week today = null;
		
		
		//���ó�¥
		LocalDate now = LocalDate.now();
		//System.out.println(now); //2022-03-14
		
		
		//���Ͽ� ���� ���ڸ� ���� ��(1)~��(7)
		DayOfWeek week=now.getDayOfWeek();
		//System.out.println(week.getValue());
		
		switch (week.getValue()) {
		case 1 : 
			today = Week.MONDAY; //today : ������
			break;
		case 2 : 
			today = Week.TUESDAY;
			break;
		case 3 : 
			today = Week.WEDNESDAY;
			break;
		case 4 : 
			today = Week.THURSDAY;
			break;
		case 5 : 
			today = Week.FRIDAY;
			break;
		case 6 : 
			today = Week.SATURDAY;
			break;
		case 7 : 
			today = Week.SUNDAY;
			break;
		}
	}

}
