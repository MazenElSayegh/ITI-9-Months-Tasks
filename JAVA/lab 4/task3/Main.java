
import java.math.BigDecimal;
public class Main {
	
    public static void main( String args[])
	{
		Complex <BigDecimal,BigDecimal> c1=new Complex<BigDecimal,BigDecimal>(new BigDecimal(6),new BigDecimal(9));
		Complex<BigDecimal,BigDecimal> c2 = new Complex<BigDecimal,BigDecimal>(new BigDecimal(2),new BigDecimal(3));
		Complex<BigDecimal,BigDecimal> addResult = c1.add(c2);
		Complex<BigDecimal,BigDecimal> subtResult = c1.subtract(c2);
		Complex<BigDecimal,BigDecimal> multResult = c1.multiply(c2);
		Complex<BigDecimal,BigDecimal> divideResult = c1.divide(c2);
		System.out.println("Result of adddition equal " + addResult.toString());
		System.out.println("Result of sub equal " + subtResult.toString());
		System.out.println("Result of mult equal " + multResult.toString());
		System.out.println("Result of divide equal " + divideResult.toString());
	}       
}


