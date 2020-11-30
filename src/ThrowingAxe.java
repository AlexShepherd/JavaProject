// ---------------------------------------------------------------------------
// File name: ThrowingAxe.java
// Project name: Game Project
// ---------------------------------------------------------------------------
// Creator’s name and email: Roberto Hernandez, hernandezr@etsu.edu
// Course-Section: CSCI-1260-900
// Creation Date: 10-14-2020
// Date of Last Modification: 10-19-2020
// ---------------------------------------------------------------------------

/**
 * Class Name: ThrowingAxe <br>
 * Class Purpose: creates ThrowingAxe class<br>
 *
 * <hr>
 * Date created: 10-14-2020
 * Date last modified: 10-14-2020
 * @author Roberto Hernandez
 */
public class ThrowingAxe extends Ranged
{
    /**
     * Method Name: ThrowingAxe <br>
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
    public ThrowingAxe(String name, int dmg, int ice, int fire, double range, int maxAmmo)
    {
        super(name, dmg, ice, fire, range, maxAmmo);
        setPrice(125);
        setWeaponHand(WeaponHandedness.ONEHANDED);
        addAmmo(3);
    }

    public ThrowingAxe()
    {
        this(0, 0);
    }

    public ThrowingAxe(int ice, int fire) {
        this("Throwing Axe", 8, ice, fire, 30, 15);
    }
}

