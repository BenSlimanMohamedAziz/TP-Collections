package Exercice1;

import java.util.Collection;
 import java.util.ArrayList;
 import java.util.Iterator;

 public class TacheComplexe implements Tache, Iterable<Tache> {
 private Collection<Tache> sousTaches;
 private String nom;

 public TacheComplexe(String nom) {
   this.nom = nom;
   this.sousTaches = new ArrayList<Tache>();
 }

 public void ajouter(Tache tache) {
   this.sousTaches.add(tache);
 }

 public void supprimer(Tache tache) {
   this.sousTaches.remove(tache);
 }

 public String getNom() {
    return this.nom;
 }

 public int getCout() {
   int result = 0;
   for (Tache t : sousTaches) {
   result += t.getCout();
 }
   return result;
 }

 public Iterator<Tache> iterator() {
    return this.sousTaches.iterator();
}

 }

