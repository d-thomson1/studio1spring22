package studio1;

import support.cse131.ArgsProcessor;

public class Ordered {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		int x = ap.nextInt("Value for x?");
		int y = ap.nextInt("Value for y?");
		int z = ap.nextInt("Value for z?");
		
<<<<<<< HEAD
		System .out .println(x<y && x<z && y<z || x>y && x>z && y>z);

=======
		boolean isOrdered = x>y && y>z;
		boolean isOrdered1 = x<y && y<z;
		boolean answer = isOrdered || isOrdered1;
		System.out.println(answer);
		
>>>>>>> branch 'main' of https://github.com/d-thomson1/studio1spring22.git
	}

}
