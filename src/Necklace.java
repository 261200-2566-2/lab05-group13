public class Necklace extends Accessories implements Accessory {
    public Necklace(String name, String type, String effect) {
        super(name, type, effect);
    }

    @Override
    public void giveEffect(Character1 player) {
        player.hp += 10; // example
        player.dex -= 10;
    }
}
