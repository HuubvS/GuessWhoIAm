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
				
				if(answer.equals("yes")) 
				{
					System.out.println("Does he wear a hat?");
					answer = br.readLine();
					if(answer.equals("yes")) 
					{
						System.out.println("Does he have blue eyes?");
						answer = br.readLine();
						if(answer.equals("yes")) 
						{
							System.out.println("Does he have orange hair?");
							answer = br.readLine();
							if(answer.equals("yes")) 
							{
								System.out.println("It is Chriss!");
							}
							else 
							{
								System.out.println("It is Jake!");
							}
						}
						else
						{
							System.out.println("It is Jac!");
						}
							////////////// 3/15 men done //////////
					}
					else 
					{
						System.out.println("Does he have a brown skin color?");
						answer = br.readLine();
						if(answer.equals("yes")) 
						{
							System.out.println("Is he bald?");
							answer = br.readLine();
							if(answer.equals("yes")) 
							{
								System.out.println("It is Sam!");
							}
							else 
							{
								System.out.println("Does he wear glasses?");
								answer = br.readLine();
								if(answer.equals("yes")) 
								{
									System.out.println("It is Mark!");
								}
								else 
								{
									System.out.println("does he have a facial beard?");
									answer = br.readLine();
									if(answer.equals("yes")) 
									{
										System.out.println("It is Bob!");
									}
									else
									{
										System.out.println("It is Tupp!");
									}
								}
							}
						}
								////////////// 8/15 men done //////////
						
						else
						{
							System.out.println("Does he have blue eyes?");
							answer = br.readLine();
							if(answer.equals("yes")) 
							{
								System.out.println("Does he have a facial beard?");
								answer = br.readLine();
								if(answer.equals("yes"))
								{
									System.out.println("Does he wear glasses?");
									answer = br.readLine();
									if(answer.equals("yes"))
									{
										System.out.println("It is Nick!");
									}
									else
									{
										System.out.println("It is Harry!");
									}
								}
								else 
								{
									System.out.println("It is Larry!");
								}
							}
								////////////// 11/15 men done //////////
							
							else 
							{
								System.out.println("Does he have blond hair?");
								answer = br.readLine();
								if(answer.equals("yes")) 
								{
									System.out.println("It is Will!");
								}
								else 
								{
									System.out.println("Is he bald?");
									answer = br.readLine();
									if(answer.equals("yes")) 
									{
										System.out.println("Does he have facial hair?");
										answer = br.readLine();
										if(answer.equals("yes")) 
										{
											System.out.println("It is Josh!");
										}
										else 
										{
											System.out.println("It is Art!");
										}
									}
									else 
									{
										System.out.println("It is Kevin!");
									}
								}
								
								///// ART , JOSH, WILL & KEVIN NEEDS TO BE CHECK!
							}
						}
					}
					
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