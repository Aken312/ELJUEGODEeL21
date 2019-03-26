package com.company;

import java.util.Scanner;

public class Jugador {
    int decision;
    Scanner sc = new Scanner(System.in);


    void decidir(){
        decision = sc.nextInt();
    }
}
