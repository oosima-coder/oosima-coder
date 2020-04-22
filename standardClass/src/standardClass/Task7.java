package standardClass;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
public class Task7 {
	public static void main(String[] args) {
		Calendar cal2 = Calendar.getInstance();
		System.out.print("現在日時: ");
		System.out.print(cal2.get(Calendar.YEAR) + "年");
		System.out.print(cal2.get(Calendar.MONTH) + 1 + "月");
		System.out.println(cal2.get(Calendar.DAY_OF_MONTH) + "日");
		
		cal2.add(Calendar.DAY_OF_MONTH, 7);
		System.out.print("１週間後: ");
		System.out.print(cal2.get(Calendar.YEAR) + "年");
		System.out.print(cal2.get(Calendar.MONTH) + 1 + "月");
		System.out.println(cal2.get(Calendar.DAY_OF_MONTH) + "日");
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
		Date date = new Date();

		cal2.setTime(date);
		cal2.add(Calendar.YEAR, 1);
		Date oneday = cal2.getTime();
		System.out.print("１年後  : " + sdf.format(oneday));
		String [] weekDay = {"日", "月", "火", "水", "木", "金", "土"};
		int week = cal2.get(cal2.DAY_OF_WEEK);
		System.out.println("(" + weekDay[week - 1] + ")");
		
		//System.out.println(cal2.get(Calendar.DAY_OF_WEEK) );
	}
}