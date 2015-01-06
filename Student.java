public class Student {

	private String name;
	private int indexNumber;
	private double gpa;

	public Student(String name, int indexNumber, double gpa) {

		this.name = name;
		this.indexNumber = indexNumber;
		this.gpa = gpa;

	}

	
	
	public int compareTo(Student other) {

		if (this.gpa > other.gpa)
			return 1;
		else if (this.gpa < other.gpa)
			return -1;

		else {

			if (this.indexNumber > other.indexNumber)
				return 1;
			else if (this.indexNumber < other.indexNumber)
				return -1;
			else {

				if (this.name.compareTo(other.name) > 0)
					return 1;
				else if (this.name.compareTo(other.name) < 0)
					return -1;
				else
					return 0;

			}

		}

	}

	@Override
	public String toString() {
		return "Student [name=" + name + "]";
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getIndexNumber() {
		return indexNumber;
	}

	public void setIndexNumber(int indexNumber) {
		this.indexNumber = indexNumber;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(int gpa) {
		this.gpa = gpa;
	}

}
