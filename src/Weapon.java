// ---------------------------------------------------------------------------
// File name: Weapon.java
// Project name: Game Project
// ---------------------------------------------------------------------------
// Creator’s name and email: Flavio Sanguinetti, sanguinetti@etsu.edu
// Course-Section: CSCI-1260-900
// Creation Date: 10-13-2020
// Date of Last Modification: 10-20-2020
// ---------------------------------------------------------------------------

public class Weapon extends Equipment implements IUsable
{
    private int normalDamage;
    private int iceDamage;
    private int fireDamage;
    private WeaponHandedness weaponHand;

    public Weapon (String name, int dmg, int ice, int fire, WeaponHandedness wp)
    {
        super(name, 75, .6);
        normalDamage = dmg;
        iceDamage = ice;
        fireDamage = fire;
        weaponHand = wp;
    }

    public String getName()
    {
        if(iceDamage > 0 && fireDamage > 0) return super.getName() + " of Mighty Wrath";
        if(iceDamage > 0) return "Frozen " + super.getName();
        if(fireDamage > 0) return "Flaming " + super.getName();
        return super.getName();
    }

    public int getNormalDamage() {
        return normalDamage;
    }

    public int getIceDamage() {
        return iceDamage;
    }

    public int getFireDamage() {
        return fireDamage;
    }

    public WeaponHandedness getWeaponHandedness() {
        return weaponHand;
    }

    public void setWeaponHand(WeaponHandedness weaponHand) {
        this.weaponHand = weaponHand;
    }

    public void setIceDamage(int iceDamage) {
        this.iceDamage = iceDamage;
    }

    public void setFireDamage(int fireDamage) {
        this.fireDamage = fireDamage;
    }

    public String toString()
    {
        return "{name:\"" + getName()+ "\"" + ", price:" + getPrice() + ", durability: " + "\"" + getDurabilityStatus() + "\"" + ", ice:" + iceDamage + ", fire:" + fireDamage + "weaponHandedness:" + "\"" + getWeaponHandedness().name() + "\"" + "}";
    }

    @Override
    public boolean use(Person person) {
        attack(person);
        return person.isHitableDestroyed();
    }

    public int attack(IHitable hitable)
    {
        return hitable.takeDamage(normalDamage, fireDamage, iceDamage);
    }
}


/**
 * Class Name: Weapon <br>
 * Class Purpose: creates Weapon class<br>
 *
 * <hr>
 * Date created: 10-13-2020
 * Date last modified: 10-20-2020
 * @author Flavio Sanguinetti
 */

/**
 * Method Name: Weapon <br>
 * Method Purpose: default constructor <br>
 *
 * <hr>
 * Date created: 10-14-2020 <br>
 * Date last modified: 10-14-2020 <br>
 */