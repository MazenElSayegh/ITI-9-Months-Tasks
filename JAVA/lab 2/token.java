import java.util.StringTokenizer;
class token {
//Your program begins with a call to main()

    public static void main(String args[]) 
	{
        
		if(args.length>0)
		{
			StringTokenizer str = new StringTokenizer(args[0], " ");
			int count = 0;
	
			
	
			System.out.print("Number of tokens=");
			System.out.println(str.countTokens());

		}
		else
			System.out.println("No Data");
	}
}