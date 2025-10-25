import ru.ifmo.se.pokemon.*;

public class Trapinch extends Pokemon {
    private String nickname; // своё поле для имени

    public Trapinch(String name, int level) {
        super(name, level);
        this.nickname = name;
        setType(Type.GROUND);
        setStats(45, 100, 45, 45, 45, 10);
        setMove(new FeintAttack(), new RockSlide());
    }

    // Проверка на эволюцию в Vibrava
    public Pokemon checkEvolution() {
        if (getLevel() >= 35) {
            Pokemon evolved = new Vibrava(nickname, getLevel());
            System.out.println(nickname + " эволюционирует в Vibrava!");
            return evolved;
        }
        return this;
    }
}
