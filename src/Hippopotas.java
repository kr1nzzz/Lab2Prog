import ru.ifmo.se.pokemon.*;

public class Hippopotas extends Pokemon {
    private String nickname;

    public Hippopotas(String name, int level) {
        super(name, level);
        this.nickname = name;
        setType(Type.GROUND);
        setStats(68, 72, 78, 38, 42, 32);
        setMove(new Bite(), new RockTomb(), new SandAttack());
    }

    public Pokemon checkEvolution() {
        if (getLevel() >= 45) {
            Pokemon evolved = new Hippopowdon(nickname, getLevel());
            System.out.println(nickname + " эволюционирует в Hippopowdon!");
            return evolved;
        }
        return this;
    }
}