
public class Person {
	private String name;
	private String address;

	///////////////////////////////////////////////////////
	public Person(String name, String address) {
		this.name = name;
		this.address = address;

	}

	///////////////////////////////////////////////////////

	public Person() {
		// TODO Auto-generated constructor stub
		this.name = "your name";
		this.address = "your address";
	}

	///////////////////////////////////////////////////////

	public String getName() {
		return this.name;
	}

	///////////////////////////////////////////////////////

	public String getAddress() {
		return this.address;
	}

	///////////////////////////////////////////////////////

	public void setAddress(String address) {
		this.address = address;
	}

	///////////////////////////////////////////////////////

	@Override
	public String toString() {
		return "His name is " + this.name + ", and his address is " + this.address;

	}

	/////////////////////////////////////

	public void setNameAndAddress(String name, String address) {
		this.name = name;
		this.address = address;
	}

	public static void printList() {
		System.out.println(" If you want to create an account as a normal person , enter 0 .");
		System.out.println("else if you want to create an account as a Teacher , enter 1 .");
		System.out.println("else if you want to create an account as a Student , enter 2 .");
	}

}
