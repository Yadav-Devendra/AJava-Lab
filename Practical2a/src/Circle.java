/**
 * 
 */

/**
 * @author Devendra
 *
 */
class Circle implements Shape{
	
	int radius;
	Circle(int radius){
		this.radius = radius;
	}

	@Override
	public void Area() {
		// TODO Auto-generated method stub
		Double area = Math.PI * Math.pow(radius, 2);
		System.out.println("Area of Circle is: " + area);
	}
	
}
