// ---------------------------------------------------------------------------
// File name: World.java
// Project name: Game Project
// ---------------------------------------------------------------------------
// Creator’s name and email: Alex Shepherd, shepherdap@etsu.edu
// Course-Section: CSCI-1260-900
// Creation Date: 11-13-2020
// Date of Last Modification: 11-17-2020
// ---------------------------------------------------------------------------

import java.util.ArrayList;

/**
 * Class Name: World <br>
 * Class Purpose: constructs the world with generated chests, barrels, and persons<br>
 *
 * <hr>
 * Date created: 11-13-2020
 * Date last modified: 11-17-2020
 * @author Alex Shepherd
 */
public class World {
    public ArrayList<Chest> chests;
    public ArrayList<Barrel> barrels;
    public ArrayList<Person> people;
    public Person player;

    /**
     * Method Name: World <br>
     * Method Purpose: constructor<br>
     *
     * <hr>
     * Date created: 11-13-2020
     * Date last modified: 11-15-2020
     */
    public World() {
        chests = new ArrayList<>();
        barrels = new ArrayList<>();
        people = new ArrayList<>();
        for (int i = 0; i < 3; i++)
        {
            makeChest();
            makeBarrel();
            makeGoblin();
        }
        player = new Human("Player");
    }

    /**
     * Method Name: makeChest<br>
     * Method Purpose: builds chest and adds it to chests ArrayList<br>
     *
     * <hr>
     * Date created: 11-13-2020
     * Date last modified: 11-17-2020
     */
    public void makeChest()
    {
        Chest chest = new Chest();
        chest.pickup(EquipmentManager.makeRandomArmor());
        chest.pickup(EquipmentManager.makeRandomWeapon());
        chest.pickup(EquipmentManager.makeRandomConsumable());
        chests.add(chest);
    }

    /**
     * Method Name: makeBarrel<br>
     * Method Purpose: builds barrel and adds it to barrels ArrayList<br>
     *
     * <hr>
     * Date created: 11-13-2020
     * Date last modified: 11-17-2020
     */
    public void makeBarrel()
    {
        Barrel barrel = new Barrel();
        barrel.pickup(EquipmentManager.makeRandomArmor());
        barrel.pickup(EquipmentManager.makeRandomWeapon());
        barrel.pickup(EquipmentManager.makeRandomConsumable());
        barrels.add(barrel);
    }

    /**
     * Method Name: makeGoblin<br>
     * Method Purpose: builds goblin and adds it to people ArrayList<br>
     *
     * <hr>
     * Date created: 11-13-2020
     * Date last modified: 11-17-2020
     */
    public void makeGoblin() {
        Goblin goblin = new Goblin();
        people.add(goblin);
    }

    /**
     * Method Name: makeHuman<br>
     * Method Purpose: builds human and adds it to people ArrayList<br>
     *
     * <hr>
     * Date created: 11-13-2020
     * Date last modified: 11-17-2020
     */
    public void makeHuman() {
        Human human = new Human("Villager");
        people.add(human);
    }

    /**
     * Method Name: listChests<br>
     * Method Purpose: uses a for loop to construct a list of chests in chests ArrayList<br>
     *
     * <hr>
     * Date created: 11-13-2020
     * Date last modified: 11-17-2020
     * @return list
     */
    public String listChests() {
        String str = "";
        for (int i = 0; i<chests.size(); i++) {
            str += i + ". Chest\n\t" + chests.get(i).getEquipmentList() + ("\n");
        }
        return str;
    }

    /**
     * Method Name: listBarrels<br>
     * Method Purpose: uses a for loop to construct a list of barrels in barrels ArrayList<br>
     *
     * <hr>
     * Date created: 11-13-2020
     * Date last modified: 11-17-2020
     * @return list
     */
    public String listBarrels() {
        String str = "";
        for (int i = 0; i<barrels.size(); i++) {
            str += i + ". Barrel\n\t" + barrels.get(i).getEquipmentList() + ("\n");
        }
        return str;
    }

