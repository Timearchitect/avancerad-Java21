import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ArrayerExample {

	public static void main(String[] args) {
		
		// Arrays  är som en omslagsklass fast inte, en statisk klass
		
		String[] array = new String[2]; // init
		array = new String[]{"tic","tac","toe"};
		String [] array2 = {"hej","tjena","Hejsan"}; // init
		
		//2d array
		String [][] array3 = {array,array2}; // init
		int [] array4 = {10,1000,1,100}; // init

		array[0] = "hello";
		Arrays.sort(array4);  //bokstavordning & storleksordning

		System.out.println(Arrays.toString(array));
		System.out.println(Arrays.deepToString(array3));
		System.out.println(array[0]);
		System.out.println(Arrays.toString(array4));

		
		ArrayList<String> arraylist= new ArrayList<String>(); // inga primära datatyper men omslagsklass
		arraylist.add("Alrik");
		arraylist.add("Hussam");
		arraylist.add("Ali");
		ArrayList<String> arraylist2= new ArrayList<>( Arrays.asList(array) ); 
		ArrayList<String> arraylist3= new ArrayList<String>(){
            {
                add("Grit");
                add("academy");
                add("java21");
            }
        };
    	ArrayList<String> arraylist4= new ArrayList<String>(){
            {
                addAll(Arrays.asList("O","X"));
            }
        };
        arraylist.remove(2);
        arraylist.remove("Alrik");
        arraylist.addAll(Arrays.asList(array));  // de som har interface Collections
        
		System.out.println("arl"+arraylist);
		System.out.println("arl2"+arraylist2);
		System.out.println("arl3"+arraylist3);
		System.out.println("arl4"+arraylist4);
		
		arraylist.clear();
		System.out.println("arl"+arraylist);
		System.out.println( "contains 'X': "+arraylist4.contains("X") );
		
	   try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}   
		//List list= new List();
		for (String string : arraylist2) {
			System.out.println("foreach: "+string);
		}
		System.out.println(arraylist2.size());

		
		ArrayList<String> clonedArray = (ArrayList<String>) arraylist4.clone();
		clonedArray.set(0,"A");
		
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
     
		
		for (Iterator iterator = arraylist4.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println("foreach iterator: "+string);
		}
		
		
		for (String string : clonedArray) {
			System.out.println("foreach: "+string);
		}
		
		 
		
	}

}
