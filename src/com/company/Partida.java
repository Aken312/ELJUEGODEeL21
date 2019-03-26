package com.company;

public class Partida {
    int contador=0;


    void mostrarTurno(){
        System.out.println("Turno del player");
        System.out.println();
    }

    void mostrarTurno2(){
        System.out.println();
        System.out.println("turno maquina");
    }

    void pedirDecision(){
        System.out.println(" 1,2 o 3?");
    }

    void acumular(int decision){
        contador = contador+decision;
    }

    boolean comprobarFin(){

        if (contador==20){
            System.out.println("gana humano");
            return true;
        }else if(contador > 20){
            System.out.println("pierde HUMANO ");
            return true;
        }
        return false;

    }

    boolean comprobarFin2(){
        if (contador==20){
            System.out.println("gana maquina");
            return true;
        } else if(contador > 20){
            System.out.println("pierde maquina");
            return true;
        }
        return false;
    }

    void mostrarContador(){
        System.out.println("-------------------");
        System.out.println("\033[91mSUMA = " + contador + "\033[0m");
        System.out.println("-------------------");
    }
}
