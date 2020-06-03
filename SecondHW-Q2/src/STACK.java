import java.util.Stack;
public class STACK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<Shape> s1= new Stack<Shape>();
		
		Shape sh1 = new Circle(2,3,3.2);
		
		System.out.println(""+((Circle) sh1).getRaduis());
		
		((Circle)sh1).setDimension(4, 8, 5.3);
		
		s1.push(sh1);
		
		System.out.println(s1.pop());

	}

}
