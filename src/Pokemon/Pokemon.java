package Pokemon;

public abstract class Pokemon {
    private String name;
    private String type;
    private CombatStats combatStats;

    public abstract void specialAttack();
    public abstract void specialDefence();
}
