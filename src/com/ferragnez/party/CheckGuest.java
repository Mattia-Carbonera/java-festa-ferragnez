package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {

    public static void main(String[] args) {
        String[] guestsList = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};


        // * ottengo il nome dell'ospite
        Scanner input = new Scanner(System.in);
        System.out.println("Inserisca il suo nome");
        String guestName = input.nextLine();

        guestName = guestName.trim().replaceAll(" " , "");


        // * controllo se l'ospite è nella lista
        boolean isGuest = false;
        
        // ! con "while"
        // int index = 0;
        // while (index < guestsList.length) {
        //     guestsList[index] = guestsList[index].replaceAll(" " , "");
        //     if (guestName.equalsIgnoreCase(guestsList[index])) {
        //         isGuest = true;
        //     }
        //     index++;
        // }


        // ! con "for"
        for(int i = 0; i < guestsList.length; i++) {
            guestsList[i] = guestsList[i].replaceAll(" " , "");
  
            if (guestName.equalsIgnoreCase(guestsList[i])) {
                isGuest = true;
                break;
            }
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
