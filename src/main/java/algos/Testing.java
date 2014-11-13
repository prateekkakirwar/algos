package algos;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Testing
{
	public static void main(String[] args) {
		Long L = new Long(10L);
		L = null;
		long l = 10;
		
		//l = setLong(L);
		
		//System.out.println("long value is " + l);
		hello(L);
	}
	
	public static void hello(long l)
	{
		
		System.out.println("Hello");
	}
	
	public static long setLong(Long L)
	{
		return L;
	}
}