package Polimorfismo;

public class Perro {

    void ladrar() {

        System.out.println("Guau guau");
    }

    //Sobrercarga de metodo
    void ladrar(int rabia) {

        System.out.println("Grrr grrr");
    }
    // Sobre carga
    void ladrar(int rabia, int miedo) {

        System.out.println("Ayyyy diomio");
    }

}
