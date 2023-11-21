package Logica;

public class Bulbasaur extends Pokemon implements IPlanta{
    @Override
    protected void atacarPlacaje() {
        System.out.println("hola  soy Bulbasaur y este es mi ataque de Aplacaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Hola soy Bolbasaur y este es mi ataque de Araniazo ");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hola soy Bolbasaur y este es mi ataque de Mordisco");
    }

    @Override
    public void atacarDrenaje() {
        System.out.println("Soy Bolbasaur y este es mia ataque de Drenaje");
    }

    @Override
    public void atacarParalizar() {
        System.out.println("Soy Bolbasaur y este es mi ataque de Paralizar");
    }
}
