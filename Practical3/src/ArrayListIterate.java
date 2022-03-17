import java.util.ArrayList;
import java.util.Iterator;

/**
 * 
 */

/**
 * @author Devendra
 *
 */
class ArrayListIterate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> colours = new ArrayList<String>();
		String[] arr = new String[] {"Red","Blue", "Green", "Yellow"};
		for(int i = 0; i < arr.length; i++) {
			colours.add(arr[i]);
		}
		Iterator itr = colours.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
