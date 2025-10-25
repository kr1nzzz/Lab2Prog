import ru.ifmo.se.pokemon.*;

public class Lapras extends Pokemon {
    public Lapras(String name, int level) {
        super(name, level);
        setType(Type.WATER, Type.ICE);
        setStats(130, 85,80, 85, 95, 60);
        setMove(new Sing(), new Confide(), new Growl(), new Waterfall());
    }
}
