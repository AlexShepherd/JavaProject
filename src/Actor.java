// ---------------------------------------------------------------------------
// File name: Actor.java
// Project name: Game Project
// ---------------------------------------------------------------------------
// Creator’s name and email: Roberto Hernandez, hernandezr@etsu.edu ; Flavio Sanguinetti , sanguinetti@etsu.edu
// Course-Section: CSCI-1260-900
// Creation Date: 12-01-2020
// Date of Last Modification: 12-5-2020
// ---------------------------------------------------------------------------

/**
 * Class Name: Actor <br>
 * Class Purpose: abstract Actor class implementing IInventory and IHitable<br>
 *
 * <hr>
 * Date created: 12-01-2020
 * Date last modified: 12-5-2020
 * @author Roberto Hernandez & Flavio Sanguinetti
 */

import java.util.ArrayList;

public abstract class Actor implements IHitable, IInventory
{
    private String name;
    protected ArrayList<String> thingsToSay;
    private Helmet helmet;
    private Body body;
    private Weapon weapon;
    private EquipmentManager inventory;
    private int maxHealth;
    private int currentHealth;
    private int maxRadiation;
    private int currentRadiation;

    /**
     * Method Name: Actor<br>
     * Method Purpose: parameterized constructor<br>
     *
     * <hr>
     * Date created: 12-01-2020
     * Date last modified: 12-5-2020
     */
    public Actor(String name)
    {
        this.name = name;
        maxHealth = 50;
        currentHealth = 40;
        maxRadiation = 100;
        currentRadiation = 0;
        inventory = new EquipmentManager();
        thingsToSay = new ArrayList<>();
    }

    /**
     * Method Name: saySomething<br>
     * Method Purpose: dialogue<br>
     *
     * <hr>
     * Date created: 12-01-2020
     * Date last modified: 12-01-2020
     * <hr>
     * @return string
     */
    public String saySomething()
    {
        return "";
    }

    /**
     * Method Name: getMaxHealth<br>
     * Method Purpose: return max health<br>
     *
     * <hr>
     * Date created: 12-01-2020
     * Date last modified: 12-01-2020
     * <hr>
     * @return int
     */
    @Override
    public int getMaxHealth()
    {
        return maxHealth;
    }

    /**
     * Method Name: getCurrentHealth<br>
     * Method Purpose: return current health<br>
     *
     * <hr>
     * Date created: 12-01-2020
     * Date last modified: 12-01-2020
     * <hr>
     * @return int
     */
    @Override
    public int getCurrentHealth()
    {
        return currentHealth;
    }

    /**
     * Method Name: getMaxRadiation<br>
     * Method Purpose: return max radiation<br>
     *
     * <hr>
     * Date created: 12-01-2020
     * Date last modified: 12-5-2020
     * <hr>
     * @return int
     */
    @Override
    public int getMaxRadiation()
    {
        return maxRadiation;
    }

    /**
     * Method Name: getRadiationStatus<br>
     * Method Purpose: return max radiation<br>
     *
     * <hr>
     * Date created: 12-01-2020
     * Date last modified: 12-5-2020
     * <hr>
     * @return int
     */
    @Override
    public int getRadiationStatus()
    {
        return currentRadiation;
    }

    /**
     * Method Name: isHitableDestroyed<br>
     * Method Purpose: return bool if object reaches zero health<br>
     *
     * <hr>
     * Date created: 12-01-2020
     * Date last modified: 12-5-2020
     * <hr>
     * @return boolean
     */
    @Override
    public boolean isHitableDestroyed()
    {
        return currentHealth <= 0;
    }

    /**
     * Method Name: isHitableRadiated<br>
     * Method Purpose: return bool if object reaches 100 radiation<br>
     *
     * <hr>
     * Date created: 12-01-2020
     * Date last modified: 12-5-2020
     * <hr>
     * @return boolean
     */
    @Override
    public boolean isHitableRadiated()
    {
        return currentRadiation >= maxRadiation;
    }

