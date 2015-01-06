
public class TestingDynamicArrays {

	public static void main(String[] args) {

		DynamicArray vedad = new DynamicArray(2);
		
		vedad.add(1);
		vedad.add(5);
		vedad.add(6);
		vedad.add(12);
		vedad.add(55);
		vedad.add(533);
		vedad.add(1222);
		vedad.add(17);
		
		vedad.removeAt(5);
		vedad.removeAt(3);
		vedad.removeAt(1);
		
		int [] array = vedad.toArray();
		
		for(int i=0; i<array.length;i++){
			System.out.print(array[i] +" ");
		}
		
	}

}
