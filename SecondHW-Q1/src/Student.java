import java.util.HashMap;
import java.util.Scanner;

public class Student extends Person {

	private Integer numCourses = 0;
//	private String []courses;
	private Integer[] grades;
	private HashMap<String, Integer> corAndGra = new HashMap<String, Integer>();

	//////////////////////////////////////////////////////

	public Student(String name, String address) {
		super(name, address);
		grades = new Integer[numCourses];
	}

	//////////////////////////////////////////////////////

	public Student() {
		// TODO Auto-generated constructor stub
		super("your name", "your address");
		grades = new Integer[numCourses];
	}

	//////////////////////////////////////////////////////////

	public void setCoursesAndGrades() {
		Scanner input = new Scanner(System.in);

		if (numCourses.intValue() == 0) {
			System.out.println("please enter the number of courses that you want \n");
			this.setNumOfcourses(input.nextInt());
		}

		Integer myGrade;
		String myString;
		for (int i = 0; i < grades.length; i++) {
			myString = input.next();
			myGrade = input.nextInt();
			grades[i] = myGrade;
			corAndGra.put(myString, myGrade);
		}

	}

	//////////////////////////////////////////////////////

	public Double getAverageGrade() {
		Double sum = 0.0;
		if (this.numCourses.intValue() == 0)
			return sum;

		for (Integer element : this.grades)
			sum += element;

		return (sum / grades.length);
	}

	//////////////////////////////////////////////////////

	void setNumOfcourses(Integer num) {
		this.numCourses = num;
		grades = new Integer[numCourses];
	}

	/////////////////////////////////////////////////////

	public Integer getTheGrageOf() {
		if (this.corAndGra.isEmpty()) {
			System.out.println("Please enter te courses and its grades :) ");
			return 0;
		}

		Scanner input2 = new Scanner(System.in);
		String temp = input2.next();
		return this.corAndGra.get(temp);
	}

	////////////////////////////////////////////////////

	@Override
	public String toString() {

		String temp = super.toString() + "\nAnd the courses that " + super.getName() + " is studing now is "
				+ corAndGra.toString();
		return temp;
	}

	///////////////////////////////////////

	public Integer getNumOfCourses() {
		return this.numCourses;
	}

	public static void printList() {
		System.out.println("If you want to set the courses and its grades , enter 0 .");
		System.out.println("If you want to know the averge , enter 1 .");
		System.out.println("If you want to know  the information of your courses , enter 2 ");
		System.out.println("If you want to know  the grade of determined course  , enter 3 ");

	}

	////////////////////////////////////////////////////

}
