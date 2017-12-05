package map;

import personne.Personne;

public class MappingImplObject <K, V extends Personne> {
	
	private Object key;
	private Object value;
	
	public MappingImplObject(K k, V v) {
		this.key = k;
		this.value = v;
	}
	
	public Object getKey() {
		return this.key;
	}
	
	public Object getValue() {
		return this.value;
	}
	
	public void setKey(K k) {
		this.key = k;		
	}
	
	public  void setValue(V v) {
		this.value = v;
	}

}
