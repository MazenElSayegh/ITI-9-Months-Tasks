import java.lang.Exception;


public class Methods {
	public void textCheck(String item) throws MyException{
		if(item==null) 
		{	throw new MyException("NULL"); }
		if(item.equals("Method")) 
		{	throw new MyException("Duplicate"); }
		System.out.println(item);
	}
	public void timeCheck(Float time) throws MyException{
		if(time<0.0)
		{ throw new MyException ("Time can't be negative"); }
		if(time>24.0)
		{ throw new MyException ("Time can't be more than 24:00"); }
		System.out.println("It's "+(time-12)+" O'clock");
		
		
	}
	public void infinityCheck(int up,int domain) throws MyException{
		if(domain==0)
		{  throw new MyException ("Infinity"); }
		System.out.println("Number ="+(up/domain));
	}
}





  
