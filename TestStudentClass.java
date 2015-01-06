
public class TestStudentClass {

	public static void sortStudents(Student [] arrayOfStudents) {

		for (int i = 1; i < arrayOfStudents.length; i++) {

			Student key = arrayOfStudents[i];
			int j = i;

			while (j > 0 && key.compareTo(arrayOfStudents[j-1]) == -1) {

				arrayOfStudents[j] = arrayOfStudents[j-1];
				j--;
			}
			 arrayOfStudents[j] = key;
		}

	}
	
	
	public static void main(String[] args) {
	
	Student vedad = new Student("Vedad Zornic", 35189, 6.57);
	Student mustafa = new Student("Mustafa Ademovic", 42598, 5.14);
	Student haris = new Student("Haris Krkalic", 13874, 7.88);
	Student emir = new Student("Emir Imamovic", 38975, 8.8);
	Student mirza = new Student("Mirza Becic", 42598, 5.14);
	Student gorjan = new Student("Gorjan Kalauzovic", 33654, 6.57);
	
	Student [] bitCamp = new Student [] { vedad, mustafa, haris, emir, mirza, gorjan};
	
	sortStudents(bitCamp);
	
	for(int i=0; i<bitCamp.length;i++){
		System.out.println(bitCamp[i].toString() +" ");
	}
	
	
}
}
