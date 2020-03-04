package spielwiese;

public class StringReplaceChar {
	
	public static void main(String[] args) {
		String myString = "C:\\javaTraining\\solide\\articlesPhotos\\Adil\\poignee de Mercedec_1.jpg";
		 myString.replace( "\\", "%2F");
		 myString.replace( ":", "%3A");
		 myString = myString.replace( "\\", "%2F").replace( ":", "%3A").replace( "/", "%2F").replace( " ", "%20");
		 System.out.println( myString);
		 
		 String myString2 = "DE 001";
		 myString2 = myString2.replace(" " , "-");
		 System.out.println("index of first character ist:" + myString2.indexOf("D"));
		 System.out.println(myString2);
	}

}
