
class Square implements Shape{

	int side;
	Square(int side){
		this.side = side;
	}
	
	@Override
	public void Area() {
		// TODO Auto-generated method stub
		System.out.println("Aera of Square is: " + side * side);
	}
	
}
