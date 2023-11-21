package Logica;

public class Squirtle extends Pokemon implements IAgua {
    @Override
    public void atacarHidrobomba() {
        System.out.println("Soy Squirtle y este es mi ataque de Hidrobomba");
    }

    @Override
    public void atacarBurbujas() {
        System.out.println("Soy Squirtle y este es mi ataque de Burbujas");
    }

    @Override
    public void atacarPistolaAgua() {
        System.out.println("Soy Squirtle y estse es mi ataque de Pistola de Agua");
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Soy Squirtle y este es mi ataque de Paclaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Soy Squirtle y este es mi ataque de Araniazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Soy Squirtle y este es mi ataque de Mordisco");
    }
}
