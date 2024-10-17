package Pokemon;

import java.util.Arrays;
import java.util.List;

public class Pokemon {
    private String name;
    List<String> type;
    int total;
    int hp;
    int  attack;

    public Pokemon(String name, List<String> type, int total, int hp, int attack) {
        this.name = name;
        this.type = type;
        this.total = total;
        this.hp = hp;
        this.attack = attack;
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "name='" + name + '\'' +
                ", total=" + total +
                ", hp=" + hp +
                ", attack=" + attack +
                ", type=" + type +
                '}';
    }
}
//public abstract void specialAttack();
    //public abstract void specialDefence();
/*  Name 	Description
name 	The name of the pokemon.
type 	The type(s) attached to the pokemon.   max 2 stycken
total 	The sum of all the pokemon stats, a proxy of how strong a pokemon is.
hp 	The hit points.
attack 	The attack points of the pokemon.
*/








