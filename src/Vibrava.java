import ru.ifmo.se.pokemon.*;

public class Vibrava extends Pokemon {
    private String nickname;

    public Vibrava(String name, int level) {
        super(name, level);
        this.nickname = name;
        setType(Type.GROUND, Type.DRAGON);
        setStats(50, 70, 50, 50, 50, 70);
        setMove(new FeintAttack(), new RockSlide(), new BugBuzz());
    }

    public Pokemon checkEvolution() {
        if (getLevel() >= 45) {
            Pokemon evolved = new Flygon(nickname, getLevel());
            System.out.println(nickname + " эволюционирует в Flygon!");
            return evolved;
        }
        return this;
    }
}