// ---------------------------------------------------------------------------
// File name: EquipmentManager.java
// Project name: Game Project
// ---------------------------------------------------------------------------
// Creator’s name and email: Matthew Beeler beelerm@etsu.edu
// Course-Section: CSCI-1260-900
// Creation Date: 10-13-2020
// Date of Last Modification: 11-12-2020
// ---------------------------------------------------------------------------

/**
 * Class Name: EquipmentManager <br>
 * Class Purpose: manages player's equipment <br>
 *
 * <hr>
 * Date created: 10-13-2020
 * Date last modified: 11-12-2020
 * @author Matthew Beeler
 **/

import java.util.ArrayList;
import java.util.Random;

public class EquipmentManager {

    private ArrayList<Equipment> equipment;
    private Random rand = new Random();

    /**
     * Method Name: EquipmentManager <br>
     * Method Purpose: constructor <br>
     *
     * <hr>
     * Date created: 10-20-2020 <br>
     * Date last modified: 11-12-2020 <br>
     * @author Matthew Beeler
     */
    public EquipmentManager() {
        this.equipment = new ArrayList<Equipment>();
    }

    /**
     * Method Name: clearAll <br>
     * Method Purpose: deletes all equipment(?) <br>
     *
     * <hr>
     * Date created: 10-20-2020 <br>
     * Date last modified: 11-12-2020 <br>
     * @author Matthew Beeler
     */
    public void clearAll() { equipment.clear(); }

    /**
     * Method Name: countEquipment <br>
     * Method Purpose: counts up all equipment pieces <br>
     *
     * <hr>
     * Date created: 10-20-2020 <br>
     * Date last modified: 11-12-2020 <br>
     * @return int number of equipment
     * @author Matthew Beeler
     */
    public int countEquipment()
    {
        return equipment.size();
    }

    /**
     * Method Name: countArmor <br>
     * Method Purpose: counts up all armors <br>
     *
     * <hr>
     * Date created: 11-8-2020 <br>
     * Date last modified: 11-12-2020 <br>
     * @return number of pieces of armor
     * @author Matthew Beeler
     */
    public int countArmor()
    {
        int armorCount = 0;
        for(Equipment e:equipment)
        {
            if(e instanceof Armor) armorCount++;
        }
        return armorCount;
    }

    /**
     * Method Name: countWeapon <br>
     * Method Purpose: counts up all weapons <br>
     *
     * <hr>
     * Date created: 10-20-2020 <br>
     * Date last modified: 11-12-2020 <br>
     * @return int number of weapons
     * @author Matthew Beeler
     */
    public int countWeapons()
    {
        int weaponCount = 0;
        for(Equipment e:equipment)
        {
            if(e instanceof Weapon) weaponCount++;
        }
        return weaponCount;
    }

    /**
     * Method Name: countConsumable <br>
     * Method Purpose: counts up all Consumables <br>
     *
     * <hr>
     * Date created: 11-8-2020 <br>
     * Date last modified: 11-12-2020 <br>
     * @return int number of consumables
     * @author Matthew Beeler
     */
    public int countConsumables()
    {
        int consumableCount = 0;
        for(Equipment e:equipment)
        {
            if(e instanceof Consumable) consumableCount++;
        }
        return consumableCount;
    }

    /**
     * Method Name: removeEquipment <br>
     * Method Purpose: removes a piece of equipped equipment <br>
     *
     * <hr>
     * Date created: 10-20-2020 <br>
     * Date last modified: 11-12-2020 <br>
     * @param  index
     * @author Matthew Beeler
     */
    public void removeEquipment(int index)
    {
        if(equipment.size() > index)
        {
            equipment.remove(index);
        }
    }

