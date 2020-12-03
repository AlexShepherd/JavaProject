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

public abstract class Actor implements IHitable, IInventory
{
    private String name;
    protected ArrayList<String> thingsToSay;
    private Helmet helmet;
    private Plackart plackart;
    private Weapon weapon;
    private EquipmentManager inventory;
    private int maxHealth;
    private int currentHealth;

    public Actor(String name)
    {
        this.name = name;
        maxHealth = 50;
        currentHealth = 40;
        inventory = new EquipmentManager();
        thingsToSay = new ArrayList<>();
    }

    public String saySomething()
    {
        return "";
    }

    public int getMaxHealth()
    {
        return maxHealth;
    }

    @Override
    public int getCurrentHealth()
    {
        return currentHealth;
    }

    @Override
    public boolean isHitableDestroyed()
    {
        return currentHealth <= 0;
    }

    @Override
    public int takeDamage(int dmg, int fire, int ice)
    {
        int armorBonus = 0;
        if(helmet != null)
        {
            fire -= (helmet.hasFireProtection() ? 3:0);
            ice -= (helmet.hasIceProtection() ? 3:0);
            armorBonus += helmet.getArmorBonus()/2;
        }
        if(plackart != null)
        {
            fire -= (plackart.hasFireProtection() ? 3:0);
            ice -= (plackart.hasIceProtection() ? 3:0);
            armorBonus += plackart.getArmorBonus()/2;
        }
        fire = (fire < 0 ? 0:fire);
        ice = (ice < 0 ? 0:ice);
        int damage = dmg + fire + ice;
        damage = (damage <= armorBonus) ? 0:(damage - armorBonus);
        currentHealth -= damage;
        return damage;
    }

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

    @Override
    public void pickup(Equipment equipment) {
        inventory.addEquipment(equipment);
    }

    @Override
    public void transferAllEquipmentFrom(IInventory other) {
        int otherSize = other.countEquipment();
        for(int i = 0; i < otherSize; i++)
        {
            pickup(other.getEquipment(i));
        }
        other.dropAllEquipment();
    }

    @Override
    public int countArmor() {
        return inventory.countArmor();
    }

    @Override
    public int countWeapons() {
        return inventory.countWeapons();
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
    public void dropAllEquipment()
    {
        inventory.clearAll();
    }

    public boolean equip(Equipment e)
    {
        if(e instanceof Plackart) return equipPlackart((Plackart)e);
        if(e instanceof Helmet) return equipHelmet((Helmet)e);
        if(e instanceof Weapon) return equipWeapon((Weapon) e);
        return false;
    }

    public int attack(IHitable target, String name)
    {
        if(weapon != null)
        {
            return target.takeDamage(weapon.getNormalDamage(), weapon.getFireDamage(), weapon.getIceDamage());
        }
        return 0;
    }

    public String getName()
    {
        return name;
    }

    public String toString()
    {
        String information = "\n";
        information += "Name: " + name + "\n";
        information += "Health: " + currentHealth + "/" + maxHealth + "\n";
        information += "Helmet: " + (helmet == null ? "None":helmet.getName()) + "\n";
        information += "Plackart: " + (plackart == null ? "None":plackart.getName()) + "\n";
        information += "Weapon: " + (weapon == null ? "None":weapon.getName()) + "\n";
        return information;
    }

    private boolean equipHelmet(Helmet helmet)
    {
        if(this.helmet != null) pickup(this.helmet);
        this.helmet = helmet;
        return true;
    }

    private boolean equipPlackart(Plackart plackart)
    {
        if(this.plackart != null) pickup(this.plackart);
        this.plackart = plackart;
        return true;
    }

    private boolean equipWeapon(Weapon weapon)
    {
        if(this.weapon != null) pickup(this.weapon);
        this.weapon = weapon;
        return true;
    }
}
