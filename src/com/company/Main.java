package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner invoer = new Scanner(System.in);
        HogerLager spel = new HogerLager();
        int getal;
        spel.init();

        do {
            System.out.println("Geef een getal in");
            getal = Integer.parseInt(invoer.nextLine());
            int resultaat = spel.raad(getal);
            if (resultaat > 0){
                System.out.println("Hoger");
            } else if (resultaat < 0){
                System.out.println("Lager");
            } else {
                System.out.println("Gevonden");
            }

        }while( !spel.isEindeSpel());
        System.out.printf("Je hebt het getal gevonden in %d beurten", spel.getAantalBeurten());

        }



	// write your code here
    }

