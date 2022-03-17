/**
 * 
 */

/**
 * @author Devendra
 *
 */
class AreaLambda {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape obj = (shape, s) -> {
			if (shape.toLowerCase().equals("square")) {
				System.out.println("Area of Square is " + s * s);
			} else if (shape.toLowerCase().equals("circle")) {
				System.out.println("Area of Circle is " + 3.14 * s * s);
			}
				else{
				System.out.println("Not valid input");
			}
		};
		obj.area("square", 4);
		obj.area("circle", 6);
	}
}
