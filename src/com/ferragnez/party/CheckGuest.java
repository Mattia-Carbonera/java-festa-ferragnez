package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {

    public static void main(String[] args) {
        String[] guessList = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};
        

        // * ottengo il nome dell'ospite
        Scanner input = new Scanner(System.in);
        System.out.println("Inserisca il suo nome");
        String guestName = input.nextLine();

        guestName = guestName.trim().replaceAll(" " , "");


        // * controllo se l'ospite è nella lista
        int index = 0;
        boolean isGuest = false;

        while (index < guessList.length) {
            guessList[index] = guessList[index].replaceAll(" " , "");
            if (guestName.equalsIgnoreCase(guessList[index])) {
                isGuest = true;
            }
            index++;
        }


         // * rispondo
         if(isGuest) {
            System.out.println("Il nome è nella lista, può entrare!");
         } else {
            System.out.println("Il nome non è nella lista, purtroppo non può entrare...");
         }


        // * chiudo lo scanner
        input.close();
        
    }
}
