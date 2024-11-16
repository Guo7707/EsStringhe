/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.esstringhe;

/**
 *
 * @author Lombardo Guido
 */

/*
DESCRIZIONE: Salve a tutti, questo programma ha la funzione di lasciar inserire
ad un utente una stringa e di cercare quante volte appare la lettera "a" in essa. 
Successivamente stampa la lettera "a" in maiuscolo tante volte quanto è stata 
trovata.
*/

/*
INFORMAZIONI DI UTILIZZO: Inserire una stringa a piacere (che può essere di soli
caratteri, parole o una frase). Il programma poi calcolerà e stamperà, sotto 
forma di "A", il numero di lettere "a" presenti all'interno della stringa immessa.
*/
public class Main {
    public static void main(String[] args) { 
    System.out.println("Inserire una stringa a piacere!:");  //stampa la richiesta di input.
    Lombardo_ContaA oggetto = new Lombardo_ContaA(); //crea oggetto di tipo "Lombardo_ContaA".
    System.out.println("La lettera 'a' compare tante volte quante sono le lettere 'a'(in maiuscolo) riportate di seguito:");
    oggetto.conta_a();  //richiama metodo "conta_a".
  }
}
