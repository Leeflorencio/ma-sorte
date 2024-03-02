package com.br.beecrowd;

import java.util.Scanner;

public class MaSorte {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long numero = sc.nextLong();
        String numeroString = Long.toString(numero);
        String numeroDeAzar = "13";

        if (numero >= 0 && numero <= 100000000000000000L){
            if (numeroString.contains(numeroDeAzar)){
                System.out.println("13 es de Mala Suerte");
            } else {
                System.out.println(numero + " NO es de Mala Suerte");
            }
        }
    }
}
