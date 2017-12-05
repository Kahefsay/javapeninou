package map;

import personne.Personne;

public class Mapping <K, V extends Personne> {
	
	private K key;
	private V value;
	
	public Mapping(K k, V v) {
		this.key = k;
		this.value = v;
	}
	
	public K getKey() {
		return this.key;
	}
	
	public V getValue() {
		return this.value;
	}
	
	public void setKey(K k) {
		this.key = k;		
	}
	
	public  void setValue(V v) {
		this.value = v;
	}

}
