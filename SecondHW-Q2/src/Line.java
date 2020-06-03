
public class Line extends Shape{
	private Integer length;
	
	Line(){
		super();
		length=0;
	}
	
	/////////////////////////////
	Line(int x, int y, int l){
		super(x,y);
		length=l;
	}
	
	//////////////////////////////
	public void setDimension(int x,int y,int l) {
		super.setPoint(x, y);
		this.length=l;
	}
	
	//////////////////////////////////
	public Integer getLength() {
		return this.length;
	}
	
	/*//////////////////////////////*/
	public String toString() {
		return "Line :"+super.toString()+" ,and have length equal to : "+this.length;
	}

}
