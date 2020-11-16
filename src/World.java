import java.util.ArrayList;

public class World {
    public ArrayList<Chest> chests;
    public ArrayList<Barrel> barrels;
    public ArrayList<Person> people;
    public ArrayList<Goblin> goblins;

    public Person player;

    Barrel barrel1 = new Barrel();
    Barrel barrel2 = new Barrel();
    Barrel barrel3 = new Barrel();

    Chest chest1 = new Chest();
    Chest chest2 = new Chest();

    Goblin goblin1 = new Goblin();
    Goblin goblin2 = new Goblin();

    Human human1 = new Human();

    public World() {
        chests = new ArrayList<>();
        barrels = new ArrayList<>();
        people = new ArrayList<>();
    }

    public void makeChest() {
        chests.add(chest1);
        chests.add(chest2);
    }

    public void makeBarrel() {
        barrels.add(barrel1);
        barrels.add(barrel2);
        barrels.add(barrel3);
    }

    public void makeGoblin() {
        goblins.add(goblin1);
        goblins.add(goblin2);
    }

    public void makeHuman() {
        people.add(human1);
        //people.add(player);       not sure if we want player in here
    }

    public String listChests() {
        return ("0. Chest\n\t" + chest1.getEquipmentList() +
                "\n1. Chest\n\t" + chest2.getEquipmentList());
    }

    public String listBarrels() {
        return ("0. Barrel\n\t" + barrel1.getEquipmentList() +
                "\n1. Barrel\n\t" + barrel2.getEquipmentList() +
                "\n2. Barrel\n\t" + barrel3.getEquipmentList());
    }

    public String listPeople() {
        return ("0. Goblin\n\t" + goblin1.getName() +
                "\n1. Goblin\n\t" + goblin2.getName() +
                "\n2. Human\n\t" + human1.getName());
    }

    public String listTargets() {
        System.out.println(listBarrels() + listPeople());
        return null; //not sure how to return both methods
    }

    public String speakTo(Person person) {
        return person.saySomething();
    }

    public int attack(IHitable target) {        //this is done incorrectly; don't know how to check player's weapon
        if (player.countWeapon() == 0) {
            System.out.println("No weapon equipped!");
        }
        return player.attack(target);
    }

    //may have problems because of transferAllEquipmentFrom() implementation
    public void transferEquipment(IInventory source, IInventory destination) {
        source.transferAllEquipmentFrom(destination);
    }
    public String peekInside(IInventory inventory) {
        return inventory.getEquipmentList();
    }
    public String getPersonInfo(Person person) {
        return person.toString();
    }
    public String getPlayerInfo() {
        return player.toString();
    }
    public String listPlayerInventory() {
        return player.getEquipmentList();
    }
    public boolean equipEquipment(Equipment eqmt) {
        player.equip(eqmt);
        return true;
    }
    //not sure about this
    public boolean useEquipment(Equipment eqmt, Person target) {
        target.equip(eqmt);
        return true;
    }
}
