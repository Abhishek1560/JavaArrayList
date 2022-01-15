package coding1;
      import java.util.ArrayList;
      import java.util.Collections;
public class ArrayListSort1 {

	public static void main(String[] args) {
		ArrayList<Integer> myNums = new ArrayList<Integer>();
	    myNums.add(40);
	    myNums.add(20);
	    myNums.add(25);
	    myNums.add(10);
	    
	    Collections.sort(myNums);
	    for (int i : myNums)  {
	    	System.out.println(i);
	   }

	}

}
