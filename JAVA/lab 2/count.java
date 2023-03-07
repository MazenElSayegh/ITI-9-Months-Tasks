class typCount {
//Your program begins with a call to main()

    public static void main(String args[]) {
        
		if(args.length == 2)
			{
	
				String str = args[0];
				String word = args[1];
	
				int size = (str.length()) - (str.replaceAll(word,"").length());
	
				System.out.println("Count="+size / word.length());
			}
		else 
		{ System.out.println("This is a simple Java program.");
		}

	}
}