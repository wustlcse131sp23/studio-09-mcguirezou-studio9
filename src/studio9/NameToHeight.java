package studio9;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import support.cse131.NotYetImplementedException;

public class NameToHeight {
	/**
	 * Construct and fill a map with your studio group members' names, each
	 * associated with his or her height.
	 * 
	 * Construct an ArgsProcessor and loop asking the args processor for a name to
	 * lookup the height. When the user cancels (that is: when args processor
	 * returns null), break from the loop. Otherwise, loop up the name in the map
	 * and output the results. Be sure to handle the case where the map does not
	 * contain a specified name.
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Map<String, Integer> nth = new HashMap<>();
		nth.put("Yuqiao", 8);
		nth.put("Jack", 1);
		// FIXME
		int i =0;
		while (i==0) {
			System.out.println("Name: ");
			String poopy = in.next();
			if(poopy.equals("quit")) {
				i=4;
				System.out.println("YOU ARE POOPY");
			} else {
				
				if(nth.get(poopy)==null) {
					System.out.println("POOPY");
				}
				else {
					int height = nth.get(poopy);
				System.out.println("Name: " + poopy +" Height: " + height);
				}
			}
		}

	}
}