    /**
     * Method Name: getEquipmentDetails <br>
     * Method Purpose: returns details about specified equipment <br>
     *
     * <hr>
     * Date created: 10-20-2020 <br>
     * Date last modified: 11-12-2020 <br>
     * @author Matthew Beeler
     */
    public String getEquipmentDetails(int index)
    {
        if(equipment.size() > index)
        {
            return equipment.get(index).toString();
        }
        return "That is not a valid index.";
    }

        /**
         * Method Name: getEquipment <br>
         * Method Purpose: returns a specified equipment <br>
         *
         * <hr>
         * Date created: 11-8-2020 <br>
         * Date last modified: 11-12-2020 <br>
         * @author Matthew Beeler
         */
        public Equipment getEquipment(int index)
        {
            if(equipment.size() > index)
            {
                return equipment.get(index);
            }
            return null;
        }

    /**
     * Method Name: getEquipmentList <br>
     * Method Purpose: returns a list of all equipment<br>
     *
     * <hr>
     * Date created: 10-20-2020 <br>
     * Date last modified: 10-20-2020 <br>
     * @return ArrayList equipmentlist
     * @author Matthew Beeler
     */
    public String getEquipmentList()
    {
        int i = 0;
        int size = equipment.size();
        String str = "\nEquipment:";
        if(size >=1)
        {
            for(i=0; i< size; i++)
            {
                str += "\n" + (i+1) + ". " + equipment.get(i).getName();
            }
        } else { str += "\nNo Equipment Found.";}
         return str;
    }

    /**
     * Method Name: getEquipmentListDetails <br>
     * Method Purpose: returns a list of all equipment and its respective details<br>
     *
     * <hr>
     * Date created: 10-20-2020 <br>
     * Date last modified: 10-25-2020 <br>
     * String EquipmentListDetails
     * @author Matthew Beeler
     */
    public String getEquipmentListDetails()
    {
        int size = equipment.size();
        String str = "\nEquipment:";
        if(size >=1)
        {
            for(int i=0; i< size; i++)
            {
                str += "\n" + (i+1) + ". " + equipment.get(i).toString();
            }
        } else { str += "\nNo Equipment Found.";}
        return str;
    }

    /**
     * Method Name: addEquipment <br>
     * Method Purpose: adds a item to the equipment arraylist<br>
     *
     * <hr>
     * Date created: 11-8-2020 <br>
     * Date last modified: 11-8-2020
     * @author Matthew Beeler
     */
    public void addEquipment(Equipment e) { equipment.add(e);}

    /**
     * Method Name: makeRandomWeapon <br>
     * Method Purpose: creates a weapon of random type<br>
     *
     * <hr>
     * Date created: 11-8-2020 <br>
     * Date last modified: 11-12-2020
     * @author Matthew Beeler
     */
    public static Weapon makeRandomWeapon()
    {
        Random rand = new Random();
        switch(rand.nextInt(4))
        {
            case 0 :
                return new Spear();
            case 1 :
                return new Sword();
            case 2 :
                return new LongBow();
            default :
                return new ThrowingAxe();
        }
    }

        /**
         * Method Name: makeRandomArmor <br>
         * Method Purpose: creates a piece of armor<br>
         *
         * <hr>
         * Date created: 11-8-2020 <br>
         * Date last modified: 11-12-2020
         * @author Matthew Beeler
         */
        public static Armor makeRandomArmor()
        {
            Random rand = new Random();
            if(rand.nextInt(2) == 1) return new Helmet();
            return new Body();
        }

    /**
     * Method Name: makeRandomConsumable <br>
     * Method Purpose: creates a random Consumable (only Healthkit currently)<br>
     *
     * <hr>
     * Date created: 11-8-2020 <br>
     * Date last modified: 11-8-2020
     * @author Matthew Beeler
     */
    public static Consumable makeRandomConsumable()
        {
            Consumable Ran = new FirstAidKit();
            /*int Num = rand.nextInt(2);  //blocked out currently as Healthkit is the only current consumable.
            switch (Num) {
                default:  Ran = new Consumable(); break; */
            return Ran;
        }
}