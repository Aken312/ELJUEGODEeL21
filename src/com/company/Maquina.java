package com.company;

import java.util.Random;
import java.util.Scanner;

public class Maquina {
    int decision;
    Scanner sc = new Scanner(System.in);


    void decidir(){
        int rand = new Random().nextInt(3)+1;
        decision= rand;
        System.out.println("decision maquina="+ decision);
    }
}
