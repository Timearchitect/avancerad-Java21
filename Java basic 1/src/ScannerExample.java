import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bok nybok = new Bok("Wizard of oz"); // instansierar
		nybok.read(); 
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Vad heter du?");

		String answer= scanner.next();
		
		System.out.println("Är du myndig? sant/falsk");
		
		boolean myndig= scanner.nextBoolean();
		
		System.out.println("vad är din hobby?");
		
		String hobby = scanner.next();
		hobby = scanner.nextLine(); 
		
		System.out.println(hobby);
	}

}
