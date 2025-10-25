import ru.ifmo.se.pokemon.*;

public class Vibrava extends Trapinch {
    public Vibrava(String name, int level) {
        super(name, level);
        setType(Type.DRAGON);
        setStats(50, 70, 50, 50, 50, 70);
        setMove(new BugBuzz());
    }
}