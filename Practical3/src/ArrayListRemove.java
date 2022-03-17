import java.util.ArrayList;

class ArrayListRemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> colours = new ArrayList<String>();
		String[] arr = new String[] {"Red","Blue", "Green", "Yellow"};
		for(int i = 0; i < arr.length; i++) {
			colours.add(arr[i]);
		}
		System.out.println(colours);
		System.out.println("Before removing the third element: "+ colours);
		colours.remove(2); //Removing third element
		System.out.println("After removing the third element: "+ colours);
	}

}
