import java.util.Random;
class MaxandMin {
//Your program begins with a call to main()

    public static void main(String args[]) {
        Random rd= new Random(); //creating random object
		int arr[]= new int[1000];
		for(int i=0; i<arr.length ; i++)
		{
			arr[i]=rd.nextInt();
			//System.out.println(arr[i]);
		}
		System.out.print("Running Time before sort: ");
		System.out.println(System.nanoTime());
	
		MaxandMin.bubbleSort(arr);
		System.out.print("Running Time after sort: ");
		System.out.println(System.nanoTime());
		/*System.out.println("Sorted Array in Ascending Order:");
		for(int i=0; i<arr.length ; i++)
		{
			System.out.println(arr[i]);
		}*/
		int location;
		/*location=MaxandMin.binarySearch(arr);
		System.out.print("Running Time after binary search: ");
		System.out.println(System.nanoTime());*/
		System.out.print("Max=");
		System.out.println(arr[0]);
		System.out.print("Min=");
		System.out.println(arr[999]);
					
      }
	  
	/*public static int binarySearch(int ar[])
	{
		int middle;
		int loc=-1;
		int x=10;
		int Min=ar[0];
		int Max=ar[999];
		while(Min<=Max)
		{
			middle=(Min+Max)/2;
			if(ar[middle]==x)
			{
				loc=middle;
			}
			else if(ar[middle]<x)
			{
				Min=middle+1;
			}
			else
			{
				Min=middle-1;
			}
		}
		return loc;
	}*/
	 
	public static void bubbleSort(int arr[]) 
	{
		int size = arr.length;
    
		// loop to access each array element
		for (int i = 0; i < size - 1; i++)
    
			// loop to compare array elements
			for (int j = 0; j < size - i - 1; j++)

				if (arr[j] > arr[j + 1]) 
				{

					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
	}
}


  
