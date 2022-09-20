package test3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;



public class Jparse {

	public static void main(String[] args) throws FileNotFoundException, IOException  {
		 JSONParser parser = new JSONParser();
		 
		 try {
			 JSONArray a = (JSONArray) parser.parse(new FileReader("test3/Materiallista.json"));
		  for (Object o : a)
		  {
			    
		    JSONObject entry = (JSONObject) o;

		    String Item = (String) entry.get("Item");
		    System.out.println(Item);

		    String AmountPerUnit = (String) entry.get("Amount per unit");
		    System.out.println(AmountPerUnit);
		    
		    String total = (String) entry.get("Total amount");

		    System.out.println(total + "->"+extractAndCalulate(AmountPerUnit)+"\n--------------");
		    		

		    
		  }
		 }catch(ParseException e) {
			 
			 
		 }catch(FileNotFoundException e) {
			 
			 System.err.println("file not found!");
		 }
	}
	
	public static String extractAndCalulate(String input) {
		if(input!="") {
			String data[] = input.split("[^\\d]");
			System.out.println(Arrays.toString(data));
			if(data.length>0) 
					return String.valueOf((Integer.parseInt(data[0])*Integer.parseInt(data[3])));
			else 
				return "";
		}
		return "";
	}
}
