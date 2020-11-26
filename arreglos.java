package com.company;
import java.util.Scanner;

public class arreglos {
        public static void main(String args[]) {
            int s=1;
            while(s!=2) {
                Scanner entrada = new Scanner(System.in);
                int edad[] = new int[6];
                String nombres[] = new String[6];
                String falla[] = new String[6];

                for (int x = 0; x < 6; x++) {
                    System.out.println("Ingrese nombre: ");
                    nombres[x] = entrada.nextLine();
                    System.out.println("Ingrese edad: ");
                    edad[x] = entrada.nextInt();
                    falla[x] = entrada.nextLine();
                }
                for (int y = 0; y < 6; y++) {
                    System.out.println(nombres[y] + " Cuya edad es: " + edad[y] + " annios");
                }
                System.out.println("Desea repetir?");
                System.out.println("1. Si");
                System.out.println("2. No");
                s = entrada.nextInt();
            }
        }
    }

