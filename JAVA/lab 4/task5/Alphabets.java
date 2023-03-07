import java.util.*;

class Alphabets
{
	public static void main(String args[])
	{
		if(args.length>0)
		{
			String str=args[0];
			CheckString check=(s)->
			{
				char c;
                int i=0;
                while(i<s.length())
                {
                    c=s.charAt(i);
					if(Character.isLetter(c)) //check if letter
					{ i++; }
					else if(c==' ') // to neglect spaces
					{ i++; }
					else //not a letter
					{ return false; }
				}
		
				return true;
			
			};
			boolean boo=check.isLetter(str);
			if(boo==true)
			{
				System.out.print("The String contains only Alphabets");
			}
			else
			{	
				System.out.print("The String doesn't contain only Alphabets");
			}
		}
		else
			System.out.println("Please enter a string");
	}
}

interface CheckString{
	boolean isLetter(String str);
}