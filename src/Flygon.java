import ru.ifmo.se.pokemon.*;

public class Flygon extends Pokemon {
    public Flygon(String name, int level) {
        super(name, level);
        setType(Type.GROUND, Type.DRAGON);
        setStats(80, 100, 80, 80, 80, 100);
        setMove(new FeintAttack(), new RockSlide(), new BugBuzz(), new SonicBoom());
    }
}