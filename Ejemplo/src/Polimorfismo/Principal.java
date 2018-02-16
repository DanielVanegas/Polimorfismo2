package Polimorfismo;

public class Principal {

    public static void main(String[] args) {

        Perro firulais, Rocky;
        firulais = new Perro();
        Rocky = new Perro();

        for (int i=1;i<10;i++){
            
            firulais.ladrar();
            
        }

        Rocky.ladrar(0);
        firulais.ladrar(0);
        Rocky.ladrar(0);
        firulais.ladrar(0, 0);

    }

}
