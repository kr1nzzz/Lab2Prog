import ru.ifmo.se.pokemon.*;

public class SonicBoom extends SpecialMove {
    public SonicBoom() {
        super(Type.NORMAL, 0, 90);
    }

    @Override
    protected void applyOppDamage(Pokemon def, double damage) {
        def.setMod(Stat.HP, -20);
    }

    @Override
    protected String describe() {
        return "использует Sonic Boom и наносит фиксированные 20 урона!";
    }
}
