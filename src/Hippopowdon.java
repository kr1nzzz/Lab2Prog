import ru.ifmo.se.pokemon.*;

public class Hippopowdon extends Pokemon {
    public Hippopowdon(String name, int level) {
        super(name, level);
        setType(Type.GROUND);
        setStats(108, 112, 118, 68, 72, 47);
        setMove(new Bite(), new RockTomb(), new SandAttack(), new StoneEdge());
    }
}