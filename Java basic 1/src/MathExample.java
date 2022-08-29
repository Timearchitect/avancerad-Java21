import java.util.ArrayList;
import java.util.Random;

public class MathExample {

	public static void main(String[] args) {
		// 1-5
		System.out.println(Math.floor(Math.random()*5)+ 1);
		Random rand = new Random();
		System.out.println(Math.toDegrees(Math.PI*2));
		System.out.println(Math.toRadians(180));
		System.out.println(Math.abs(-180));
		for (int i = 0; i < 10; i++) {
			System.out.println( i % 2 );
		}
		
		System.out.println( 10 * -1);
		
		
		String text= "sdfjkjdheofjvcv";
		System.out.println(text.charAt(1));
		
		ArrayList<Integer> arraylist= new ArrayList<Integer>();
		arraylist.add(88);
		arraylist.add(99);

		System.out.println(arraylist.indexOf(99));
		
		
		
		
		
	}

}
