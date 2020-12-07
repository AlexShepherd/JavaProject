// ---------------------------------------------------------------------------
// File name: BrassKnuckles.java
// Project name: Game Project
// ---------------------------------------------------------------------------
// Creator’s name and email: Arnold Reece, reecea@etsu.edu
// Course-Section: CSCI-1260-900
// Creation Date: 12-1-2020
// Date of Last Modification: 12-5-2020
// ---------------------------------------------------------------------------

/**
 * Method Name: Brass Knuckles <br>
 * Method Purpose: parameterized constructor <br>
 *
 * <hr>
 * Date created: 12-1-2020 <br>
 * Date last modified: 12-5-2020 <br>
 *
 */

public class BrassKnuckles extends Weapon {

    public BrassKnuckles(String name, int dmg, int ice, int fire, WeaponHandedness weaponHand)
    {
        super(name, dmg, ice, fire, weaponHand);
    }
    /**
     * Class Name: Brass Knuckles <br>
     * Class Purpose: creates Brass Knuckles class, extends Weapon class<br>
     *
     * <hr>
     * Date created: 12-1-2020
     * Date last modified: 12-5-2020
     * @author Arnold Reece
     */
    public BrassKnuckles() {
        this(0, 0);
    }

    public BrassKnuckles(int ice, int fire) {
        this("Brass Knuckles", 3, ice, fire, WeaponHandedness.ONEHANDED);
    }
}
