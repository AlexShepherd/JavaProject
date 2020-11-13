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


public abstract class Consumable extends Equipment implements IUsable;

public class Person {

    private String name;
    private ArrayList<String> thingsToSay = new ArrayList<String>();
    private ArrayList<String> saySomething = new ArrayList<String>();
    private Helmet helmet;
    private Plackart plackart;
    private Weapon weapon;
    private EquipmentManager Inventory;
    private int maxHealth;
    private int currentHealth;

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

            result = weapon.attack();

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
}
