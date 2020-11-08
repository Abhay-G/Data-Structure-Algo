import java.util.*;

public class NegativeElementsOneSide {

	public static void main(String args[])
	{
		int[] arr = {-2,1,-9,0,-3,10,5,1};
		
		int len = arr.length;
		int j = 0;
		for(int i=0;i<len;i++)
		{
			if(arr[i]<0)
			{
				swap(arr,i,j);
				j++;
			}
			
		}
		
		System.out.println(Arrays.toString(arr));
	}
	public static void swap(int arr[],int i, int j)
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
