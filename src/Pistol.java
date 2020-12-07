// ---------------------------------------------------------------------------
// File name: Pistol.java
// Project name: Game Project
// ---------------------------------------------------------------------------
// Creator’s name and email: Roberto Hernandez, hernandezr@etsu.edu
// Course-Section: CSCI-1260-900
// Creation Date: 11-30-2020
// Date of Last Modification: 11-30-2020
// ---------------------------------------------------------------------------

/**
 * Class Name: Pistol<br>
 * Class Purpose: Pistol extends Ranged<br>
 *
 * <hr>
 * Date created: 11-30-2020
 * Date last modified: 11-30-2020
 */
public class Pistol extends Ranged
{
    /**
     * Method Name: Pistol<br>
     * Method Purpose: super constructor<br>
     *
     * <hr>
     * Date created: 11-30-2020
     * Date last modified: 11-30-2020
     */
    public Pistol(String name, int dmg, int acid, int fire, double range, int maxAmmo)
    {
        //basic constructor; sets the price at 50 with a clip size of 20
        super(name, dmg, acid, fire, range, maxAmmo);
        setPrice(50);
        setWeaponHand(WeaponHandedness.TWOHANDED);
        addAmmo(getMaxAmmo()/20);
    }

    /**
     * Method Name: Pistol<br>
     * Method Purpose: parameterized constructor<br>
     *
     * <hr>
     * Date created: 11-30-2020
     * Date last modified: 11-30-2020
     * @param acid
     * @param fire
     */
    public Pistol(int acid, int fire)
    {
        //sets the damage to 10 with a range of 50 and max ammo of 20
        this("Pistol", 10, acid, fire, 50, 20);
    }
}
