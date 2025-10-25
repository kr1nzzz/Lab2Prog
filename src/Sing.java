import ru.ifmo.se.pokemon.*;

public class Sing extends StatusMove {
    public Sing() {
        super(Type.NORMAL, 0, 55);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        Effect e = new Effect().condition(Status.SLEEP).turns((int) (1 + Math.random() * 3));
        p.addEffect(e);
    }

    @Override
    protected String describe() {
        return "поёт убаюкивающую песню (Sing) и пытается усыпить противника!";
    }
}
