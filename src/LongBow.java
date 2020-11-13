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
    public LongBow() {
        super("Regular Bow", 5, 0, 0, 3, 25);
    }
    /**
     * Method Name: LongBow <br>
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
    public LongBow(String name, int dmg, int ice, int fire, double range, int maxAmmo)
    {
        super("Long Box", 5, ice, fire, 150, 100);
        this.setPrice(85);
        this.setWeaponHandedness(WeaponHandedness.OneHanded);
        this.setAmmo(getMaxAmmo()/2);
    }
}
