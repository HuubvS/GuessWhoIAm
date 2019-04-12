package BLOK_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;


/**
 * @author Huub
 * @version 1
 */
public class GuessWhoIam
{
	/**
	 * our main method
	 * 
	 * @param args			arguments
	 */
	public static void main(String[] args)
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try
		{
			// Putting text in the console:
			System.out.println("Welcome to 'Guess Who'! Let me guess your guy. Type 'yes' or 'no', followed by ENTER.");
			// Reading text from the console (click in the console and type one character, press enter):
			String s = br.readLine();
			// Putting text in the console, use '+' to concatenate Strings (stick them together):
			System.out.println("OK great! You typed: " + s + ". Now we can start for real!");
			
			////////////////// Begin of the code ///////////////////////

			String answer;
			    
				/////////////////// Mens SECTION //////////////////////
			
				System.out.println("Is it a man?");
				answer = br.readLine();
				
				if(answer.equals("yes")) {
					
				}
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
			/////////////////// LADIES SECTION //////////////////////
		
				if(answer.equals("no")) 
				{
					System.out.println("Does she wear a hat?");
					answer = br.readLine();
					if(answer.equals("yes")) 
					{
						System.out.println("Does she have brown eyes? ");
						answer = br.readLine();
						if(answer.equals("yes")) 
						{
							System.out.println("It is Tina!");
							answer = br.readLine();
						}
						
						else {
							System.out.println("It is Amber!");
						}
					}
						////////////// 2/9 ladies done //////////
					 
						else 
					 {
						System.out.println("Does she have white hair?");
						answer = br.readLine();
						if(answer.equals("yes")) 
						{
							System.out.println("Is her skin color white?");
							answer = br.readLine();
							if(answer.equals("yes")) 
							{
								System.out.println("It is Edna");
							}
							else {
								System.out.println("It is Grace");
							}
						}
						////////////// 4/9 ladies done //////////	
						
						else
						{
							System.out.println("Does she have a brown hair color?");
							answer = br.readLine();
							if(answer.equals("yes")) 
							{
								System.out.println("Does she have a chubby face?");
								answer = br.readLine();
								if(answer.equals("yes"))
								{
									System.out.println("It is Jenni!");
								}
								else
								{
									System.out.println("It is Cherie!");
								}
							}
							////////////// 6/9 ladies done //////////
							
							else 
							{
								System.out.println("Does she have a white skin color?");
								answer = br.readLine();
								if(answer.equals("yes"))
								{
									System.out.println("Does she have blond hair?");
									answer = br.readLine();
									if(answer.equals("yes"))
									{
										System.out.println("It is Julie!");
									}
									else 
									{
										System.out.println("It is Cindy!");
									}
								}
								else 
								{
									System.out.println("It is Sally!");
								}
							}
						}
					}
				}
			/////////////////// End of the code ////////////////////////
			
		}
		catch(Exception e)		
		{
			System.out.println("AII - Something went wrong: " + e.getMessage());
		}

	}
}