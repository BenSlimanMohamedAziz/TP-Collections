package Ex2Vector;

import java.util.Collections;

public class test {

	public static void main(String[] args) {

		Etudiant e=new Etudiant(10,"aziz");
		Etudiant e2=new Etudiant(15,"ahmed");
		Etudiant e3=new Etudiant(20,"Mounir");
		
		Stats s=new Stats();
		
		Note n =new Note("JAVA",20);
		Note n2 =new Note("PHP",18);
		Note n3 =new Note("JAVA",16);
		Note n4 =new Note("PHP",15);
		Note n5 =new Note("JAVA",10);
		Note n6 =new Note("PHP",17);
		
		e.AjoutNote(n);
		e.AjoutNote(n2);

		e2.AjoutNote(n3);
		e2.AjoutNote(n4);
		
		e3.AjoutNote(n5);
		e3.AjoutNote(n6);
		
		s.ajout(e);	
	    s.ajout(e2);
	    s.ajout(e3);
	    
		s.trierParMat();
		 System.out.println(s);
		 
		s.trierParNom();
		 System.out.println(s);
		 
		s.trierParMoy();
		 System.out.println(s);
			 
	   /* System.out.println(e.toString());
	    System.out.println("AVG : "+e.getAvg());
	    System.out.println("Min : "+e.getMin());
	    System.out.println("Max : "+e.getMax());*/
		 
		 //Vector 
		 
	}
}