    /**
     * Method Name: takeDamage<br>
     * Method Purpose: calculates damage after attack<br>
     *
     * <hr>
     * Date created: 12-01-2020
     * Date last modified: 12-5-2020
     * <hr>
     * @return int
     * @param dmg
     * @param fire
     * @param acid
     */
    @Override
    public int takeDamage(int dmg, int fire, int acid)
    {
        int armorBonus = 0;
        if(helmet != null)
        {
            fire -= (helmet.hasFireProtection() ? 3:0);
            acid -= (helmet.hasAcidProtection() ? 3:0);
            armorBonus += helmet.getArmorBonus()/2;
        }
        if(body != null)
        {
            fire -= (body.hasFireProtection() ? 3:0);
            acid -= (body.hasAcidProtection() ? 3:0);
            armorBonus += body.getArmorBonus()/2;
        }
        fire = (Math.max(fire, 0));
        acid = (Math.max(acid, 0));
        int damage = dmg + fire + acid;
        damage = (damage <= armorBonus) ? 0:(damage - armorBonus);
        currentHealth -= damage;
        if(acid > 0)
        {
            takeRadiation(acid);
        }
        return damage;
    }

    /**
     * Method Name: takeRadiation<br>
     * Method Purpose: calculates radiation after attack<br>
     *
     * <hr>
     * Date created: 12-5-2020
     * Date last modified: 12-5-2020
     * <hr>
     * @return int
     * @param acid
     */
    @Override
    public int takeRadiation(int acid)
    {
        int rad = acid * 2;
        currentRadiation += rad;
        if(rad > 100)
        {
            currentRadiation = maxRadiation;
        }
        return rad;
    }

    /**
     * Method Name: heal<br>
     * Method Purpose: heals health<br>
     *
     * <hr>
     * Date created: 12-01-2020
     * Date last modified: 12-01-2020
     * <hr>
     * @return int
     * @param amt
     */
    @Override
    public int heal(int amt)
    {
        int temp = maxHealth - currentHealth;
        if(temp >= amt)
        {
            currentHealth += amt;
            return amt;
        }
        currentHealth = maxHealth;
        return temp;
    }

    /**
     * Method Name: radAway<br>
     * Method Purpose: heals radiation<br>
     *
     * <hr>
     * Date created: 12-01-2020
     * Date last modified: 12-5-2020
     * <hr>
     * @return int
     * @param amt
     */
    @Override
    public int radAway(int amt)
    {
        int temp = maxRadiation - currentRadiation;
        if(temp >= amt)
        {
            currentRadiation += amt;
            return amt;
        }
        currentRadiation = maxRadiation;
        return temp;
    }

    /**
     * Method Name: pickup<br>
     * Method Purpose: add equipment<br>
     *
     * <hr>
     * Date created: 12-01-2020
     * Date last modified: 12-01-2020
     * <hr>
     * @param equipment
     */
    @Override
    public void pickup(Equipment equipment) {
        inventory.addEquipment(equipment);
    }

    /**
     * Method Name: transferAllEquipmentFrom<br>
     * Method Purpose: transfers equipment between inventories<br>
     *
     * <hr>
     * Date created: 12-01-2020
     * Date last modified: 12-01-2020
     * <hr>
     * @param other
     */
    @Override
    public void transferAllEquipmentFrom(IInventory other) {
        int otherSize = other.countEquipment();
        for(int i = 0; i < otherSize; i++)
        {
            pickup(other.getEquipment(i));
        }
        other.dropAllEquipment();
    }

    /**
     * Method Name: countArmor<br>
     * Method Purpose: returns number of armor in inventory<br>
     *
     * <hr>
     * Date created: 12-01-2020
     * Date last modified: 12-01-2020
     * <hr>
     * @return int
     */
    @Override
    public int countArmor() {
        return inventory.countArmor();
    }

    /**
     * Method Name: countWeapon<br>
     * Method Purpose: returns number of weapons in inventory<br>
     *
     * <hr>
     * Date created: 12-01-2020
     * Date last modified: 12-01-2020
     * <hr>
     * @return int
     */
    @Override
    public int countWeapons() {
        return inventory.countWeapons();
    }

    /**
     * Method Name: countConsumables<br>
     * Method Purpose: returns number of consumables in inventory<br>
     *
     * <hr>
     * Date created: 12-01-2020
     * Date last modified: 12-01-2020
     * <hr>
     * @return int
     */
    @Override
    public int countConsumables() {
        return inventory.countConsumables();
    }

    /**
     * Method Name: countEquipment<br>
     * Method Purpose: returns number of equipment in inventory<br>
     *
     * <hr>
     * Date created: 12-01-2020
     * Date last modified: 12-01-2020
     * <hr>
     * @return int
     */
    @Override
    public int countEquipment() {
        return inventory.countEquipment();
    }

    /**
     * Method Name: getEquipmentList<br>
     * Method Purpose: returns list of equipment in inventory<br>
     *
     * <hr>
     * Date created: 12-01-2020
     * Date last modified: 12-01-2020
     * <hr>
     * @return string
     */
    @Override
    public String getEquipmentList() {
        return inventory.getEquipmentList();
    }

