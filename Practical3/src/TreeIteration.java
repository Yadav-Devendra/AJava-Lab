import java.util.TreeSet;
import java.util.Iterator;


/**
 * 
 */

/**
 * @author Devendra
 *
 */
class TreeIteration {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> ts = new TreeSet<>();
		ts.add("Devendra");
		ts.add("Yash");
		ts.add("Rahul");
		
		System.out.println("Traversing element through Iterator in ascending order");
		Iterator<String> itr = ts.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println();
		
		System.out.println("Traversing element through Iterator in descending order");
		Iterator i = ts.descendingIterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}

	}

}
