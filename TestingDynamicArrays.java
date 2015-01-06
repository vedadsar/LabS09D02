
public class TestingDynamicArrays {

	public static void main(String[] args) {

		StringDynamicArrays vedad = new StringDynamicArrays(2);
		
		vedad.add("1");
		vedad.add("5");
		vedad.add("6");
		vedad.add("12");
		vedad.add("55");
		vedad.add("533");
		vedad.add("12222");
		vedad.add("17");
		
		vedad.remove(5);
		vedad.remove(3);
		vedad.remove(1);
		
		String [] array = vedad.toArray();
		
		for(int i=0; i<array.length;i++){
			System.out.print(array[i] +" ");
		}
		
	}

}
