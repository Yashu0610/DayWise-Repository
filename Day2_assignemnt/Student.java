package Class_objects;

	public class Student {
	    String name;
	    int age;

	    // Constructor
	    public Student(String studentName, int studentAge) {
	        name = studentName;
	        age = studentAge;
	    }
	    public void displayInfo() {
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	    }
	    public static void main(String[] args) {
	        Student s1 = new Student("Yaswanth", 20);
	        s1.displayInfo();
	    }
	}
