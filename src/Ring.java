public class Ring extends Accessories implements Accessory {
    public Ring(String name, String type, String effect) {
        super(name, type, effect);
    }

    @Override
        public void giveEffect(Character1 player) {
            player.dexterity += 10;
            player.stamina += 10;
        }
}
