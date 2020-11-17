import java.util.ArrayList;

public class World {
    public ArrayList<Chest> chests;
    public ArrayList<Barrel> barrels;
    public ArrayList<Person> people;
    public Person player;

    public World() {
        chests = new ArrayList<>();
        barrels = new ArrayList<>();
        people = new ArrayList<>();
    }

    public void makeChest() {
        chests.add(new Chest());
    }

    public void makeBarrel() {
        barrels.add(new Barrel());
    }

    public void makeGoblin() {
        people.add(new Goblin("Goblin"));
    }

    public void makeHuman() {
        people.add(new Human("Villager"));
    }

    public String listChests() {
        String str = "";
        for (int i = 0; i<chests.size(); i++) {
            str += i + ". Chest\n\t" + chests.get(i).getEquipmentList() + ("\n");
        }
        return str;
    }

    public String listBarrels() {
        String str = "";
        for (int i = 0; i<barrels.size(); i++) {
            str += i + ". Barrel\n\t" + barrels.get(i).getEquipmentList() + ("\n");
        }
        return str;
    }

    public String listPeople() {
        String str = "";
        for (int i = 0; i<people.size(); i++) {
            str += i + ". People\n\t" + people.get(i).getEquipmentList() + ("\n");
        }
        return str;
    }

    public String listTargets() {
        return (listBarrels() + listPeople());
    }

    public String speakTo(Person person) {
        return person.saySomething();
    }

    public int attack(IHitable target) {
        return player.attack(target);
    }

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
