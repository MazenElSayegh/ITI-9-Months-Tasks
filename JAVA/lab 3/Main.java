import java.util.function.Function;

public class Main {
	
	public static void main (String args[])
	{
		Function <Quad, Roots > convert = new Solve();
		Quad q = new Quad(1.0,-4.0,3.0);
		Roots r = convert.apply(q);
		if(r==null)
                System.out.println("Not Number");
        else
			{
				System.out.print("x1= ");
				System.out.println(r.GetRoot1());
				System.out.print("x2= ");
				System.out.println(r.GetRoot2());
			}
        	
		
	}
} 






  
