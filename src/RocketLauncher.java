// ---------------------------------------------------------------------------
// File name: RocketLauncher.java
// Project name: Game Project
// ---------------------------------------------------------------------------
// Creator’s name and email: Roberto Hernandez, hernandezr@etsu.edu
// Course-Section: CSCI-1260-900
// Creation Date: 11-30-2020
// Date of Last Modification: 11-30-2020
// ---------------------------------------------------------------------------

/**
 * Class Name: RocketLauncher<br>
 * Class Purpose: RocketLauncher extends Ranged<br>
 *
 * <hr>
 * Date created: 11-30-2020
 * Date last modified: 11-30-2020
 */
public class RocketLauncher extends Ranged
{
    /**
     * Method Name: RocketLauncher<br>
     * Method Purpose: super constructor<br>
     *
     * <hr>
     * Date created: 11-30-2020
     * Date last modified: 11-30-2020
     */
    public RocketLauncher(String name, int dmg, int acid, int fire, double range, int maxAmmo)
    {
        //basic constructor, sets the price to 200 with 2 ammo
        super(name, dmg, acid, fire, range, maxAmmo);
        setPrice(200);
        setWeaponHand(WeaponHandedness.TWOHANDED);
        addAmmo(getMaxAmmo()/2);
    }

    /**
     * Method Name: RocketLauncher<br>
     * Method Purpose: parameterized constructor<br>
     *
     * <hr>
     * Date created: 11-30-2020
     * Date last modified: 11-30-2020
     * @param acid
     * @param fire
     */
    public RocketLauncher(int acid, int fire)
    {
        //sets the damage to 10 acid and 50 fire, 100 range, and 5 max ammo
        this("Rocket Launcher", 0, 10, 50, 100, 5);
    }
}
