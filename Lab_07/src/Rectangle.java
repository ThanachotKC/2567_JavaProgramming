
public class Rectangle {
	//private
	private float length = 1.0f;;
	private float width = 1.0f;
	//Default Constructor
	Rectangle(){}
		
		
	//Paramiterize Constructor
	Rectangle(float length,float width){
		this.length = length;
	}
	//Getter and Setter method
	public float getLength() {
		return this.length;
	}
	public void setLength(float Length) {
		this.length = Length;
	}
	public float getWidth() {
		return this.width;
	}
	public void setWidth(float width) {
		this.width = width;
	}
	// Method to Calculate area
	public double getArea () {
		return this.length * this.width;
	}	
		
	// Method to Calculate area perimiter
		
	public double getPerimeter() {
		return 2 * (this.length + this.width);
	}
	public String showData() {
		return "Rectangle[length= " + this.length + ",width ="+
	this.width+"]";
	}
	//Method to display using toString
	public String toString() {
		return "Rectangle[length= " + this.length + ",width ="+
	this.width+"]";
		
}
}
