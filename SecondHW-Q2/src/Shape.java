
public class Shape {
	
	private Integer xAxis;
	private Integer yAxis;
	
	//////////////////////////////////
	public Shape() {
		xAxis=0;
		yAxis=0;
		
	}
	
	///////////////////////////////////
	public Shape(int x,int y){
		this.xAxis=x;
		this.yAxis=y;
	}
	
	///////////////////////////////////
	public void setPoint(int x, int y) {
		this.xAxis=x;
		this.yAxis=y;
		
	}
	
	///////////////////////////////
	public Integer getX() {
		return this.xAxis;
	}
	
	///////////////////////////////////////
	public Integer getY() {
		return this.yAxis;
	}
	
	/*//////////////////////////////////////////*/
	
	@Override
	public String toString() {
		return "The position of this shape is (" + this.xAxis + ","+this.yAxis + ")";
	}

}
