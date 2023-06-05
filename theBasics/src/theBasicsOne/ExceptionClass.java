package theBasicsOne;

import java.util.InputMismatchException;
import java.util.Scanner;

/** @author Table **/

public class ExceptionClass 
	{
		public static void main(String [] args)
			{
				Scanner $Input = new Scanner(System.in);
				try
					{
						System.out.print("\n\tEnter any number you wish to divide: ");
						int $X = $Input.nextInt();
						System.out.print("\n\tEnter any number you wish to divide by: ");
						int $Y = $Input.nextInt();
						int $Z = $X / $Y;
						System.out.println("\n\tThe product of "+$X+" divided by "+$Y+" equals "+$Z);
					} catch(ArithmeticException e)
						{
							System.out.println("\n\tAnything divided by 0 is 0.");
						} catch(InputMismatchException e)
							{
								System.out.println("\n\tAn invalid sysmbol was detected. Please enter numbers only!");
							} catch(Exception e)
								{
									System.out.println("\n\tAn error was detected!");
								} finally
									{
										System.out.println("\n\tClosing scanner.");
										$Input.close();
									}
			}
	}