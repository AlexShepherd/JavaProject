// ---------------------------------------------------------------------------
// File name: Weapon.java
// Project name: Game Project
// ---------------------------------------------------------------------------
// Creator’s name and email: Flavio Sanguinetti, sanguinetti@etsu.edu
// Course-Section: CSCI-1260-900
// Creation Date: 10-13-2020
// Date of Last Modification: 10-20-2020
// ---------------------------------------------------------------------------

/**
 * Class Name: Weapon <br>
 * Class Purpose: creates Weapon class<br>
 *
 * <hr>
 * Date created: 10-13-2020
 * Date last modified: 10-20-2020
 * @author Flavio Sanguinetti
 */
public class Weapon extends Equipment implements IUsable
{
    private int normalDamage;
    private int iceDamage;
    private int fireDamage;
    private WeaponHandedness weaponHand;

    /**
     * Method Name: Weapon <br>
     * Method Purpose: default constructor <br>
     *
     * <hr>
     * Date created: 10-14-2020 <br>
     * Date last modified: 10-14-2020 <br>
     */
    public Weapon()
    {

    }

    public Weapon(String name, int dmg, int ice, int fire, WeaponHandedness weaponHand)
    {
        this.name = name;
        this.normalDamage = dmg;
        this.iceDamage = ice;
        this.fireDamage = fire;
        this.weaponHand = weaponHand;
    }

    enum WeaponHandedness
    {
        OneHanded,TwoHanded,Versatile
    }
    public String getName()

    {
        if (fireDamage > 0)
        {
            return " " + getName();
        }
        if (iceDamage > 0)
        {
            return " " + getName();
        }
        if ((fireDamage > 0) && (iceDamage > 0))
        {
            return getName() + " ";
        }
        else if ((fireDamage + iceDamage > 6) && (fireDamage > 0) && (iceDamage > 0))
        {
            return getName() + " ";
        }
        else
            return super.getName();
    }


    public int getNormalDamage()
    {
        return normalDamage;
    }

    public int getFireDamage() {
        return fireDamage;
    }

    public int getIceDamage() {
        return iceDamage;
    }

    public WeaponHandedness getWeaponHand() {
        return weaponHand;
    }

    public void setNormalDamage(int normalDamage) {
        this.normalDamage = normalDamage;
    }

    public void setIceDamage(int iceDamage) {
        this.iceDamage = iceDamage;
    }

    public void setFireDamage(int fireDamage) {
        this.fireDamage = fireDamage;
    }

    public void setWeaponHandedness(WeaponHandedness wh) {
        this.weaponHand = wh;
    }

    @Override
    public String toString() {
        return "Weapon{" +
                "normalDamage=" + normalDamage +
                ", iceDamage=" + iceDamage +
                ", fireDamage=" + fireDamage +
                ", weaponHand=" + weaponHand +
                '}';
    }

    /**
     * Method Name: attack <br>
     * Method Purpose: attack with weapon<br>
     *
     * <hr>
     * Date created: 11-11-2020
     * Date last modified: 11-11-2020
     * @author Roberto Hernandez
     * @return int
     * @param hitable
     */
    public int attack(IHitable hitable)
    {
        return hitable.takeDamage(this.normalDamage, this.fireDamage, this.iceDamage);
    }

    /**
     * Method Name: use <br>
     * Method Purpose: implements use method<br>
     *
     * <hr>
     * Date created: 11-11-2020
     * Date last modified: 11-11-2020
     * @author Roberto Hernandez
     * @return boolean
     * @param person
     */
    @Override
    public boolean use(Person person)
    {
        this.attack(person);
        if(person.isHitableDestroyed())
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
