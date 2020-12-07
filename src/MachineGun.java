// ---------------------------------------------------------------------------
// File name: MachineGun.java
// Project name: Game Project
// ---------------------------------------------------------------------------
// Creator’s name and email: Arnold Reece, reecea1@etsu.edu
// Course-Section: CSCI-1260-900
// Creation Date: 12-6-2020
// Date of Last Modification: 12-6-2020
// ---------------------------------------------------------------------------

/**
 * Class Name: Machine Gun<br>
 * Class Purpose: Machine Gun extends Ranged<br>
 *
 * <hr>
 * Date created: 12-6-2020
 * Date last modified: 12-6-2020
 */
public class MachineGun extends Ranged
{
    /**
     * Method Name: Machine Gun<br>
     * Method Purpose: super constructor<br>
     *
     * <hr>
     * Date created: 12-6-2020
     * Date last modified: 12-6-2020
     */
    public MachineGun(String name, int dmg, int acid, int fire, double range, int maxAmmo)
    {
        //basic constructor, sets the price to 200 with 2 ammo
        super(name, dmg, acid, fire, range, maxAmmo);
        setPrice(100);
        setWeaponHand(WeaponHandedness.TWOHANDED);
        addAmmo(getMaxAmmo());
    }

    /**
     * Method Name: Machine Gun<br>
     * Method Purpose: parameterized constructor<br>
     *
     * <hr>
     * Date created: 12-6-2020
     * Date last modified: 12-6-2020
     * @param acid
     * @param fire
     */
    public MachineGun(int acid, int fire)
    {
        //10 damage, 75 range, and 200 max ammo
        this("Machine Gun", 15, 0, 0, 75, 200);
    }
}

