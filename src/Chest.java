// ---------------------------------------------------------------------------
// File name: Chest.java
// Project name: Game Project
// ---------------------------------------------------------------------------
// Creator’s name and email: Roberto Hernandez, hernandezr@etsu.edu
// Course-Section: CSCI-1260-900
// Creation Date: 11-11-2020
// Date of Last Modification: 11-11-2020
// ---------------------------------------------------------------------------

/**
 * Class Name: Chest <br>
 * Class Purpose: Chest class implementing IUsable and IInventory<br>
 *
 * <hr>
 * Date created: 11-11-2020
 * Date last modified: 11-11-2020
 * @author Roberto Hernandez
 */
public class Chest implements IUsable, IInventory
{
    EquipmentManager inventory;

    /**
     * Method Name: Chest <br>
     * Method Purpose: constructor<br>
     *
     * <hr>
     * Date created: 11-11-2020 <br>
     * Date last modified: 11-11-2020 <br>
     */
    public Chest()
    {
inventory = new EquipmentManager();
    }

    /**
     * Method Name: use <br>
     * Method Purpose: implementing use method<br>
     *
     * <hr>
     * Date created: 11-11-2020 <br>
     * Date last modified: 11-11-2020 <br>
     * @return boolean
     * @param person
     */
    @Override
    public boolean use(Person person)
    {
        person.transferAllEquipmentFrom(this);
        return true;
    }

    /**
     * Method Name: pickup <br>
     * Method Purpose: implementing pickup method<br>
     *
     * <hr>
     * Date created: 11-11-2020 <br>
     * Date last modified: 11-11-2020 <br>
     * @param equipment
     */
    @Override
    public void pickup(Equipment equipment)
    {
        inventory.addEquipment(equipment);
    }

    /**
     * Method Name: transferAllEquipmentFrom <br>
     * Method Purpose: implementing transferAllEquipmentFrom method<br>
     *
     * <hr>
     * Date created: 11-11-2020 <br>
     * Date last modified: 11-11-2020 <br>
     * @param other
     */
    @Override
    public void transferAllEquipmentFrom(IInventory other)
    {
        int otherSize = other.countEquipment();
        for(int i = 0; i < otherSize; i++)
        {
            pickup(other.getEquipment(i));
        }
        other.dropAllEquipment();
    }

    /**
     * Method Name: countArmor <br>
     * Method Purpose: implementing countArmor method<br>
     *
     * <hr>
     * Date created: 11-11-2020 <br>
     * Date last modified: 11-11-2020 <br>
     * @return int
     */
    @Override
    public int countArmor()
    {
        return inventory.countArmor();
    }

    /**
     * Method Name: countWeapon <br>
     * Method Purpose: implementing countWeapon method<br>
     *
     * <hr>
     * Date created: 11-11-2020 <br>
     * Date last modified: 11-11-2020 <br>
     * @return int
     */
    @Override
    public int countWeapons()
    {
        return inventory.countWeapons();
    }

    /**
     * Method Name: countConsumables <br>
     * Method Purpose: implementing countConsumables method<br>
     *
     * <hr>
     * Date created: 11-11-2020 <br>
     * Date last modified: 11-11-2020 <br>
     * @return int
     */
    @Override
    public int countConsumables()
    {
        return inventory.countConsumables();
    }

    /**
     * Method Name: countEquipment <br>
     * Method Purpose: implementing countEquipment method<br>
     *
     * <hr>
     * Date created: 11-11-2020 <br>
     * Date last modified: 11-11-2020 <br>
     * @return int
     */
    @Override
    public int countEquipment()
    {
        return countEquipment();
    }

    /**
     * Method Name: getEquipmentList <br>
     * Method Purpose: implementing getEquipmentList method<br>
     *
     * <hr>
     * Date created: 11-11-2020 <br>
     * Date last modified: 11-11-2020 <br>
     * @return string
     */
    @Override
    public String getEquipmentList()
    {
        return inventory.getEquipmentList();
    }

    /**
     * Method Name: getEquipmentInfo <br>
     * Method Purpose: implementing getEquipmentInfo method<br>
     *
     * <hr>
     * Date created: 11-11-2020 <br>
     * Date last modified: 11-11-2020 <br>
     * @return string
     * @param index
     */
    @Override
    public String getEquipmentInfo(int index)
    {
        return inventory.getEquipmentDetails(index);
    }

    /**
     * Method Name: getEquipment <br>
     * Method Purpose: implementing getEquipment method<br>
     *
     * <hr>
     * Date created: 11-11-2020 <br>
     * Date last modified: 11-11-2020 <br>
     * @return equipment
     * @param index
     */
    @Override
    public Equipment getEquipment(int index)
    {
        return inventory.getEquipment(index);
    }

    /**
     * Method Name: dropEquipment <br>
     * Method Purpose: implementing dropEquipment method<br>
     *
     * <hr>
     * Date created: 11-11-2020 <br>
     * Date last modified: 11-11-2020 <br>
     * @param index
     */
    @Override
    public void dropEquipment(int index)
    {
        inventory.removeEquipment(index);
    }

    /**
     * Method Name: dropAllEquipment <br>
     * Method Purpose: implementing dropAllEquipment method<br>
     *
     * <hr>
     * Date created: 11-11-2020 <br>
     * Date last modified: 11-11-2020 <br>
     */
    @Override
    public void dropAllEquipment()
    {
        inventory.clearAll();
    }

    /**
     * Method Name: addEquipment <br>
     * Method Purpose: implementing addEquipment method<br>
     *
     * <hr>
     * Date created: 11-11-2020 <br>
     * Date last modified: 11-11-2020 <br>
     * @param equipment 
     */
    @Override
    public void addEquipment(Equipment equipment)
    {
        inventory.addEquipment(equipment);
    }
}
