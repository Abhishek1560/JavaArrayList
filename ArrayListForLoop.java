package coding1;
    import java.util.ArrayList;

   public class ArrayListForLoop {

	public static void main(String[] args) {
	   ArrayList<String> Cars = new ArrayList<String>();
	       Cars.add("Ford");
	       Cars.add("BMW");
	       Cars.add("Skoda");
	       Cars.add("Audi");
	       
	       for(int i=0; i<Cars.size(); i++) {
	    	  //for(String i : Cars)   
	    	  //System.out.println(i);
	    	  System.out.println(Cars.get(i));
	     }
      }
  }