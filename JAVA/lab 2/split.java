import java.io.*;
class occurr 
{
//Your program begins with a call to main()

    public static void main(String args[]) 
	{
        String str = " Hello Mazen my name is Mazen what is your name Mazen ";
		
		if(args.length>0)
		{ 	String word = args[0];
			System.out.print("The word occurrs: ");
			System.out.print(countOcc(str, word));
			System.out.println(" times");
		}
		else
			System.out.println("No Data");
     }

 
	static int countOcc(String str, String word)
	{	
		String val[] = str.split(word);
		int count=val.length-1;
		
 
		/*int count = 0;
		for (int i = 0; i < val.length; i++)
		{
		if (word.equals(val[i]))
        count++;
		}*/
		

 
    return count;
	}	
	
	

} 