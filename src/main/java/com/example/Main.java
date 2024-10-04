package com.example;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        ArrayList<Cavallo> classifica = new ArrayList<Cavallo>();

        for(int i = 0; i < 20; i++){
            Cavallo c = new Cavallo((i+1));
            classifica.add(c);
            c.start(); // Avvia il thread del cavallo
        }

        // Attende che tutti i cavalli finiscano la corsa
        for (Cavallo cavallo : classifica) {
            try {
                cavallo.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        Collections.sort(classifica);

        for(int i = 0; i < classifica.size(); i++ ){
            System.out.println("Posizione " + (i+1) + "°  " + classifica.get(i).toString());
        }
    }
}