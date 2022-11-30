package com.mycompany.controlloeta;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ControlloEta {
    public static void main(String[] args) {
        String tuoNome = " ";
        String testoLetto = " ";
        String etaMaStringa = " ";
        int eta = -1;
        
            BufferedReader tastiera;
            tastiera = new BufferedReader(new InputStreamReader(System.in));
        
        do {
            System.out.println("nome: ");
            try
            {
              tuoNome = tastiera.readLine();
            } catch (IOException ex) {
                System.err.println("Errore di input");
            }
            
        } while (tuoNome.length() < 2);
              
        
        System.out.println("ciao " + tuoNome);
        do {
            System.out.println("Quanti anni hai: ");
            try
            {
                etaMaStringa = tastiera.readLine();
                eta = Integer.parseInt(etaMaStringa);
            } catch (IOException ex) {
                System.err.println("Errore di input");
            } catch (NumberFormatException nfe){
                System.err.println("Numero non valido");
            }
            
        } while (eta <= 2);
        
        System.out.println("Nome: " + tuoNome + "\neta: " + eta + ", ");
        if (eta > 18)
        {
            System.out.print("sei maggiorenne");
        } else {
            System.out.print("non sei maggiorenne");
        }
    }
}
