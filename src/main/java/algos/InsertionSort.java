package algos;

public class InsertionSort
{
	public static void main(String[] args) {
	//initial array 
	int a[] = {8,2,4,9,3,6};
	int i,j,key;
	System.out.println("Initial Arrays");
	for(int k = 1; k<a.length;k++)
		System.out.print(a[k] + " ");
	
	for(j=1; j<a.length;j++)
	{
		key=a[j];
		i=j-1;
		while(i>0 & a[i]>key)
		{
			a[i+1]=a[i];
			i--;
			
		}
		a[i+1]=key;
	}
	
	System.out.println();
	System.out.println("Sorted Arrays");
	for(int k = 1; k<a.length; k++)
		System.out.print(a[k] + " ");
	
	}	
}
