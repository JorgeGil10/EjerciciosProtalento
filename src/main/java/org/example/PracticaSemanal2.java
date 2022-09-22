package org.example;

import java.util.Scanner;

public class PracticaSemanal2 {
    public static void main(String[] args) {

        int dia, mes, year = 0;
        Scanner teclado = new Scanner(System.in);



        System.out.println("Escriba el día de su nacimiento: ");
        dia = teclado.nextInt();

        System.out.println("Escriba el mes de su nacimiento: ");
        mes = teclado.nextInt();

        System.out.println("Escriba en año de su nacimiento: ");
        year = teclado.nextInt();

        if (year<=3000&&(year>=1000)){
            if (mes<=12&&(mes>=1)) {
                if (mes == 2) {
                    if (dia <= 28 && (dia >= 1)) {
                        System.out.println("Su fecha de nacimiento es: " + dia + " / " + mes + " / " + year);
                    } else {
                        System.out.println("Día no válido");
                    }
                } else if (mes == 4) {
                    if (dia <= 30 && (dia >= 1)) {
                        System.out.println("Su fecha de nacimiento es: " + dia + " / " + mes + " / " + year);
                    }   else {
                        System.out.println("Día no válido");
                    }
                } else if (mes == 6) {
                    if (dia <= 30 && (dia >= 1)) {
                        System.out.println("Su fecha de nacimiento es: " + dia + " / " + mes + " / " + year);
                    } else {
                        System.out.println("Día no válido");
                    }
                }else if (mes == 9) {
                    if (dia <= 30 && (dia >= 1)) {
                        System.out.println("Su fecha de nacimiento es: " + dia + " / " + mes + " / " + year);
                    } else {
                        System.out.println("Día no válido");
                    }
                }else if (mes == 11) {
                    if (dia <= 30 && (dia >= 1)) {
                        System.out.println("Su fecha de nacimiento es: " + dia + " / " + mes + " / " + year);
                    } else {
                        System.out.println("Día no válido");
                    }
                }else { if (dia <= 31 && (dia >= 1)) {
                    System.out.println("Su fecha de nacimiento es: " + dia + " / " + mes + " / " + year);
                }else {
                    System.out.println("Día no válido");
                }
                }
            }else {
                System.out.println("mes no válido");
            }
        }else {
            System.out.println("Año no válido");
        }
    }
}
