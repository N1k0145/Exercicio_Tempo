package com.mycompany.tempo;

public class Tempo {

    double minutos;

    public void converterParaHoras() {
        double horas = minutos / 60;

        System.out.println("Minutos: " + minutos);
        System.out.println("Horas: " + horas);
    }

    public static void main(String[] args) {

        Tempo t = new Tempo();

        t.minutos = 120;

        t.converterParaHoras();
    }
}