package Logica;

public class Pikachu extends Pokemon implements  IElectrico{
    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola soy Pikachu y este es mi ataque de Placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Hola soy Pikachu y este es mi ataque de Araniazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hola soy Pikachu y este es mi ataque de Mordisco");
    }

    @Override
    public void atacarImpactrueno() {
        System.out.println("Soy Pikachu y este es mi ataque de Impactrueno");
    }

    @Override
    public void atacarPunioTrueno() {
        System.out.println("Soy Pikachu y este es mi ataque de Punio Trueno");
    }
}
