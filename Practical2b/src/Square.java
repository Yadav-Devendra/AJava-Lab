
class Square implements Shape{

	double side;
	public Square(double side) {
		// TODO Auto-generated constructor stub
		this.side = side;
	}
	@Override
	public void Area() {
		// TODO Auto-generated method stub
		System.out.println("Area of square is" + " " + side * side);
	}
	
}
