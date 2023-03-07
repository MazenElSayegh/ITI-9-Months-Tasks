class IP {
//Your program begins with a call to main()

    public static void main(String args[]) {
        
		String ip = "172.180.45.13";
	
	String sectors[] = ip.split("\\.");
	
	for(int i =0; i<sectors.length; i++)
	{
		System.out.println(sectors[i]);
	}

	}
}