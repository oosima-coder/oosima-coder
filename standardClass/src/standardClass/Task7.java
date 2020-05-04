package standardClass;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
public class Task7 {
	public static void main(String[] args) {
		Calendar cal2 = Calendar.getInstance();
		Calendar cal3 = Calendar.getInstance();
		Date date = new Date();

		cal2.setTime(date);
		cal3.setTime(date);

		cal2.add(Calendar.DAY_OF_MONTH, 7);
		Date afterWeek = cal2.getTime();

		cal3.add(Calendar.YEAR, 1);
		Date oneday = cal3.getTime();

		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日");
		//現在日時を表示
		System.out.println("現在日時: " + sdf1.format(date));
		//一週間後を表示
		System.out.println("１週間後: " + sdf1.format(afterWeek));
		//一年後を表示
		System.out.print("１年後  : " + sdf1.format(oneday));
		//曜日
		String [] weekDay = {"日", "月", "火", "水", "木", "金", "土"};
		int week = cal3.get(Calendar.DAY_OF_WEEK);
		System.out.println("(" + weekDay[week - 1] + ")");

		//System.out.println(cal2.get(Calendar.DAY_OF_WEEK) );
	}
}