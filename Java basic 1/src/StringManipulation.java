
public class StringManipulation {

	public static void main(String[] args) {
		String text= " Lorem ipsum ";
		
		System.out.println(text.substring(2,5));
		System.out.println(text.trim());
		System.out.println(text.toUpperCase());
		System.out.println(text.toLowerCase());
		System.out.println(text.contains("ip"));
		System.out.println(text.replace("m", ""));
		System.out.println(text.length());
	}

}
