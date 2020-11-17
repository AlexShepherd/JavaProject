// ---------------------------------------------------------------------------
// File name: Person.java
// Project name: Game Project
// ---------------------------------------------------------------------------
// Creator’s name and email: Roberto Hernandez, hernandezr@etsu.edu ; Flavio Sanguinetti , sanguinetti@etsu.edu
// Course-Section: CSCI-1260-900
// Creation Date: 11-4-2020
// Date of Last Modification: 11-4-2020
// ---------------------------------------------------------------------------

/**
 * Class Name: Person <br>
 * Class Purpose: abstract Person class implementing IInventory and IHitable<br>
 *
 * <hr>
 * Date created: 11-4-2020
 * Date last modified: 11-4-2020
 * @author Roberto Hernandez & Flavio Sanguinetti
 */


import java.util.ArrayList;
import java.util.Random;

public abstract class Person implements IInventory, IHitable{

    private String name;
    private ArrayList<String> thingsToSay = new ArrayList<String>();
    private ArrayList<String> saySomething = new ArrayList<String>();
    private Helmet helmet;
    private Plackart plackart;
    private Weapon weapon;
    private EquipmentManager Inventory;
    private int maxHealth=50;
    private int currentHealth=40;
    private EquipmentManager inventory = new EquipmentManager();

    public Person(String name)
    {
        setName(name);
    }

    private void setName(String name) {
    }


    public boolean equip(Equipment e){

        return true;
    }

    public int attack(IHitable target){

        int result = 0;

        if(weapon.getName() == null)
        {

            result = 0;

        }
        else
        {

            result = weapon.attack(target);

        }

        return result;
    }

    public String getName(){

        return name;
    }

    public String toString(){

        String helmetName = null;
        String plackartName = null;
        String weaponName = null;

        if(helmet.getName() == null){

            helmetName = "None";

        } else {

            helmetName = helmet.getName();

        }

        if(plackart.getName() == null){

            plackartName = "None";

        } else {

            plackartName = plackart.getName();

        }

        if(weapon.getName() == null){

            weaponName = "None";

        } else {

            weaponName = weapon.getName();

        }

        return "Name: " + name + '\n' +
                "Health: " + currentHealth + "/" + maxHealth + '\n' +
                "Helmet: " + helmetName + '\n' +
                "Plackart: " + plackartName + '\n' +
                "Weapon " + weaponName + '\n';
    }

    public ArrayList<String> getThingsToSay(){

        return thingsToSay;
    }

    public void setThingsToSay(ArrayList<String> list){

        thingsToSay = list;

    }

    public String saySomething()
    {
        Random rand = new Random();
        int maxIndex = thingsToSay.size();
        int index = rand.nextInt(maxIndex);
        String  something = thingsToSay.get(index);
        return something;
    }

    @Override
    public int getMaxHealth() {
        return maxHealth;
    }

    @Override
    public int getCurrentHealth() {
        return currentHealth;
    }

    @Override
    public boolean isHitableDestroyed() {
        return getCurrentHealth() <= 0;
    }

    @Override
    public int takeDamage(int dmg, int fire, int ice) {
        int totalDmg = dmg+fire+ice;
        return (getCurrentHealth() - totalDmg);
    }

    @Override
    public int heal(int amt) {
        int newHp = (getCurrentHealth() + amt);
        if(newHp == getMaxHealth()) {
            return (getMaxHealth() - getCurrentHealth());
        }
        return amt;
    }

    @Override
    public void pickup(Equipment equipment) {
        inventory.addEquipment(equipment);
    }

    @Override
    public void transferAllEquipmentFrom(IInventory other) {
        for(int i=0; i<other.countEquipment(); i++) {
            pickup(other.getEquipment(i));
        }
        other.dropAllEquipment();
    }

    @Override
    public int countArmor() {
        return inventory.countArmor();
    }

    @Override
    public int countWeapon() {
        return inventory.countWeapon();
    }

    @Override
    public int countConsumables() {
        return inventory.countConsumables();
    }

    @Override
    public int countEquipment() {
        return inventory.countEquipment();
    }

    @Override
    public String getEquipmentList() {
        return inventory.getEquipmentList();
    }

    @Override
    public String getEquipmentInfo(int index) {
        return inventory.getEquipmentDetails(index);
    }

    @Override
    public Equipment getEquipment(int index) {
        return inventory.getEquipment(index);
    }

    @Override
    public void dropEquipment(int index) {
        inventory.removeEquipment(index);
    }

    @Override
    public void dropAllEquipment() {
        inventory.clearAll();
    }

    @Override
    public void addEquipment(Equipment equipment) {
        inventory.addEquipment(equipment);
    }
}
