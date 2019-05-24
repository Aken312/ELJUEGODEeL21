package com.company;

public class Main {

    public static void main(String[] args) {

        Partida partida = new Partida();

        String carta = "\uD83D\uDE17";
        System.out.println(carta);

        Jugador jugador1 = new Jugador();
        Maquina jugador2 = new Maquina();

        partida.mostrarTurno();

        for (int i = 0; partida.contador <=20 ; i++) {
            partida.pedirDecision();

            jugador1.decidir();

            partida.acumular(jugador1.decision);

            boolean acaba = partida.comprobarFin();


            if(acaba == true) break;

            partida.mostrarContador();


            partida.mostrarTurno2();

            jugador2.decidir();


            partida.acumular(jugador2.decision);

            partida.mostrarContador();


            acaba = partida.comprobarFin2();
            if(acaba) break;
        }
    }
}


// parametros:   enviar -> recibir
// return:       retornar -> recoger
