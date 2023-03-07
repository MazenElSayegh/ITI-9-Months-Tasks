import java.util.ArrayList;

public class Main {
	
	public static void main (String args[])
	{
		Test test=new Test();
		ArrayList<ShapeS> ShapeList= new ArrayList<ShapeS>();
		
		for(int i=0;i<3;i++)
		{
			if(i%2==0)
			{ ShapeList.add(new RectangleR()); }
			else
			{
				ShapeList.add(new CircleC()); 
			}
		}
		test.draw(ShapeList);
	}
        	
		
}
 






  
