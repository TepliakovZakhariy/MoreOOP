package lotr;

import java.util.Random;

public abstract class Human extends Character {

    public Human(int min, int max) {
        super(getRandom(min, max), getRandom(min, max));
    }

    private static int getRandom(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min) + min;
    }

    public void kick(Character c) {
        Random random = new Random();
        c.setHp(c.getHp() - random.nextInt(this.getPower()));
    }
}
