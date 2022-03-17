import java.util.HashMap;

/**
 * 
 */

/**
 * @author Devendra
 *
 */
class HashExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hm = new HashMap<>();
		hm.put(1, "Book");
		hm.put(2, "Pen");
		hm.put(3, "Eraser");
		hm.put(4, "Ruler");
		
		hm.entrySet().forEach((mapElement) -> {
			String fruits = (String) (mapElement.getValue());
			System.out.println(mapElement.getKey() + " : " + fruits);
		});
	}
}
