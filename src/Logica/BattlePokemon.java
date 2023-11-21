package Logica;

public class BattlePokemon {

    public static  void  main (String[] args){
        Bulbasaur bulbasaur = new Bulbasaur();
        Charmander charmander = new Charmander();
        Pikachu pikachu = new Pikachu();
        Squirtle squirtle = new Squirtle();


        bulbasaur.atacarPlacaje();
        bulbasaur.atacarDrenaje();

        charmander.atacarAraniazo();
        charmander.atacarLanzallamas();

        pikachu.atacarAraniazo();
        pikachu.atacarImpactrueno();

        squirtle.atacarAraniazo();
        squirtle.atacarHidrobomba();
    }
}
