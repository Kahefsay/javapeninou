package personne;

public class Etudiant extends Personne {

	private String numEtu ;
	
	public Etudiant (String n, String p, String num) {
		super(n, p);
		this.numEtu= num;
	}

	public String getNumEtu() {
		return numEtu;
	}

	public void setNumEtu(String numEtu) {
		this.numEtu = numEtu;
	}
}
