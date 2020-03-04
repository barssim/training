package spielwiese;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyPattern {
	
	private String replaceWithPercent(String str)
	{
		String[] lstWildCards = { "\\%" ,  "\\*" ,  "\\?"   };
		for ( String strWildCard : lstWildCards )
		{
			str = str.replaceAll( strWildCard, "%" );
		}
		return str;
	}
	
	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("^DE.*");
		Matcher matcher = pattern.matcher("DELKJ");
		System.out.println("found: " + matcher.find());
		
		MyPattern myPattern = new MyPattern();
		String strAdaptedString = myPattern.replaceWithPercent("sdlfkj?sdflj*sdlkfj%sdflj");
		System.out.println("adapted String: " + strAdaptedString);
		
		
		
	}

}
