
public class ClassExample {

	public static void main(String[] args) {
		Book bok = new Book("Programming for dummies");
		AudioBook abok= new AudioBook("Alrik självbiografi");
		bok.read("testing");
		abok.read();
		
		System.out.println( bok.read() );
		
		
		
		
		
	}

	public static class Book {
		String content = "Lorem ipsum", title = "unknown";
		
		Book(String _title){
			title = _title;
			System.out.println("Instansiated Book : "+ title);

		}
		
		public String read() {
			System.out.println("reading: "+ content);
			return content;
		}
		public String read( String customText) {
			System.out.println("reading custom lines: "+ customText);
			return content;
		}
		
	}
	
	public static class AudioBook extends Book {
		AudioBook(String _title) {
			super(_title);   // 
			// TODO Auto-generated constructor stub
		}
		
		@Override
		public String read() {
			System.out.println("reading: "+ content);
			return content;
		}
		
	}
	
	
}
