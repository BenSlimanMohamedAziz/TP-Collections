package Exercice1;

import java.util.ArrayList;

public class TacheElementaire implements Tache {
private String nom;
private int cout;

 public TacheElementaire(String nom, int cout) {
  this.nom = nom;
  this.cout = cout;
 }

public String getNom() {
  return this.nom;
 }

 public int getCout() {
   return this.cout;
 }

 }
