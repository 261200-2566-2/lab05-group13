public class Character1 {
    String name;
    int level;

    double mp;
    double str;
    double dex;
    double Int;
    double sta;

    String[] accessories;
    Ring equippedRing;
    Necklace equippedNecklace;

    void equipRing(Ring ring) {
        equippedRing = ring;
    }

    void unEquipRing() {
        equippedRing = null;
    }

    void equipNecklace(Necklace necklace) {
        equippedNecklace = necklace;
    }

    void unEquipNecklace() {
        equippedNecklace = null;
    }
}
