
class BoundedShape<T extends Shape> {
	
	private T obj;
	
	BoundedShape(T obj) {
		this.obj = obj;
	}
	
	void boundArea() {
		this.obj.area();
	}
}
