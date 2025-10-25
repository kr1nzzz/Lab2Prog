import ru.ifmo.se.pokemon.*;

public class Hippopotas extends Pokemon {

    public Hippopotas(String name, int level) {
        super(name, level);
        setType(Type.GROUND);
        setStats(68, 72, 78, 38, 42, 32);
        setMove(new Bite(), new RockTomb(), new SandAttack());
    }
}