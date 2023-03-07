import java.util.function.Function;

public class Temperature implements Function<Float,Float> {
	public Float apply(Float f) {
		return (f-32)*5/9;
		
	}
}






  
