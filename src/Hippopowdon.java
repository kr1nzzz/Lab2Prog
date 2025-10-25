import ru.ifmo.se.pokemon.*;

public class Hippopowdon extends Hippopotas {
    public Hippopowdon(String name, int level) {
        super(name, level);
        setStats(108, 112, 118, 68, 72, 47);
        setMove(new StoneEdge());
    }
}