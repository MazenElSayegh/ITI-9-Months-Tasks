class Example3 {
//Your program begins with a call to main()

    public static void main(String args[]) {
        
		if(args.length>1)
			
		{	int count=Integer.parseInt(args[0]);
			for(int i=0;i<count;i++)
		
				{ System.out.println( args[1]) ; }
		}
		else 
		{ System.out.println("This is a simple Java program.");
		}

	}
}