
public class Rectangle extends Shape {
	
	private Integer length;
	private Integer width;
	
	public Rectangle() {
		super();
		this.length=0;
	    this.width=0;
	}
	
	//////////////////////////////
	public Rectangle(int x, int y ,int l, int w ) {
		super(x,y);
		this.length=l;
		this.width=w;
		
	}
	
	///////////////////////////////////////
	public void setDimension(int x ,int y, int l, int w) {
		super.setPoint(x, y);
		this.length=l;
		this.width=w;
	}
	
	////////////////////////
	public Integer getLength() {
		return this.length;
	}
	
	///////////////////////////////////
	public Integer getWidth() {
		return this.width;
	}

	/////////////////////////////////////
	public String toString() {
		return "Rectangle :"+super.toString() + "and have length equal="+this.length+"and have width equal="+this.width;
	}
}
