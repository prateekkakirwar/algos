package algos;

public class SelectionSort {
	
	public static void main(String args[])
	{
		int[] a = {10,20,30,40,4,15,25};
		
		int i, j, iMin;
		
		System.out.println("Before : ");
		
		for (i = 0; i < a.length ; i++)
		{
			System.out.print( a[i] + ", " );
		}
		
		for (i = 0; i < a.length ; i++)
		{
			iMin = i;
			
			for (j = i; j < a.length ; j++)
			{
				if (a[j] < a[i])
				{
					iMin =j;
				}
				
			}
			
			swap(iMin,i,a);
			
		}
		
		System.out.println("\nAfter : ");
		
		for (i = 0; i < a.length ; i++)
		{
			System.out.print( a[i] + ", " );
		}
		
		
	}

	private static void swap(int iMin, int i, int[] a) {
		int temp;
		temp = a[i];
		a[i] = a[iMin];
		a[iMin] =  temp;	
		
	}

}
