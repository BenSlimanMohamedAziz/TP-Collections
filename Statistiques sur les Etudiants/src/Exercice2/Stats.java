package Exercice2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Collections;

public class Stats {
private ArrayList<Etudiant> etudiantsList;

public Stats() {
	this.etudiantsList = new ArrayList<Etudiant>();  
}

void trierParMat()
{
	Collections.sort(etudiantsList);
}

void trierParNom()
{
	Collections.sort(etudiantsList,new nomComparator());
}

void trierParMoy()
{
	 Collections.sort(etudiantsList,new MoyComparator());
}

public void ajout(Etudiant e) {
	etudiantsList.add(e);
}

@Override
public String toString() {
	return "Stats : [etudiantsList] \n" + etudiantsList + "]";
}
}
