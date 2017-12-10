package listenormale;

import java.util.ArrayList;
import java.util.Arrays;

public class SpecificList <E> {

	// NE PAS UTILISER DE TYPE GENRIQUE : ex ArrayList<E>
	// Utiliser le type Object pour stocker !!
	
	// Attributs 
	private Object arraySpecifiList [];
	private int size = 0;
	
	SpecificList() {
		this.arraySpecifiList = new Object [10];
		for (int i=0; i<10; i++) {
			arraySpecifiList[i] = new Object();
		}
	}
	
	public int getSize() {
		return this.size;
	}
	
	public void addValue(E value) {
		this.arraySpecifiList[this.size] = value;
		size++;
	}

	public <E> E getValue(int index) {
		return (E) this.arraySpecifiList[index];
	}
	
	public ArrayList<E> toArrayList() {
		ArrayList<E> arrayListSpecificList = new ArrayList<E>();
		for(int i = 0; i < this.getSize(); i++){
			{ arrayListSpecificList.add((E) this.arraySpecifiList[i]); }
		}
		return arrayListSpecificList;
	}
	
	
	/*
	 Sigantures attendues :
	 	public SpecificList ()
	 	public void addValue (E value)
	 	public int getSize ()
	 	public E getValue (int index)
	 	public ArrayList<E> toArrayList ()
	 */
		
}

/*
 	Rappels :
 		Cr?ation d'un tableau de 20 ?l?ments : 
 			TypeELTS t [];
 			t = new TypeELTS [20] ; 
			for (i=0; i<20; i++) {
				t[i] = new TypeELTS();
			}
			for (i=0; i<20; i++) {
				t[i].soSomething(); // m?thode de la classe TypeELTS
			}
*/