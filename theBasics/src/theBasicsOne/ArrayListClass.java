package theBasicsOne;
import java.util.ArrayList;
import java.util.Hashtable;
public class ArrayListClass {
	
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
				$Fish.add("Blacktip Shark");

			for (int $i=0; $i<$Fish.size(); $i++)
				{
					System.out.println("\tThe fish in the number "+$i+" place is a "+$Fish.get($i)+".\n");
				}			
			ArrayList<String> $Birds = new ArrayList<String>();
				$Birds.add("Green-naped Pheasant Pigeon");
				$Birds.add("Bridled White-eye");
				$Birds.add("White-eared Catbird");				
				$Birds.add("Scissor-tailed Flycatcher");				
				$Birds.add("Red-fronted Macaw");				
				$Birds.add("Blue-grey Tanager");
				$Birds.add("Black-headed Gonolek");
				$Birds.add("Hamerkop");				
				$Birds.add("Scarlet-headed Blackbird");				
				$Birds.add("Sudan Golden Sparrow");
			
			for (int $j=0; $j<$Birds.size(); $j++)
				{
					System.out.println("\tThe bird in the number "+$j+" place is a "+$Birds.get($j)+".\n");
				}		
			
			
			Hashtable<Integer,ArrayList<String>> $Animals = new Hashtable<Integer, ArrayList<String>>();
				$Animals.put(0, $Fish);
				$Animals.put(1, $Birds);

			for (int $K=0; $K<$Animals.size(); $K++)
				{
					for (int $L=0; $L<$Animals.get($K).size();$L++)
					System.out.println("\tThe animal in the array number "+$K+" is the "+$Animals.get($K).get($L)+".\n");
				}				
		}
}