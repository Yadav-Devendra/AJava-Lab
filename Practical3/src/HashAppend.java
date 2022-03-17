import java.util.ArrayList;
import java.util.HashSet;

/**
 * 
 */

/**
 * @author Devendra
 *
 */
class HashAppend {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> colours = new HashSet<String>();
		String[] arr = new String[] {"Red","Blue", "Green", "Yellow"};
		for(int i = 0; i < arr.length; i++) {
			colours.add(arr[i]);
		}
		System.out.println(colours);
	}

}
