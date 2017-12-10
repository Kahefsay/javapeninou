package personne;

public class Personne implements Comparable<Personne>  {
	
	private String nom, prenom;
	
	public Personne (String n, String p) {
		this.nom = n;
		this.prenom = p;
	}

	public void setNomPrenom (String n, String p) {
		this.nom = n;
		this.prenom = p;
	}

	public String getNom() {
		return this.nom;
	}

	public String getPrenom() {
		return this.prenom;
	}

	public int compareTo(Personne personne) {
	    return this.toString().compareTo(personne.toString());
    }
	
	@Override
	public String toString () {
		return "Nom : "+this.nom+", pr?nom : "+this.prenom;
	}

}
