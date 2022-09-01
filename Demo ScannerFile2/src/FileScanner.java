import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileScanner {

	public static void main(String[] args) {
		File file = new File("src/lorem.txt");
		try {
			Scanner scan = new Scanner(file);
			String data="";
//			while(scan.hasNext()) {
//				Thread.sleep(70);
//				data += scan.next()+" ";
//				System.out.println(scan.next());
//			}
			while(scan.hasNextLine()) {
				Thread.sleep(200);
				data += scan.nextLine()+"\n";
			}
			System.out.println(data);
			
		} catch (FileNotFoundException  |  java.util.NoSuchElementException | InterruptedException e ) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
