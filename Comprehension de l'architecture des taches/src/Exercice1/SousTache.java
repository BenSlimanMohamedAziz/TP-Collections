package Exercice1;

public class SousTache implements Tache {
	public int nbrT,cout;                                                                           
	public String nom;
	
	public int getNbrT() {
		return nbrT;
	}

	public void setNbrT(int nbrT) {
		this.nbrT = nbrT;
	}
	
	@Override
	public int getCout() {
		return cout;
	}

	public void setCout(int cout) {
		this.cout = cout;
	}
	
	@Override
	public String toString() {
		return "SousTache [nbrT=" + nbrT + ", cout=" + cout + ", nom=" + nom + "]";
	}

	@Override
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public SousTache(int nbrT, int cout, String nom) {
		super();
		this.nbrT = nbrT;
		this.cout = cout;
		this.nom = nom;
	}
}
