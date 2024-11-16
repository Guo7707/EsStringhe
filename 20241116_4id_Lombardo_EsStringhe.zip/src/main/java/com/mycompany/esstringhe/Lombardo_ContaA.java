package com.mycompany.esstringhe;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lombardo Guido
 */

public class Lombardo_ContaA {
    Scanner scanner = new Scanner(System.in);//crea un nuovo oggetto di tipo "Scanner". 
    public String stringa=scanner.nextLine();//legge l'input inserito dall'utente.
    public void conta_a(){     //crea il metodo "conta_a".
        for(int i=0; i<stringa.length(); i++){  //questo ciclo for ha la funzione di contare quante volte appare la lettera "a" o "A"(in maiuscolo). Per ogni avvenimento della condizione stampa la lettera "a" in maiuscolo.
          if(stringa.charAt(i) == 'a' || stringa.charAt(i) == 'A'){  //verifica la condizione (se appare la lettera "a"(in minuscolo) o "A"(in maiuscolo).
              System.out.print("A");    //stampa lettera "a" in maiuscolo.
          }
        }
    }
    
}
