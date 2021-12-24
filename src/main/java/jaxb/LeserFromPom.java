package jaxb;

import java.io.File;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;

public class LeserFromPom {

	private void
			readDescription(String fileName) throws Exception {
		String strDescription = null;
		Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new File(fileName));
		XPath xPath = XPathFactory.newInstance().newXPath();
		strDescription = xPath.compile("/project/description").evaluate(doc);
		System.out.println("the description is:" + strDescription);

	}

	public static void
			main(String[] args) {
		LeserFromPom leserFromPom = new LeserFromPom();
		try {
			leserFromPom.readDescription("pom.xml");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
