public class SortingArrays {

	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++)
			System.out.println(array[i] + " ");
	}

	/**
	 * Insertion sort uzima "key" elements u nizu i provjerava ga sa elementima prije njega sve dok 
	 * ne dodje do 0 indexa ili dok je index prije njega manji od njega.
	 * 
	 * @param array
	 */
	public static void insertionSort(int[] array) {

		for (int i = 1; i < array.length; i++) {

			int key = array[i];
			int j = i;

			while (j > 0 && key < array[j-1]) {

				array[j] = array[j-1];
				j--;
			}
			 array[j] = key;
		}

	}

	/**
	 * Selection sort krece od prvog clana i kroz citav niz (i+1) trazi najmanji clan.
	 * @param array
	 */
	public static void selectionSort(int [] array){
		
		for(int i=0; i<array.length-1;i++){
			for(int j=i+1; j<array.length;j++){
				if(array[j]<array[i]){
					
					int temp = array[i];
					array[i]=array[j];
					array[j] = temp;
				}
			}
		}
		
	}
	
	public static void bubbleSort (int [] array){
		
		for(int i=0; i<array.length;i++){
			for(int j=1; j<array.length-1;j++){
				if(array[j]<array[j-1]){
					int temp = array[j-1];
					array[j-1]=array[j];
					array[j] = temp;
				}
			}
		}
		
		
	}
	
	
	public static void main(String[] args) {
		
		int [] ourArray = new int [] {4,3,1,2,5};
		bubbleSort(ourArray);
		printArray(ourArray);
		
	}
}
