package theBasicsOne;

import java.util.ArrayList;

/** @author Table **/

public class ForeachLoopClass 
	{
		public static void main(String [] args)
		{
			ArrayList<String> $Fish = new ArrayList<String>();
				$Fish.add("Starfish");
				$Fish.add("Oyster Toadfish");
				$Fish.add("Black Drum");
				$Fish.add("Lizardfish");
				$Fish.add("Jumping Mullet");
				$Fish.add("Silver Perch");
				$Fish.add("Haddock");
				$Fish.add("Knobbed Porgy");
				$Fish.add("Sea Mullet");
			for(String $i : $Fish)
				{
					System.out.println("This fish is a "+$i);
				}
			}	
	}