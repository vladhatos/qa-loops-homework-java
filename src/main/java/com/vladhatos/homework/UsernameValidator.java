package com.vladhatos.homework;
import java.util.Scanner;

public class UsernameValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username;
        boolean esteValid = false;

        do {
            System.out.print("Introdu un username: ");
            username = scanner.nextLine();

            //Verificare spatii
            boolean numeSpatii = false;
            for (int i = 0; i < username.length(); i++) {
                if (username.charAt(i) == ' ') {
                    numeSpatii = true;
                    break;
                }
            }

            if (numeSpatii) {
                System.out.println("Username-ul contine spatii");
                continue;
            }

            //Verificare lungime nume
            boolean lungimeNume = username.length() >= 6 && username.length() <= 12;

            //Verificare cifre in nume
            boolean numeCifra = false;
            for (int i = 0; i < username.length(); i++) {
                if (Character.isDigit(username.charAt(i))) {
                    numeCifra = true;
                    break;
                }
            }

            // Validare regula 1 si 3
            if (!lungimeNume) {
                System.out.println("Eroare: Lungimea trebuie sa fie intre 6 și 12 caractere");
            } else if (!numeCifra) {
                System.out.println("Eroare: Username-ul trebuie sa contina cel putin o cifra");
            } else {
                esteValid = true;
            }

        } while (!esteValid);

        System.out.println("username acceptat: " + username);
        scanner.close();
    }
}