import java.lang.Exception;

public class Main extends Methods{ 
public static void main(String args[]) {
	Methods meth=new Methods();
	try{
		meth.textCheck("Mazen");
		meth.timeCheck(23.0f);
		meth.infinityCheck(12,0);	
	}
	catch (MyException ex){
		ex.printStackTrace();
	}
	finally {
		System.out.println("Finally Block");
	}
}
}





  
