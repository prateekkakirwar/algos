package algos;

public class InsertionSort
{
	public static void main(String[] args) {
	//initial array 
	int a[] = {9,1,24,5,2};
	int i,j,key;
	System.out.println("Initial Arrays");
	for(int k = 0; k<a.length;k++)
		System.out.print(a[k] + " ");
	
	for(j=1; j<a.length;j++)
	{
		key=a[j];
		i=j-1;
		while(i>=0 && a[i]>key)
		{
			a[i+1]=a[i];
			i--;
			
		}
		a[i+1]=key;
		System.out.println();
		for(int k = 0; k<a.length; k++)
			System.out.print(a[k] + " ");
	}
	
	}	
}
