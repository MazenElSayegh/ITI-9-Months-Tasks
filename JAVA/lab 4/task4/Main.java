

class Main {
	public static void main (String args[])
	{
		if(args.length==2)
		{
			String str1= args[0];
			String str2=args[1];
		
			Better check= (s1,s2) -> (s1.length()>s2.length());
			if(check.betterString(args[0],args[1]))
			{
				System.out.println("First string is bigger than the second");
			}
			else
			{
				System.out.println("Second string is bigger than the first");
			}
		}
		else
		{		
			Better check= (s1,s2) -> (s1.length()>s2.length());
			if(check.betterString("Mazen","Mohamed"))
			{
				System.out.println("First string (Mazen) is bigger than the second (Mohamed)");
			}
			else
			{
				System.out.println("Second string (Mohamed) is bigger than the first (Mazen)");
			}
		}
	}
}