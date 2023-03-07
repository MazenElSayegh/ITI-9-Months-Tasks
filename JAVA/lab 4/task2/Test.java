import java.util.ArrayList;

public class Test {
	
	public void draw(ArrayList<? extends ShapeS> listArr)
	{
		System.out.println("Generic");
		for(int i=0;i<listArr.size();i++)
		{
			listArr.get(i).draw();
		}
	}
	
} 






  
