public class Censor
{
	public static void main(String[] args)
	{
		String line;
		String[] badwords = {"Frag", "lawn", "broken"};

		line = "The Frag fragger fragging lawnfragmower is broken.";
		System.out.println("Original Line:");
		System.out.println(line);
		System.out.println("Censored Line:(frag)");
		
		System.out.println(    crtc(line, "frag")    );
		
		
		
		System.out.println("Original Line:");
		System.out.println(line);
		System.out.println("Censored Line:(Frag, lawn, broke)");
		
		System.out.println( crtc(line, badwords));
	}

	public static String crtc(String source,String badword)
	{	//censor by snipping out the bad words.
		//badsubst is a substitution string for bad words
		int badpos;
		int badlen;
		String badsubst;

		badsubst="*****************************";
		badlen = badword.length();

		badpos=source.toLowerCase().indexOf(badword.toLowerCase()); //find 1st bad word
		while (badpos != -1)            // continue as long as there are words to censor
		{	//replace the bad word with *'s
			source = source.substring(0, badpos)      // up to the start of the bad word
					+badsubst.substring(0, badlen)    // same length as badword but now *'s
					+source.substring(badpos+badlen); // the remaining string after the badword
			badpos=source.toLowerCase().indexOf(badword.toLowerCase(), badpos+badlen); // the next bad word
		 }
		 return source;
	}

	public static String crtc(String source, String[] badwords)
	{
		int counter;
		for (counter=0; counter<badwords.length; counter++)
		{
			source = crtc(source, badwords[counter]);
		}
		return source;
	}
}










