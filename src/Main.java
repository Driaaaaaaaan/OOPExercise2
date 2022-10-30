public class Main {
	
	public static void main(String args[]) {
		Person p1;
		Student s1 = new Student("Mark", 19, "4th St.", "BSCS");
		Teacher in1 = new Teacher("Jan", 24, "St. Burg", "OOP");
		
		
		p1 = s1;
		System.out.println(p1.getName() + ": " + p1.greetings(in1));
		
		p1 = in1;
		System.out.println(p1.getName() + ": " + p1.greetings());
	}
}