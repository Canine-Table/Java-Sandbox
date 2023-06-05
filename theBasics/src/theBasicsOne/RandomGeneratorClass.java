package theBasicsOne;
	import java.util.Random;
public class RandomGeneratorClass {

	public static void main(String [] args)
	{ // Pseudorandom number generator
		
		Random $Randomize = new Random();
		int $X = 332;
		int $Y = 3009;
		// $Randomize.nextInt(/*Min and Max are the min and max of the int primitave value*/);
		int $Integer = $Randomize.nextInt( $X/*Min*/);
		long $Long = $Randomize.nextLong();
		double $Double = $Randomize.nextDouble();
		float $Float = $Randomize.nextFloat();		
		boolean $Boolean = $Randomize.nextBoolean();
		System.out.println("The random int value generatated with a minimum value of "+$X+" and a maximum value of "+$Y+" Produced: "+$Integer);
		System.out.println("The random long value generatated with a minimum value of "+$X+" and a maximum value of "+$Y+" Produced: "+$Long);
		System.out.println("The random double value generatated with a minimum value of "+$X+" and a maximum value of "+$Y+" Produced: "+$Double);
		System.out.println("The random float value generatated with a minimum value of "+$X+" and a maximum value of "+$Y+" Produced: "+$Float);
		System.out.println("The random boolean value generatated is: "+$Boolean);		
	}
}
