package Polimorfismo;

public class Principal {

    public static void main(String[] args) {

        Canisario rex;
        rex = new Canisario();

        if (rex.detecnarc() == true) {

            rex.ladrar(0);
        } else {

            rex.ladrar();
        }

    }

}
