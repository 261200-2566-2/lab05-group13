public class Shield extends Accessories implements Accessory {

    public Shield(String name, String type, String effect) {
        super(name, type, effect);
    }

    @Override
    public void giveEffect(Character1 player) {
        player.hp += 50; // example
    }
}
