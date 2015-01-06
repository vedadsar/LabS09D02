
public class DynamicArray {
	
	private int [] array;
	private int count;
	private final int INIT_SIZE = 5;
	
	/**
	 * Konstruktor kojem proslijedjujemo parametar size, koji korisitimo kao velicinu niza.
	 * @param size
	 */
	public DynamicArray(int size){
		this.array = new int [size]; 
		this.count = 0;
	}

	/**
	 * Prazan konstruktor. Postavljamo default velicinu niza
	 */
	public DynamicArray(){
		this.array = new int[INIT_SIZE];
		this.count = 0;
	}
	
	/**
	 * Funkcija vraca velicinu naseg niza. Velicina niza je count ;
	 * @return
	 */
	public int getSize(){
		return this.count;
	}
	
	
	/**
	 * Funkcija dodaje novi clan u niz. Prvo provjerimo da li je niz pun, ukoliko jeste prosirujemo niz metodom resize() ako nije samo dodamo.
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
	
		if(index > count  || index < 0)										// Ukoliko indeks nije validan bacamo exeption
			throw new IndexOutOfBoundsException();
		
		return this.array[index];
	}
	
	
	/**
	 * Funkciju koristimo da prosirimo niz. Svaki put cemo uduplati velicinu niza.
	 */
	private void resize(){
		int [] temp = array;							// Privremeno spasavamo nas niz
		array = new int [temp.length*2];				// Zatim preko naseg niza prepisujemo novi sa 2*lenght starog niza
		
		for(int i=0; i<count;i++)						// prepisujemo clanove iz tempa u novi niz
			array[i] = temp[i];
		
	}
	
	
	/**
	 * Brisemo jedan clan niza pod indeksom kojeg korisnik proslijedi.
	 * @param index
	 */
	public void removeAt(int index){
		if(index > count  || index < 0)						//Ukoliko je index manji od 0 ili idnex veci od counta bacamo exeption
			throw new IndexOutOfBoundsException();
		
		
		for(int i = index; i<count-1;i++){					// Pomjeramo elemente niza za jedno mjesto u lijevo, tako cemo izbrisati element niza.
			this.array[i] = this.array[i+1];
			
		}
		
		this.count--;										// Smanjujemo count jer smo brisali clan niza
		
	}
	
	
	/**
	 * Pravimo novi niz od "count" elemenata i prebacujemo elemente iz arraya u novi niz.
	 * Ovako cemo izbjeci da posaljemo niz sa praznim mjestima.
	 * @return
	 */
	public int [] toArray(){
		int [] returnArray = new int[count];			//Nas novi niz
		
		for(int i=0; i < count; i++)					//For petljom prepisiujemo elemente u novi niz
			returnArray[i] = this.array[i];
		
		return returnArray;
	}

}
