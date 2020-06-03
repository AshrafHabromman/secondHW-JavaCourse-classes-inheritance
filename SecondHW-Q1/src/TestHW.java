import java.util.Scanner;

public class TestHW {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Teacher t1 = new Teacher();
		System.out.println("please, Enter your NAME and your ADDRESS");
		t1.setNameAndAddress(input.next(), input.next());
		System.out.println("Enter the number of courses");
		t1.setNumOfCourses(input.nextInt());
		System.out.println("plaese enter the " + t1.getMaxNumOfCourses() + " courses you want to teach");
		t1.addCourse();
		System.out.println("Enter the name the course thst you want to delete");
		t1.removeCourse();
		System.out.println("The information of this this teacher is :" + t1);
		System.out.println("");

		///////////////////////////////////////////////////////////////////

//		Scanner input = new Scanner(System.in);
//		Student mostafa = new Student();
//		System.out.println("please, Enter your NAME and your ADDRESS");
//		mostafa.setNameAndAddress(input.next(), input.next());
//		System.out.println("Enter the number of the courses that you want");
//		mostafa.setNumOfcourses(input.nextInt());
//		System.out.println("Enter "+mostafa.getNumOfCourses()+"courses and its grades ");
//		mostafa.setCoursesAndGrades();
//		System.out.println("Enter the name of course to get its grade");
//		System.out.println(""+mostafa.getTheGrageOf());
//		System.out.println("the average is :"+mostafa.getAverageGrade());
//		System.out.println("the information of this student is :"+mostafa.toString());
//		
//		
//		
//		

		/////////////////////////////////////////////////////////////////

		// TODO Auto-generated method stub
//		Scanner input = new Scanner (System.in);
//		Person p1=  new Person ();
//		Student s1=new Student();
//		Teacher t1=new Teacher();
//		Person.printList();
//		String test1=input.next();
//		System.out.println("please enter your name and your address ");
//		if (test1.equals("0"))
//			     p1.setNameAndAddress(input.next(),input.next());
//		
//		else if(test1.equals("1"))
//			t1.setNameAndAddress(input.next(),input.next());
//		
//		else if(test1.equals("2"))
//			s1.setNameAndAddress(input.next(),input.next());
//
//		
//		while (true) {
//			
//			System.out.println("if you are a teacher ,enter 1 . else if you are a student , enter 2");
//		
//				
//		    if (input.hasNext("1")) {
//				input.next();
//
//		
//				Teacher.printList();
//				String test = input.next();
//				
//				if (test.equals("0"))
//					t1.setNumOfCourses(input.nextInt());
//				
//				else if (test.equals("1"))
//				    t1.addCourse();
//				
//				else if (test.equals("2"))
//					t1.removeCourse();
//				
//				else if (test.equals("3"))
//					System.out.println(t1.toString());
//				
//				
//				System.out.println("asdfdgfhgfds11111111111111");
//			}
//			
//			else if (input.hasNext("2")) {
//				input.next();
//
//				Student.printList();
//				
//				String test = input.next();
//				
//				if (test.equals("0"))
//					s1.setCoursesAndGrades();
//				
//				else if(test.equals("1"))
//					s1.getAverageGrade();
//				
//				else if (test.equals("2"))
//					System.out.println(s1.toString());
//				
//				else if (test.equals("3"))
//					s1.getTheGrageOf();
//				
//
//			}
//			System.out.println("asdfdgfhgfds22222222222");
//		}
//			

	}

}
