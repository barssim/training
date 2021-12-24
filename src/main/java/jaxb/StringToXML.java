package jaxb;

import java.io.StringReader;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.xml.sax.InputSource;
 
public class StringToXML 
{
    public static void main(String[] args) 
    {
        final String xmlStr = "<employee>sljg</employee>";
        org.w3c.dom.Element e, ei, de;
        org.w3c.dom.Text tn; 
         
        //Use method to convert XML string content to XML Document object
        javax.xml.parsers.DocumentBuilderFactory dbf = javax.xml.parsers.DocumentBuilderFactory.newInstance();
        try {
			javax.xml.parsers.DocumentBuilder db = dbf.newDocumentBuilder();
        Document doc =  db.newDocument();   
        
//        doc = convertStringToXMLDocument( xmlStr );
        
        e = doc.createElement("ROOT");   
        doc.appendChild(e);
        for(int i=1; i<10; i++)
        {
         ei = doc.createElement("Zahl");
         tn = doc.createTextNode(Integer.toString(i));
         ei.appendChild(tn);
         e.appendChild(ei);
        }    
        de = doc.getDocumentElement();
         
        //Verify XML document is build correctly
        org.w3c.dom.NodeList list = doc.getDocumentElement().getChildNodes();
        for(int i=0; i < list.getLength(); i++){
        	org.w3c.dom.Node n = list.item(i);    
         System.out.println(n.getNodeName() 
                 + ": " + n.getTextContent());
        }
        } catch (ParserConfigurationException ex) {
        	// TODO Auto-generated catch block
        	ex.printStackTrace();
        }
    }
        
        private static Document convertStringToXMLDocument(String xmlString) 
        {
            //Parser that produces DOM object trees from XML content
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
             
            //API to obtain DOM Document instance
            DocumentBuilder builder = null;
            try
            {
                //Create DocumentBuilder with default configuration
                builder = factory.newDocumentBuilder();
                 
                //Parse the content to Document object
                Document doc = builder.parse(new InputSource(new StringReader(xmlString)));
                return doc;
            } 
            catch (Exception e) 
            {
                e.printStackTrace();
            }
            return null;
        }
    }