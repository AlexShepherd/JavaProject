import java.util.Random;

public class MakeRooms {

    public Map map;
    Random rand = new Random();

    public MakeRooms() {
        map = new Map();
        writeRooms();
    }

    public Map getMap() {
        return map;
    }

    public void writeRooms() {
        Room shelter = new Room("Shelter", "A cramped area to survive in");
        shelter.makeBarrel();
        shelter.makeExit("Wasteland");
        map.addRoom(shelter);

        Room wasteland = new Room("Wasteland", "The world is barren and orange. You see a shed in the distance..");
        wasteland.makeExit("Shed");
        map.addRoom(wasteland);


        Room shed = new Room("Shed", "It's seen better days.");
        if(rand.nextInt(100) < 25) {
            shed.makeWeaponCache();
        }
        shed.makeChest();
        shed.makeBarrel();
        shed.makeExit("Bar");
        map.addRoom(shed);

        Room bar = new Room("Bar", "rough crowd...");
        bar.makeSynth();
        bar.makeChest();
        bar.makeExit("Cellar");
        map.addRoom(bar);

        Room cellar = new Room("Cellar", "Human remains litter the floor.. What did this?");
        cellar.makeMutantRat();
        map.addRoom(cellar);
        cellar.makeExit("Sanctuary");

        Room sanctuary = new Room("Sanctuary","You, and the other patrons are saved! Well done!");
        map.addRoom(sanctuary);
    }
}
