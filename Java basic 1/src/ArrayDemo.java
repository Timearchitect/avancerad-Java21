import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

public class ArrayDemo {

	public static void main(String[] args) {
		// Arrayer
		String[] array = new String[4];
		String[] array2 = new String[] { "hej", "yo", "hejsan" };
		System.out.println(Arrays.toString(array2));
		String[][] array3 = { array, array2 };
		int[] array4 = new int[] { 10, 1, 100, 0 };

		Arrays.sort(array4);

		array[2] = "tjenare";
		System.out.println("array4: " + Arrays.toString(array4));
		System.out.println(Arrays.deepToString(array3));

		// ArrayLists
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("Alrik");
		arrayList.add("Ali");
		arrayList.add("Hussam");

		ArrayList<String> arrayList2 = new ArrayList<>() {
			{
				add("hej");
				add("hej");
				add("hej");
			}
		};
		arrayList2.addAll(Arrays.asList(array));
		// arrayList2.clear();
		arrayList.remove("Ali");
		System.out.println(arrayList);
		System.out.println(arrayList2);

		ArrayList<String> arrayList5 = (ArrayList<String>) arrayList2.clone();
		arrayList5.set(0, "hello");

		System.out.println(arrayList2);

		System.out.println(arrayList5);
		System.out.println(" test  " + arrayList2.indexOf("tjenare"));

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		for (int i = 0; i < array4.length; i++) {
			System.out.println(array4[i]);
		}

		for (String string : arrayList2) {
			System.out.println(string);
		}

		for (Iterator iterator = arrayList2.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println(string);
		}
		
		System.out.println(array.length);

		System.out.println(arrayList.size());

	}

}
