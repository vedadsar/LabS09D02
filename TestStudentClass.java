
public class TestStudentClass {
public static void main(String[] args) {
	
	Student vedad = new Student("Vedad", 12345, 10);
	Student vedad1 = new Student("Vedad", 12345, 10);
	
	System.out.println(vedad1.compareTo(vedad));
}
}
