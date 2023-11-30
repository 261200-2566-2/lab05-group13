public class Sword extends Accessories implements Accessory {

    public Sword(String name, String type, String effect) {
        super(name, type, effect);
    }

    @Override
    public void giveEffect(Character1 player) {
        player.hp += 100; // example
    }
}
