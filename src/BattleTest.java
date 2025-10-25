import ru.ifmo.se.pokemon.*;

public class BattleTest {
    public static void main(String[] args) {
        Battle battle = new Battle();

        Lapras lap1 = new Lapras("Лапрас", 36);
        Hippopotas hippo = new Hippopotas("Гиппопотас", 32);
        Trapinch trap = new Trapinch("Трапчик", 25);
        Vibrava vibro = new Vibrava("Вибратор", 36);
        Flygon fly = new Flygon("Воздухан", 46);
        Hippopowdon hippi = new Hippopowdon("Хиппопаудон", 36);
        battle.addAlly(lap1);
        battle.addAlly(hippo);
        battle.addAlly(trap);
        battle.addFoe(vibro);
        battle.addFoe(fly);
        battle.addFoe(hippi);

        battle.go();
    }
}

