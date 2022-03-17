/**
 * 
 */

/**
 * @author Devendra
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BoundedShape<Square> s = new BoundedShape<>(new Square(6));
		s.boundArea();
		BoundedShape<Circle> c = new BoundedShape<>(new Circle(8.2));
		c.boundArea();
	}
}
