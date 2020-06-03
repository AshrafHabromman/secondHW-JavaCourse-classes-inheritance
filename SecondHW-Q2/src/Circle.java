
public class Circle extends Shape{
	
	private Double raduis;
	
	public Circle() {
		super();
		raduis = 0.0;
	}
	
	////////////////////////////////
	public Circle(int x, int y, Double r) {
		super(x,y);
		this.raduis=r;
	}
	
	/////////////////////////////////
	public void setDimension(int x,int y, Double r) {
		super.setPoint(x, y);
		this.raduis=r;
	}
	
	///////////////////////////////////
	public Double getRaduis() {
		return this.raduis;
	}
	public String toString() {
		return "Circle :" + super.toString()+", and its raduis is :"+this.raduis;
	}

}
