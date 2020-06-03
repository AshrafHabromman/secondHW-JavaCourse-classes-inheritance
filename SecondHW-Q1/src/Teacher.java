import java.util.ArrayList;
import java.util.Scanner;

public class Teacher extends Person {

	private Integer maxNumCourses;
	private Integer actualNumCourses;
	private ArrayList<String> courses;

	//////////////////////////////////////////////////////////////

	public Teacher(String name, String address) {
		super(name, address);
		// System.out.println(name +" gg " + address);
		this.courses = new ArrayList<String>();
		this.maxNumCourses = 0;
		this.actualNumCourses = 0;

	}

	/////////////////////////////////////////////////////////////////

	public Teacher() {
		// TODO Auto-generated constructor stub
		super("your name", "your address");
		this.courses = new ArrayList<String>();
		this.maxNumCourses = 0;
		this.actualNumCourses = 0;
	}

	public void setNumOfCourses(Integer num) {
		this.maxNumCourses = num;
		// System.out.println("I am in \"setNumOfCourses\" function ");
	}

	/////////////////////////////////////////////////////////

	public void addCourse() {
		if (this.courses.size() == this.maxNumCourses.intValue()) {
			System.out.println("The time of this teacher is full , I'm sorry :) ");
			// return false ;

		}

		if (this.maxNumCourses.intValue() == 0) {
			System.out.println("Please enter the number of courses :) ");
			// return false ;
		}

		Scanner input = new Scanner(System.in);
		if (this.courses.isEmpty()) {
			for (int i = 0; i < this.maxNumCourses; i++) {
				this.courses.add(input.next());
//				System.out.println("asdfghjkiuytrewqwsdfvbnmngfds");

			}

			actualNumCourses = maxNumCourses;
		} else if (this.courses.size() < this.maxNumCourses) {
			this.courses.add(input.next());
			actualNumCourses++;
		}

		// return true ;

	}

	//////////////////////////////////////////////////////////

	public Integer getMaxNumOfCourses() {
		return this.maxNumCourses;
	}

	public boolean removeCourse() {

		if (this.courses.isEmpty()) {
			System.out.println("There is no any courses that this teacher have .");
			return false;

		}

		Scanner input = new Scanner(System.in);
		this.courses.remove(input.next());
		actualNumCourses--;
		return true;

	}

	//////////////////////////////////////////////////

	@Override
	public String toString() {
		String temp = "";
		for (int i = 0; i < this.courses.size(); i++)
			temp += this.courses.get(i) + " , ";

		return super.toString() + "\nand his courses is :" + temp + ".\n";

	}

	///////////////////////////////////////////////////

	public static void printList() {
		System.out.println("If you want to set the number of courses that the this teacher teach , enter 0");
		System.out.println("If you want to add the courses or one course , enrter 1 ");
		System.out.println("If you want to remove a course , enter 2 ");
		System.out.println("If you want to Know the courses that you have , enter 3 ");
	}

}
