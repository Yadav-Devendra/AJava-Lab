/**
 * 
 */

/**
 * @author Devendra
 *
 */
class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BoundedShape<Square> s = new BoundedShape<Square>(new Square(2));
		s.boundArea();
		BoundedShape<Circle> c = new BoundedShape<Circle>(new Circle(4));
		c.boundArea();
	}

}
