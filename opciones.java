package com.company;
import java.util.Scanner;

public class opciones {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        char vocal;
        System.out.println("Ingrese un caracter: ");
        vocal=entrada.next().charAt(0);
        switch (vocal){
            case 'a':
            case 'A':
                System.out.println("Anillo");
                System.out.println("Aro");
                System.out.println("Avion");
                break;
            case 'e':
            case 'E':
                System.out.println("Enano");
                System.out.println("Elefante");
                System.out.println("Escoba");
                break;
            case 'i':
            case 'I':
                System.out.println("Iglesia");
                System.out.println("Isla");
                System.out.println("Iman");
                break;
            case 'o':
            case 'O':
                System.out.println("Oso");
                System.out.println("Olla");
                System.out.println("Ojo");
                break;
            case 'u':
            case 'U':
                System.out.println("Uva");
                System.out.println("Uña");
                System.out.println("Uno");
                break;

            default:
                System.out.println("No es vocal");
        }
    }
}
