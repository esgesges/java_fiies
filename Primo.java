/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.p_ferrian_primo;


public class Primo 
{
    public static void main(String[] args) 
    {
        
      int a = 5;
      int b = 10;
      int somma = a + b;
      int sottrazione = a - b;
      int moltiplicazione = a * b;
      int divisione = a / b;
       
      if ( somma <= 100)
      {
          System.out.println(" la somma di a e b è:" + somma + " ed è <= di 100");
      }
      else
      {
            System.out.println(" la somma di a e b è:" + somma + " e non è <= di 100");
      }
      if ( sottrazione <= 100)
      {
          System.out.println(" la sottrazione di a e b è:" + sottrazione + " ed è <= di 100");
      }
      else 
      {
            System.out.println(" la sottrazione di a e b è:" + sottrazione + " e non è <= di 100");
      }
      if ( sottrazione <= 100)
      {
          System.out.println(" la molitplicazione di a e b è:" + moltiplicazione + " ed è <= di 100");
      }
      else 
      {
            System.out.println(" la molitplicazione di a e b è:" + moltiplicazione + " e non è <= di 100");
      }
      if ( divisione <= 100)
      {
          System.out.println(" la divisione di a e b è:" + divisione + " ed è <= di 100");
      }
      else 
      {
            System.out.println(" la divisione di a e b è:" + divisione + " e non è <= di 100");
      }
    }
}
