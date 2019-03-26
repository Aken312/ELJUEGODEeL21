package com.company;

import java.util.Random;
import java.util.Scanner;

public class MainOK {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int contando=0;
        int decision;



        for (int i = 0; contando <=20 ; i++) {
            System.out.println("Turno del player");
            System.out.println();

            System.out.println(" 1,2 o 3?");
            decision= sc.nextInt();
            contando=contando+decision;
            if (contando==20){
                System.out.println("gana humano");
                break;
            }
            System.out.println("SUMA="+contando);
            System.out.println();

            System.out.println("turno maquina");
            int rand = new Random().nextInt(3)+1;
            decision= rand;
            System.out.println("decision maquina="+ decision);
            contando=contando+decision;
            System.out.println("SUMA="+contando);
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
