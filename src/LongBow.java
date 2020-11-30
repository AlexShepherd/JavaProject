// ---------------------------------------------------------------------------
// File name: LongBow.java
// Project name: Game Project
// ---------------------------------------------------------------------------
// Creator’s name and email: Roberto Hernandez & Flavio Sanguinetti, hernandezr@etsu.edu & sanguinetti@etsu.edu
// Course-Section: CSCI-1260-900
// Creation Date: 10-14-2020
// Date of Last Modification: 10-19-2020
// ---------------------------------------------------------------------------

/**
 * Class Name: LongBow <br>
 * Class Purpose: creates LongBow class<br>
 *
 * <hr>
 * Date created: 10-14-2020
 * Date last modified: 10-14-2020
 * @author Roberto Hernandez
 */
public class LongBow extends Ranged
{
    public LongBow(String name, int dmg, int ice, int fire, double range, int maxAmmo)
    {
        super(name, dmg, ice, fire, range, maxAmmo);
        setPrice(85);
        setWeaponHand(WeaponHandedness.TWOHANDED);
        addAmmo(getMaxAmmo()/2);
    }
    public LongBow()
    {
        this(0, 0);
    }
    public LongBow(int ice, int fire)
    {
        this("Long Bow", 5, ice, fire, 150, 100);
    }
}