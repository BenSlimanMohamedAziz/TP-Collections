package Ex2Vector;

import java.util.Collections;
import java.util.Vector;

public class Stats {
private Vector<Etudiant> etudiantsVect;

public Stats() {
	this.etudiantsVect = new Vector<Etudiant>();  
}

void trierParMat()
{
	Collections.sort(etudiantsVect);
}

void trierParNom()
{
	Collections.sort(etudiantsVect,new nomComparator());
}

void trierParMoy()
{
	 Collections.sort(etudiantsVect,new MoyComparator());
}

public void ajout(Etudiant e) {
	etudiantsVect.add(e);
}

@Override
public String toString() {
	return "Stats : [etudiantsVector] \n" + etudiantsVect + "]";
}
}
