
class SimpleInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SI obj = (p,r,t) -> {
			float i = (p*r*t)/100;
			System.out.println("Simple interest is "+i);
		};
		obj.interest(1000, 6, 6);
	}
}
