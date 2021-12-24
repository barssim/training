package de.solide.training.date;

public class AboutString {

	public static void main(String[] args) {
		String myString = "IOROP:SAPERP:D01:1003924456|00000001";
		String strWithBackslash = "<SOAP-ENV:Envelope xmlns:SOAP-ENV=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:add=\"http://www.w3.org/2005/08/addressing\"><SOAP-ENV:Header><add:Action>FSA</add:Action><add:ReplyTo><add:Address>1</add:Address></add:ReplyTo><add:From><add:Address>Monty</add:Address></add:From><add:To>SAP</add:To><add:MessageID>uuid:11111111-2222-3333-4444-555555555555</add:MessageID></SOAP-ENV:Header><SOAP-ENV:Body><ns8:publishServiceOrderReturn xmlns:ns3=\"http://namespace.eu.techem.corp/TechemCommon/MessageHeaders\" xmlns:ns4=\"http://namespace.eu.techem.corp/TechemCommon/Common/v2\" xmlns:ns5=\"http://namespace.eu.techem.corp/DILOCS/XSD/ReturnInfo\" xmlns:ns6=\"http://namespace.eu.techem.corp/TechemCommon/Common\" xmlns:ns7=\"http://schemas.xmlsoap.org/ws/2002/07/secext\" xmlns:ns8=\"http://namespace.eu.techem.corp/DILOCS/WSDL/ServiceOrderReturn\"><ns5:orderReturnInfo><ns5:serviceLeadingOrderID systemOrig=\"SAP\">000100658578</ns5:serviceLeadingOrderID><ns5:serviceOrderReturnCategory>administrative</ns5:serviceOrderReturnCategory><ns5:actuals><ns5:actual><ns5:date>2020-09-22+02:00</ns5:date><ns5:time>06:54:38.000+02:00</ns5:time><ns5:orderPartRef><ns5:orderPartType>operation</ns5:orderPartType><ns5:orderPartId systemOrig=\"SAP\">OV100392445600000001</ns5:orderPartId></ns5:orderPartRef><ns5:returnCode id=\"9604\" locale=\"DE\" returnCodeVersion=\"1.0\"><ns5:returnCodeName>KAVO abgeholt</ns5:returnCodeName><ns5:attributeGroup id=\"STANDARD\"><ns5:attributeGroupName>STANDARD</ns5:attributeGroupName><ns5:attribute><ns6:key id=\"KEY\">STATUS_DATUM</ns6:key><ns6:value id=\"VALUE\">22.09.2020</ns6:value><ns6:dataType length=\"50\">string</ns6:dataType></ns5:attribute><ns5:attribute><ns6:key id=\"KEY\">STATUS_MA</ns6:key><ns6:value id=\"VALUE\">01081900</ns6:value><ns6:dataType length=\"50\">string</ns6:dataType></ns5:attribute></ns5:attributeGroup></ns5:returnCode></ns5:actual></ns5:actuals></ns5:orderReturnInfo></ns8:publishServiceOrderReturn></SOAP-ENV:Body></SOAP-ENV:Envelope>";
		// TODO Auto-generated method stub
		String stringWithoudSeparator = myString.substring(17).replace("|", ""); 
	    System.out.println(stringWithoudSeparator);
	    
	    String stringWithoudBackSlash = strWithBackslash.replace("\\", ""); 
	    System.out.println(stringWithoudBackSlash);

	}

}
