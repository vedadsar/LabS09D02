
public class DynamicArray {
	
	private int [] array;
	private int count;
	private final int INIT_SIZE = 5;
	
	public DynamicArray(int size){
		this.array = new int [size]; 
		this.count = 0;
	}
	
	public DynamicArray(){
		this.array = new int[INIT_SIZE];
		this.count = 0;
	}
	
	public int getSize(){
		return this.count;
	}
	
	/**
	 * Funkcija dodaje novi clan u niz
	 * @param newElement
	 */
	public void add(int newElement){
		if(this.count == this.array.length)
			resize();
		
		array[count] = newElement;
		count++;
		
		
	}
	/**
	 * Funkcija vraca broj iz niza pod indeksom kojeg korisnik proslijedi
	 * @param index
	 * @return
	 */
	public int getAt(int index)	{
	
		if(index > count  || index < 0)
			throw new IndexOutOfBoundsException();
		
		return this.array[index];
	}
	
	/**
	 * Funkciju koristimo da prosirimo niz.
	 */
	private void resize(){
		int [] temp = array;
		array = new int [temp.length*2];
		
		for(int i=0; i<count;i++)
			array[i] = temp[i];
		
	}
	/**
	 * Brisemo jedan clan niza pod indeksom kojeg korisnik proslijedi.
	 * @param index
	 */
	public void removeAt(int index){
		if(index > count  || index < 0)
			throw new IndexOutOfBoundsException();
		
		
		for(int i = index; i<count-1;i++){
			this.array[i] = this.array[i+1];
			
		}
		
		this.count--;
		
	}
	
	public int [] toArray(){
		int [] returnArray = new int[count];
		
		for(int i=0; i < count; i++)
			returnArray[i] = this.array[i];
		
		return returnArray;
	}

}