    /**
     * Method Name: listPeople<br>
     * Method Purpose: uses a for loop to construct a list of persons in people ArrayList<br>
     *
     * <hr>
     * Date created: 11-13-2020
     * Date last modified: 11-17-2020
     * @return list
     */
    public String listPeople() {
        String str = "";
        for (int i = 0; i<people.size(); i++) {
            str += i + ". People\n\t" + people.get(i).getEquipmentList() + ("\n");
        }
        return str;
    }

    /**
     * Method Name: listTargets<br>
     * Method Purpose: uses a for loop to construct a list of hitable objects<br>
     *
     * <hr>
     * Date created: 11-13-2020
     * Date last modified: 11-15-2020
     * @return list
     */
    public String listTargets() {
        return (listBarrels() + listPeople());
    }

    /**
     * Method Name: speakTo<br>
     * Method Purpose: makes parameter speak<br>
     *
     * <hr>
     * Date created: 11-13-2020
     * Date last modified: 11-15-2020
     * @param person
     * @return spoken phrase
     */
    public String speakTo(Person person) {
        return person.saySomething();
    }

    /**
     * Method Name: attack<br>
     * Method Purpose: attacks parameter<br>
     *
     * <hr>
     * Date created: 11-13-2020
     * Date last modified: 11-15-2020
     * @param target
     * @return int
     */
    public int attack(IHitable target) {
        return player.attack(target);
    }

    /**
     * Method Name: transferEquipment<br>
     * Method Purpose: transfers entire equipment between inventory enabled objects<br>
     *
     * <hr>
     * Date created: 11-13-2020
     * Date last modified: 11-15-2020
     * @param destination
     * @param source
     */
    public void transferEquipment(IInventory source, IInventory destination)
    {
        int amount = source.countEquipment();
        for (int i = 0; i < amount; i++)
        {
            destination.pickup(source.getEquipment(i));
        }
        source.dropAllEquipment();
    }

    /**
     * Method Name: peekInside<br>
     * Method Purpose: shows inventory of parameter<br>
     *
     * <hr>
     * Date created: 11-13-2020
     * Date last modified: 11-15-2020
     * @param inventory
     * @return list
     */
    public String peekInside(IInventory inventory) {
        return inventory.getEquipmentList();
    }

    /**
     * Method Name: getPersonInfo<br>
     * Method Purpose: shows info of person parameter<br>
     *
     * <hr>
     * Date created: 11-13-2020
     * Date last modified: 11-15-2020
     * @param person
     * @return info
     */
    public String getPersonInfo(Person person) {
        return person.toString();
    }

    /**
     * Method Name: getPlayerInfo<br>
     * Method Purpose: shows info of player parameter<br>
     *
     * <hr>
     * Date created: 11-13-2020
     * Date last modified: 11-15-2020
     * @return info
     */
    public String getPlayerInfo() {
        return player.toString();
    }

    /**
     * Method Name: listPlayerInventory<br>
     * Method Purpose: shows player inventory<br>
     *
     * <hr>
     * Date created: 11-13-2020
     * Date last modified: 11-15-2020
     * @return list
     */
    public String listPlayerInventory() {
        return player.getEquipmentList();
    }

    /**
     * Method Name: equipEquipment<br>
     * Method Purpose: equips equipment<br>
     *
     * <hr>
     * Date created: 11-13-2020
     * Date last modified: 11-15-2020
     * @param eqmt
     * @return boolean
     */

    public boolean equipEquipment(Equipment eqmt) {
        return player.equip(eqmt);
    }

    /**
     * Method Name: useEquipment<br>
     * Method Purpose: uses equipment<br>
     *
     * <hr>
     * Date created: 11-13-2020
     * Date last modified: 11-15-2020
     * @param eqmt, target
     * @return boolean
     */
    public boolean useEquipment(Equipment eqmt, Person target)
    {
        if(eqmt instanceof Weapon) return ((Weapon) eqmt).use(target);
        if(eqmt instanceof Armor) return ((Armor) eqmt).use(target);
        if(eqmt instanceof Consumable) return ((Consumable)eqmt).use(target);
        return false;
    }
}
