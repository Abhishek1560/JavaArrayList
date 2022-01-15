package coding1;
   import java.util.ArrayList;
   import java.util.Collections;

public class ArrayListSort {

	public static void main(String[] args) {
		ArrayList<String> Cars = new ArrayList<String>();
	       Cars.add("Ford");
	       Cars.add("BMW");
	       Cars.add("Skoda");
	       Cars.add("Audi");
	       
	       Collections.sort(Cars);
	          for(String i : Cars)   {
	    	  System.out.println(i);
	    	 
	     }
	}
}
