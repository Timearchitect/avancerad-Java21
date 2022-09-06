import java.io.File;
import java.util.Arrays;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Parser {

	public static void main(String[] args) {
		try {
			File file = new File("src/sample.xml");
			// an instance of factory that gives a document builder
			
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			// an instance of builder to parse the specified xml file
			
			DocumentBuilder db = dbf.newDocumentBuilder();
			
			Document doc = db.parse(file); //file
			
			doc.getDocumentElement().normalize(); // formaterar
			
			System.out.println("Root element: " + doc.getDocumentElement().getNodeName());
			
			//System.out.println(doc.getElementById("unique"));
			
			NodeList list = doc.getElementsByTagName("row");

	          for (int temp = 0; temp < list.getLength(); temp++) {

	              Node node = list.item(temp);

	              if (node.getNodeType() == Node.ELEMENT_NODE) {

	                  Element element = (Element) node;

	                  // get staff's attribute
	                  
	                  // get text
	                  String [] array= new String[8]; 
	                  array[0] = element.getElementsByTagName("OrderDate").item(0).getTextContent();
	                  array[1] = element.getElementsByTagName("Region").item(0).getTextContent();
	                  array[2] = element.getElementsByTagName("Rep1").item(0).getTextContent();
	                  array[3] = element.getElementsByTagName("Rep2").item(0).getTextContent();
	                  array[4] = element.getElementsByTagName("Item").item(0).getTextContent();
	                  array[5] = element.getElementsByTagName("Units").item(0).getTextContent();
	                  array[6] = element.getElementsByTagName("UnitCost").item(0).getTextContent();
	                  array[7] = element.getElementsByTagName("Total").item(0).getTextContent();

//	                  <OrderDate>1/6/2019</OrderDate>
//	                  <Region>East</Region>
//	                  <Rep1>Jones</Rep1>
//	                  <Rep2>Sharell</Rep2>
//	                  <Item>Pencil</Item>
//	                  <Units>95</Units>
//	                  <UnitCost>02.39</UnitCost>
//	                  <Total>189.05.00</Total>
	                  
	
	                  System.out.println( Arrays.toString(array));
	     

	              }
	          }
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
