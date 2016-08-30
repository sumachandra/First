import java.util.Scanner;

public class TestClass {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		String firstName = sc.nextLine();
		
		HelloWorld h_c=new HelloWorld();
		
		
		
		
		h_c.getSalary();
		h_c.getFirstName();
		h_c.getAge();
		System.out.println("Enter Name :"+firstName);
		System.out.println("Print Age :"+HelloWorld.age);
		System.out.println("Print Salary :" + h_c.getSalary());
		
	}
}