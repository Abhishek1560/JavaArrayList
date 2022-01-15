package coding1;
   import java.util.ArrayList;
   
   public class ArrayListInteger {

	public static void main(String[] args) {
		ArrayList<Integer> myNums = new ArrayList<Integer>();
		    myNums.add(40);
		    myNums.add(20);
		    myNums.add(25);
		    myNums.add(10);
		    
		    for (int i : myNums)  {
		    	System.out.println(i);
		   }
	  }
}
