package coding1;
   import java.util.ArrayList;

   public class ArrayListRemoveClear {

	public static void main(String[] args) {
		ArrayList<String> Cars = new ArrayList<String>();
		   Cars.add("Ferrari");
		   Cars.add("Swift");
		   Cars.add("BMW");
		   Cars.add("Skoda");
		   Cars.add("Ford");
		   
		   Cars.remove(2);
		   //Cars.clear();
		   
		   System.out.println(Cars);
		   
	 }

}
