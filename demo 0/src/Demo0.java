import java.util.Iterator;
import java.util.Scanner;

public class Demo0 {
	
	// ctrl + space main sysout
	public static void main(String[] args) {
		System.out.println(args[1]);
		Scanner scan = new Scanner(System.in);
		
		
		boolean flagga = true;
		byte bit8 = 127;
		int siffra = -5;
		
		float decimaltal = 0.55f;
		short kort = 123;
		char symbol= '@';
		String Text= "hello";
		long stortHeltal = 12345876L;
		double stortDecimaltal = 0.12354456315845D;
		
		int[] array =  {888,999,111,555,22,6};
		
		// Omslagsklasser / wrapperclass
		
		String foo = "hello";
		
		if(true) {
			System.out.println( 5 + 5 * 2 );
			System.out.println(Integer.parseInt("123"));
		}else if(true)
			System.out.println("false!!!");
		else
			System.out.println(Integer.parseInt("888"));
			
		switch(8) {
		
			case 0:
				System.out.println("zero");
			break;

			case 1:
				System.out.println("one");
			break;
			
			default:
				System.out.println("resten");		
		
		}
		 
		int bar = 100;
		do{
			System.out.println("do while"+ bar);		
			bar += 1;
		}
		while(bar < 3 );
		
		
		// deklaration;condition; repeterande kod
		for(int i = 10 ; i>0; i-=1 )
			System.out.println("countdown "+ i);		
		
		
		
		
		loopDemo(array);
		
		
		
		
		
		//	System.out.println(Boolean.parseBoolean("TRUE"));
		
		 
		
		myFunction("hej");
		System.out.println("input password: " );
		
		String answer =scan.next(); // ett ord
		
		
		answer += scan.nextLine();  // resten
		
		System.out.println(answer );
		
		
		int answerNumber = scan.nextInt();
		System.out.println(answerNumber );
		
		
		
		
		
	}

	private static void loopDemo(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		for (int element : array) {
			System.out.println("for each" + element);
		}
	}
	
	public static void myFunction( String input  ) {
		System.out.println("test"+ input  );	
	}
	
	
	
}
