/**
 * 
 */

/**
 * @author Devendra
 *
 */
class Circle implements Shape{

	double radius;
	public Circle(double radius) {
		// TODO Auto-generated constructor stub
		this.radius = radius;
	}
	
	@Override
	public void Area() {
		// TODO Auto-generated method stub
		System.out.println("Area of Circle is" + " " + 3.14 * (radius * radius));
	}
	
}
