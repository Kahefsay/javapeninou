package listenormale;

import java.util.ArrayList;
import java.util.Arrays;

public class SpecificList <E> {

	// NE PAS UTILISER DE TYPE GENRIQUE : ex ArrayList<E>
	// Utiliser le type Object pour stocker !!
	
	// Attributs 
	private  Object  arraySpecifiList[] = new Object[10];
	private int size = 0;
	
	public SpecificList() {
		for (int i=0; i<10; i++) {
			arraySpecifiList[i] = new Object();
		}
	}
	
	public int getSize() {
		return this.arraySpecifiList.length;
	}
	
	public void addValue(E value) {
		this.arraySpecifiList[this.size] = value;
		size++;
	}
	
	@SuppressWarnings("unchecked")
	public E getValue(int index) {
		return (E) this.arraySpecifiList[index];
	}
	
	public ArrayList<E> toArrayList() {
		return new ArrayList<E>(Arrays.asList((E[])this.arraySpecifiList));		
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
 		Création d'un tableau de 20 éléments : 
 			TypeELTS t [];
 			t = new TypeELTS [20] ; 
			for (i=0; i<20; i++) {
				t[i] = new TypeELTS();
			}
			for (i=0; i<20; i++) {
				t[i].soSomething(); // méthode de la classe TypeELTS
			}
*/