package Exercice1;

public class Test {
	public static void main(String[] args) {
		
	TacheComplexe ta = new TacheComplexe("A");
	ta.ajouter(new TacheElementaire("A1", 10));
	ta.ajouter(new TacheElementaire("A2", 20));
	System.out.println("Cout = " + ta.getCout());
	
  }
}

