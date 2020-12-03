// ---------------------------------------------------------------------------
// File name: Weapon.java
// Project name: Game Project
// ---------------------------------------------------------------------------
// Creator’s name and email: Flavio Sanguinetti, sanguinetti@etsu.edu
// Course-Section: CSCI-1260-900
// Creation Date: 10-13-2020
// Date of Last Modification: 11-30-2020
// ---------------------------------------------------------------------------

/**
 * Class Name: Weapon<br>
 * Class Purpose: Weapon containing stats for damage dealing items<br>
 *
 * <hr>
 * Date created: 10-13-2020
 * Date last modified: 11-30-2020
 */
public class Weapon extends Equipment implements IUsable
{
    private int normalDamage;
    private int acidDamage;
    private int fireDamage;
    private WeaponHandedness weaponHand;

    /**
     * Method Name: Weapon<br>
     * Method Purpose: super constructor<br>
     *
     * <hr>
     * Date created: 10-13-2020
     * Date last modified: 11-30-2020
     * @param name
     * @param dmg
     * @param acid
     * @param fire
     * @param wp
     */
    public Weapon (String name, int dmg, int acid, int fire, WeaponHandedness wp)
    {
        super(name, 75, .6);
        normalDamage = dmg;
        acidDamage = acid;
        fireDamage = fire;
        weaponHand = wp;
    }

    /**
     * Method Name: getName<br>
     * Method Purpose: returns the name of a weapon<br>
     *
     * <hr>
     * Date created: 10-13-2020
     * Date last modified: 11-30-2020
     * @return name
     */
    public String getName()
    {
        if(acidDamage > 0 && fireDamage > 0) return super.getName() + " of Mighty Wrath";
        if(acidDamage > 0) return "Acidic" + super.getName();
        if(fireDamage > 0) return "Flaming " + super.getName();
        return super.getName();
    }

    /**
     * Method Name: getNormalDamage<br>
     * Method Purpose: returns the normal damage<br>
     *
     * <hr>
     * Date created: 10-13-2020
     * Date last modified: 11-30-2020
     * @return normal dmg
     */
    public int getNormalDamage() {
        return normalDamage;
    }

    /**
     * Method Name: getAcidDamage<br>
     * Method Purpose: returns the acid damage<br>
     *
     * <hr>
     * Date created: 10-13-2020
     * Date last modified: 11-30-2020
     * @return acid dmg
     */
    public int getAcidDamage() {
        return acidDamage;
    }

    /**
     * Method Name: getFireDamage<br>
     * Method Purpose: returns the fire damage<br>
     *
     * <hr>
     * Date created: 10-13-2020
     * Date last modified: 11-30-2020
     * @return fire dmg
     */
    public int getFireDamage() {
        return fireDamage;
    }

    /**
     * Method Name: getWeaponHandedness<br>
     * Method Purpose: returns wp<br>
     *
     * <hr>
     * Date created: 10-13-2020
     * Date last modified: 11-30-2020
     * @return WeaponHandedness
     */
    public WeaponHandedness getWeaponHandedness() {
        return weaponHand;
    }

    /**
     * Method Name: setWeaponHand<br>
     * Method Purpose: sets wp<br>
     *
     * <hr>
     * Date created: 10-13-2020
     * Date last modified: 11-30-2020
     * @param weaponHand
     */
    public void setWeaponHand(WeaponHandedness weaponHand) {
        this.weaponHand = weaponHand;
    }

    /**
     * Method Name: setAcidDamage<br>
     * Method Purpose: sets acid damage<br>
     *
     * <hr>
     * Date created: 10-13-2020
     * Date last modified: 11-30-2020
     * @param acidDamage
     */
    public void setAcidDamage(int acidDamage) {
        this.acidDamage = acidDamage;
    }

    /**
     * Method Name: setFireDamage<br>
     * Method Purpose: sets fire damage<br>
     *
     * <hr>
     * Date created: 10-13-2020
     * Date last modified: 11-30-2020
     * @param fireDamage
     */
    public void setFireDamage(int fireDamage) {
        this.fireDamage = fireDamage;
    }

    /**
     * Method Name: toString<br>
     * Method Purpose: returns weapon<br>
     *
     * <hr>
     * Date created: 10-13-2020
     * Date last modified: 11-30-2020
     * @return string
     */
    public String toString()
    {
        return "{name:\"" + getName()+ "\"" + ", price:" + getPrice() + ", durability: " + "\"" + getDurabilityStatus() + "\"" + ", ice:" + acidDamage + ", fire:" + fireDamage + "weaponHandedness:" + "\"" + getWeaponHandedness().name() + "\"" + "}";
    }

    /**
     * Method Name: use<br>
     * Method Purpose: implements use method<br>
     *
     * <hr>
     * Date created: 10-13-2020
     * Date last modified: 11-30-2020
     * @return bool
     * @param person
     */
    @Override
    public boolean use(Actor person) {
        attack(person);
        return person.isHitableDestroyed();
    }

    /**
     * Method Name: attack<br>
     * Method Purpose: implements attack method<br>
     *
     * <hr>
     * Date created: 10-13-2020
     * Date last modified: 11-30-2020
     * @return damage dealt
     * @param hitable
     */
    public int attack(IHitable hitable)
    {
        return hitable.takeDamage(normalDamage, fireDamage, acidDamage);
    }
}
