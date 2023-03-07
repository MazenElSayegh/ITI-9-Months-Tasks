import java.util.function.Function;
import java.lang.Math;

public class Solve implements Function<Quad,Roots> {
	public Roots apply(Quad coef) {
		
		Roots root= new Roots();
		double underRoot= (coef.getB())*(coef.getB())-4*coef.getA()*coef.getC();
		double real=-coef.getB()/(2*coef.getA());
		double imag=0;
		Double check= Math.sqrt(underRoot);
		/*if (underRoot<0)
		{
			underRoot=underRoot*-1;
		}*/
		if(check.isNaN())
          {  
              root=null;             
             
          }
		else
		{
			imag=Math.sqrt(underRoot)/(2*coef.getA());
			root.SetImag(imag);
			root.SetReal(real);
		}
		
		return root;
	}
}






  
