package algos;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Testing
{
	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String date = sdf.format(new Date(1220227200)); 
		System.out.println(date);
		
	}
}