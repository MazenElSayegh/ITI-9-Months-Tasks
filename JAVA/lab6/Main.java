import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.lang.*;

public class Main {

    public static void main(String[] args) {
        CharWord CharWord = new CharWord();
		String str="Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lamia Ipsum has been the industry's standard dummy text ever since the, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged.";
		str.replaceAll(".,","");
		str.replaceAll("[0-9]","");
		String arrOfStr[]=str.split(" ");
        
		for(int i=0;i<arrOfStr.length;i++)
		{
			CharWord.storeWord(arrOfStr[i]);
		}

        /*CharWord.printKeys();
        System.out.println("----------------------------------------------");
        System.out.println("----------------------------------------------");*/
        
        CharWord.printKeyWithValues();
        System.out.println("----------------------------------------------");
        System.out.println("----------------------------------------------");
        if(args.length>0){
			for(int j=0;j<args.length;j++)
			{
					CharWord.printWordByChar(args[j].charAt(0));
			}      
		}	    
    }
}