    /**
     * Method Name: getEquipmentInfo<br>
     * Method Purpose: returns info of specific equipment in inventory<br>
     *
     * <hr>
     * Date created: 12-01-2020
     * Date last modified: 12-01-2020
     * <hr>
     * @return string
     * @param index
     */
    @Override
    public String getEquipmentInfo(int index) {
        return inventory.getEquipmentDetails(index);
    }

    /**
     * Method Name: getEquipment<br>
     * Method Purpose: returns specific equipment in inventory<br>
     *
     * <hr>
     * Date created: 12-01-2020
     * Date last modified: 12-01-2020
     * <hr>
     * @return string
     * @param index
     */
    @Override
    public Equipment getEquipment(int index) {
        return inventory.getEquipment(index);
    }

    /**
     * Method Name: dropEquipment<br>
     * Method Purpose: drops specific equipment in inventory<br>
     *
     * <hr>
     * Date created: 12-01-2020
     * Date last modified: 12-01-2020
     * <hr>
     * @param index
     */
    @Override
    public void dropEquipment(int index) {
        inventory.removeEquipment(index);
    }

    /**
     * Method Name: dropAllEquipment<br>
     * Method Purpose: drops all equipment in inventory<br>
     *
     * <hr>
     * Date created: 12-01-2020
     * Date last modified: 12-01-2020
     */
    @Override
    public void dropAllEquipment()
    {
        inventory.clearAll();
    }

    /**
     * Method Name: equip<br>
     * Method Purpose: equip equipment<br>
     *
     * <hr>
     * Date created: 12-01-2020
     * Date last modified: 12-01-2020
     * @return boolean
     * @param e
     */
    public boolean equip(Equipment e)
    {
        if(e instanceof Body) return equipPlackart((Body)e);
        if(e instanceof Helmet) return equipHelmet((Helmet)e);
        if(e instanceof Weapon) return equipWeapon((Weapon) e);
        return false;
    }

    /**
     * Method Name: attack<br>
     * Method Purpose: attacks target<br>
     *
     * <hr>
     * Date created: 12-01-2020
     * Date last modified: 12-01-2020
     * @return int
     * @param target
     */
    public int attack(IHitable target)
    {
        if(weapon != null)
        {
            return target.takeDamage(weapon.getNormalDamage(), weapon.getFireDamage(), weapon.getAcidDamage());
        }
        return 0;
    }

    /**
     * Method Name: getName<br>
     * Method Purpose: returns name<br>
     *
     * <hr>
     * Date created: 12-01-2020
     * Date last modified: 12-01-2020
     * @return string
     */
    public String getName()
    {
        return name;
    }

    /**
     * Method Name: toString<br>
     * Method Purpose: returns object<br>
     *
     * <hr>
     * Date created: 12-01-2020
     * Date last modified: 12-01-2020
     * @return string
     */
    public String toString()
    {
        String information = "\n";
        information += "Name: " + name + "\n";
        information += "Health: " + currentHealth + "/" + maxHealth + "\n";
        information += "Helmet: " + (helmet == null ? "None":helmet.getName()) + "\n";
        information += "Plackart: " + (body == null ? "None": body.getName()) + "\n";
        information += "Weapon: " + (weapon == null ? "None":weapon.getName()) + "\n";
        return information;
    }

    /**
     * Method Name: equipHelmet<br>
     * Method Purpose: equips helmet<br>
     *
     * <hr>
     * Date created: 12-01-2020
     * Date last modified: 12-01-2020
     * @return boolean
     * @param helmet
     */
    private boolean equipHelmet(Helmet helmet)
    {
        if(this.helmet != null) pickup(this.helmet);
        this.helmet = helmet;
        return true;
    }

    /**
     * Method Name: equipPlackart<br>
     * Method Purpose: equip plackart<br>
     *
     * <hr>
     * Date created: 12-01-2020
     * Date last modified: 12-01-2020
     * @return boolean
     * @param body
     */
    private boolean equipPlackart(Body body)
    {
        if(this.body != null) pickup(this.body);
        this.body = body;
        return true;
    }

    /**
     * Method Name: equipWeapon<br>
     * Method Purpose: equip weapon<br>
     *
     * <hr>
     * Date created: 12-01-2020
     * Date last modified: 12-01-2020
     * @return boolean
     * @param weapon
     */
    private boolean equipWeapon(Weapon weapon)
    {
        if(this.weapon != null) pickup(this.weapon);
        this.weapon = weapon;
        return true;
    }
}
