package com.example;

public class Cavallo extends Thread implements Comparable<Cavallo>{
    //Attributi
    private int numCavallo; 
    private int tempo;

    //Costruttore
    public Cavallo(int numCavallo){
        this.numCavallo = numCavallo; 
        this.tempo = 0;
    }

    //Set e get
    public int getNumCavallo() {
        return numCavallo;
    }

    public void setNumCavallo(int numCavallo) {
        this.numCavallo = numCavallo;
    }

    public int getTempo() {
        return this.tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }

    public void run(){
        setTempo((int) (Math.random() * 1000));
        
        try {
            Thread.sleep(this.tempo);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return " Cavallo num: " + this.numCavallo + " - Time: " + this.tempo;
    }

    @Override
    public int compareTo(Cavallo altroCavallo) {
        return this.tempo - altroCavallo.getTempo();
    }

}
