// ---------------------------------------------------------------------------
// File name: Ranged.java
// Project name: Game Project
// ---------------------------------------------------------------------------
// Creator’s name and email: Roberto Hernandez, hernandezr@etsu.edu
// Course-Section: CSCI-1260-900
// Creation Date: 10-14-2020
// Date of Last Modification: 10-19-2020
// ---------------------------------------------------------------------------

/**
 * Class Name: Ranged <br>
 * Class Purpose: creates Ranged class<br>
 *
 * <hr>
 * Date created: 10-14-2020
 * Date last modified: 10-14-2020
 * @author Roberto Hernandez
 */
public class Ranged extends Weapon
{
    private double range;
    private int currentAmmo;
    private int maxAmmo;

    /**
     * Method Name: Ranged <br>
     * Method Purpose: parameterized constructor <br>
     *
     * <hr>
     * Date created: 10-14-2020 <br>
     * Date last modified: 10-19-2020 <br>
     *
     * @param name
     * @param dmg
     * @param ice
     * @param fire
     * @param range
     * @param maxAmmo
     */
    public Ranged(String name, int dmg, int ice, int fire, double range, int maxAmmo)
    {
        super(name, dmg, ice, fire, WeaponHandedness.VERSATILE);
        this.range = range;
        this.maxAmmo = maxAmmo;
    }

    /**
     * Method Name: getRange <br>
     * Method Purpose: return weapon's range <br>
     *
     * <hr>
     * Date created: 10-14-2020 <br>
     * Date last modified: 10-14-2020 <br>
     *
     * @return range
     */
    public double getRange()
    {
        return range;
    }

    /**
     * Method Name: setRange <br>
     * Method Purpose: set weapon's range <br>
     *
     * <hr>
     * Date created: 10-14-2020 <br>
     * Date last modified: 10-14-2020 <br>
     */
    public void setRange(double r)
    {
        this.range = range;
    }

    /**
     * Method Name: getAmmo <br>
     * Method Purpose: return weapon's current amount ammo <br>
     *
     * <hr>
     * Date created: 10-14-2020 <br>
     * Date last modified: 10-14-2020 <br>
     *
     * @return current amount of ammo
     */
    public int getAmmo()
    {
        return currentAmmo;
    }

    /**
     * Method Name: setAmmo <br>
     * Method Purpose: set weapon's range <br>
     *
     * <hr>
     * Date created: 10-19-2020 <br>
     * Date last modified: 10-19-2020 <br>
     */
    public void setAmmo(int a)
    {
        currentAmmo = a;
    }

    /**
     * Method Name: getMaxAmmo <br>
     * Method Purpose: return weapon's maximum amount of ammo <br>
     *
     * <hr>
     * Date created: 10-14-2020 <br>
     * Date last modified: 10-14-2020 <br>
     *
     * @return maximum amount of ammo
     */
    public int getMaxAmmo()
    {
        return maxAmmo;
    }

    /**
     * Method Name: addAmmo <br>
     * Method Purpose: set weapon's current amount of ammo <br>
     *
     * Notes: limits the amount of ammo added to the max ammo allowed
     * <hr>
     * Date created: 10-14-2020 <br>
     * Date last modified: 10-19-2020 <br>
     *
     * @return amount of ammo added
     */
    public int addAmmo(int a)
    {
        int temp = a + currentAmmo;
        currentAmmo = Math.min(temp, maxAmmo);
        return temp > maxAmmo ? (a-(temp - maxAmmo)):a;
    }

    /**
     * Method Name: toString <br>
     * Method Purpose: displays object <br>
     *
     * <hr>
     * Date created: 10-14-2020 <br>
     * Date last modified: 10-19-2020 <br>
     * @return object
     */
    @Override
    public String toString()
    {
        return "{name:\"" + getName()+ "\"" + ", price:" + getPrice() + ", durability: " + "\"" + getDurabilityStatus() + "\"" + "weaponHandedness:" + "\"" + getWeaponHandedness().name() + "\"" +
                ", range:" + range + ", currentAmmo:" + currentAmmo + ", maxAmmo:" + maxAmmo + "}";
    }
}