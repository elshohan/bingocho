package Clases;

public class Bola {
    public int numero;

    // Crea una bola aleatoria cada que es instanciada la clase
    public Bola() {
        this.numero = (int) Math.floor(Math.random()*90+1);
    }
}
