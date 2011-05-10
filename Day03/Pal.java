

import javax.swing.*;


public class Pal {
   public static void main (String [] args) {

      String word1;		//the inputted sentance
      String sentance ;	//the word that is worked on
      String trueWord;	//the saved inputted sentance
      boolean pal = true;  //is the word a palendrome
      String [] inWords = {"Able was I ere I saw Elba", "aBcdCbA", "aBcCbA",
					"aBcdeCbA", "aBcBcA", "A man, a plan, a canal: Panama",
					"He won a Toyota now, eh?", "Senile felines", "Was it a cat I saw" };

	  //alternate option
      //word1 = JOptionPane.showInputDialog ("Enter your sentance that you would like checked for Palendromisity");

      for(int i = 0; i < inWords.length; i++)
      {
		  trueWord = inWords[i];//keep the old word

		  sentance = inWords[i].toLowerCase();
		  pal = checkPal(sentance);
		  System.out.println();
		  System.out.println();

		  //output
		  if (pal)
			System.out.println (trueWord + " is a palendrome");
		  else
			System.out.println (trueWord + " is NOT a palendrome");
	  }

      System.out.println("The Program ran correctly");

      //exit the system
      System.exit(0);
   }//main


 	/**
 	* PURPOSE: checks the sentance to see if it is a palendrome
 	* @param   the string to be checked
 	* @return  boolean of if the sentance is a palendrome or not
	*/
   public static boolean checkPal(String sentance){
	   boolean isPal = false;

       System.out.println(sentance);
	   
	   if(sentance.length() <= 1)
			isPal = true;
	   else
		   if (!isLetter(sentance.charAt(0)))//get rid of first character (not a letter)
			   isPal = checkPal( sentance.substring(1) );
		   else
			   if(!isLetter(sentance.charAt(sentance.length()-1)))//get rid of last
				  isPal = checkPal( sentance.substring(0,sentance.length() - 1 ) );
			   else  //keep checking
				  if(sentance.charAt(0) == sentance.charAt(sentance.length()-1))
					 isPal = checkPal(sentance.substring(1, sentance.length() - 1));

	   return isPal;
   }
	/**
 	* PURPOSE: checks the letter to make sure it is in fact, a letter
 	* @param   the letter to be checked
 	* @return  boolean of if it is a letter or not
	*/
   public static boolean isLetter (char check){
	   boolean aLetter = false;

	   if (('a' <= check)&&(check <= 'z')||('0' <= check)&&(check <= '9'))
	   	  aLetter = true;

	   return aLetter;
   }
}
