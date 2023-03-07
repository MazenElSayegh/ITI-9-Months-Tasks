import java.math.BigDecimal;

public class Complex <R extends BigDecimal, I extends BigDecimal>
{
	private R real;
	private I imag;
	
	Complex(R r, I i)
	{
		real=r;
		imag=i;
	}
	public R getReal()
	{
		return real;
	}
	public I getImag()
	{
		return imag;
	}
	public String toString() 
	{		
		StringBuffer sb= new StringBuffer();
		sb.append(real);
		sb.append('+');
		sb.append(imag);
		sb.append('i');
		return sb.toString();
	}
	@SuppressWarnings("unchecked")
	public Complex <R,I> add(Complex <R,I> other)
	{
		return new Complex <R,I> ((R) (real.add(other.real)), (I) (imag.add (other.imag)));
	}
	
	@SuppressWarnings("unchecked")
	public Complex <R,I> subtract(Complex <R,I> other)
	{
		return new Complex <R,I> ((R) (real.subtract(other.real)), (I) (imag.subtract (other.imag)));
	}
	
	@SuppressWarnings("unchecked")
	public Complex <R,I> multiply(Complex <R,I> other)
	{
		return new Complex <R,I> ((R) (real.multiply(other.real)), (I) (imag.multiply (other.imag)));
	}
	@SuppressWarnings("unchecked")
	public Complex <R,I> divide(Complex <R,I> other)
	{
		return new Complex <R,I> ((R) (real.divide(other.real)), (I) (imag.divide (other.imag)));
	}
	/*
	public Complex<T, R> add(Complex<T, R> second){

		return new Complex<T,R>((T)(real.add(second.real)),(R)(imag.add(second.imag)));
	}
	
	public Complex<T, R> subtract(Complex<T, R> second){
		return new Complex<T,R>((T)(real.subtract(second.real)),(R)(imag.subtract(second.imag)));
	}
	
	public Complex<T, R> multiply(Complex<T, R> second){
		return new Complex<T,R>((T)(real.multiply(second.real)),(R)(imag.multiply(second.imag)));
	}*/
		
}



/*@SuppressWarnings("unchecked")
	public Complex <R,I> subtract(Complex <R,I> c1, Complex <R, I> c2)
	{
		return (new Complex <R,I> ((R) (c1.real.subtract(c2.real)), (I) (c1.imag.subtract(c2.imag))));
	}
	@SuppressWarnings("unchecked")
	public Complex <R,I> add(Complex <R,I> c1, Complex <R, I> c2)
	{
		return new Complex <R,I> ((R) (c1.real.add(c2.real)), (I) (c1.imag.add(c2.imag)));
	}*/
	