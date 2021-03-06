package Ex2Vector;

import java.util.Iterator;
import java.util.Vector;                                                                                

public class Etudiant implements IStatisticable,Comparable<Etudiant> {                                                                            
	                                                                                               
public double matricule;                                                                           
public String nom;                                                                                 
public Vector <Note> V1;                                                                     
                                                                                                                                                                                                                                                                                                
public Etudiant(double matricule, String nom) {                                                    
	super();                                                                                       
	this.matricule = matricule;                                                                    
	this.nom = nom;                                                                                
	V1 = new Vector<>();                                                                     
}                                                                                                  
                                                                                                   
@Override                                                                                          
public String toString() {                                                                         
	return "Etudiant : [matricule=" + matricule + ", nom=" + nom + ", Notes=" + V1 + "]\n";         
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
	V1.add(n);                                                                                  
}

@Override
public double getAvg() {
	double s=0;
	for (int i=0;i<V1.size();i++) {
		s=s+V1.get(i).getNote();
	}
	return s/V1.size();
}

@Override
public double getMin() {
	double min=V1.get(0).getNote();
	for(Note i:V1) {
		if(i.getNote()<min) {
			min=i.getNote();
		}
	}
	return min;
}

@Override
public double getMax() {
	
   Iterator<Note> Nit = V1.iterator(); 
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
