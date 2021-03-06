package Exercice2;

import java.util.ArrayList;
import java.util.Iterator;                                                                                

public class Etudiant implements IStatisticable,Comparable<Etudiant> {                                                                            
	                                                                                               
public double matricule;                                                                           
public String nom;                                                                                 
public ArrayList <Note> Notes;                                                                     
                                                                                                                                                                                                                                                                                                
public Etudiant(double matricule, String nom) {                                                    
	super();                                                                                       
	this.matricule = matricule;                                                                    
	this.nom = nom;                                                                                
	Notes = new ArrayList<>();                                                                     
}                                                                                                  
                                                                                                   
@Override                                                                                          
public String toString() {                                                                         
	return "Etudiant : [matricule=" + matricule + ", nom=" + nom + ", Notes=" + Notes + "]\n";         
}                                                                                                  
                                                                                                   
public double getMatricule() {                                                                     
	return matricule;                                                                              
}                                                                                                  
                                                                                                   
public void setMatricule(double matricule) {                                                       
	this.matricule = matricule;                                                                    
}                                                                                                  
                                                                                                   
public String getNom() {                                                                           
	return nom;                                                                                    
}                                                                                                  
                                                                                                   
public void setNom(String nom) {                                                                   
	this.nom = nom;                                                                                
}                                                                                                  
                                                                                                   
public void AjoutNote(Note n) {                                                                    
	Notes.add(n);                                                                                  
}

@Override
public double getAvg() {
	double s=0;
	for (int i=0;i<Notes.size();i++) {
		s=s+Notes.get(i).getNote();
	}
	return s/Notes.size();
}

@Override
public double getMin() {
	double min=Notes.get(0).getNote();
	for(Note i:Notes) {
		if(i.getNote()<min) {
			min=i.getNote();
		}
	}
	return min;
}

@Override
public double getMax() {
	
   Iterator<Note> Nit = Notes.iterator(); 
   Note max=Nit.next();
   
   while(Nit.hasNext()) {
	   Note value = (Note)Nit.next();
	  if(max.getNote()<value.getNote()) {
		  max=value;
	  }
}
return max.getNote();
}

@Override
public int compareTo(Etudiant et) {
	if(this.getMatricule()==et.getMatricule()) {
		return 0;
	}
	else if(this.getMatricule()<et.getMatricule()){
		return -1;
	}
	else return 1;
}


}                                                                                                  
