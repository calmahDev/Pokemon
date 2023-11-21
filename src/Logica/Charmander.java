package Logica;

public class Charmander  extends Pokemon implements IFuego{
    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola soy Charmander y este es mi ataque de Aplacaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Hola soy Charmander y este es mi ataque de Araniazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hola soy Charmander y este es mi ataques de Mordisco");
    }

    @Override
    public void atacarPunioFuego() {
        System.out.println("Soy Charmander y este es mi ataque de Punio Fuego");
    }

    @Override
    public void atacarLanzallamas() {
        System.out.println("Soy charmander y este es mi ataque de Lanzallamas");
    }

    @Override
    public void atacarAscuas() {

    }
}
