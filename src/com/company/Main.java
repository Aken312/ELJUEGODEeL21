package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int contando=0;
        int decision;


        System.out.println("Turno del player");
        System.out.println();

        for (int i = 0; contando <=20 ; i++) {
            System.out.println(" 1,2 o 3?");
            decision= sc.nextInt();
            contando=contando+decision;
            if (contando==20){
                System.out.println("gana humano");
                break;
            }else if(contando > 20){
                System.out.println("pierde HUMANO ");
                break;
            }
            System.out.println("TOTAL = " + contando);
            System.out.println();
            System.out.println("turno maquina");
            int rand = new Random().nextInt(3)+1;
            decision= rand;
            System.out.println("decision maquina="+ decision);
            contando=contando+decision;
            System.out.println("TOTAL = " + contando);
            if (contando==20){
                System.out.println("gana maquina");
                break;
            } else if(contando > 20){
                System.out.println("pierde maquina");
                break;
            }
        }
    }
}
