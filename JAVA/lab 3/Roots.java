
public class Roots 
{
	
	private double real, imag;
	public Roots()
		{
			real=imag=0;
		}
	public void SetReal(Double x)
		{ real=x;	 }	
	public void SetImag(Double y)
		{ imag=y;	 }
	public double GetReal()
	{  return real; }	
	public double GetImag()
	{  return imag; }
	public double GetRoot1()
	{ return (real+imag); }
	public double GetRoot2()
	{ return (real-imag); }	
}






  
