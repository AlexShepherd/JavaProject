// ---------------------------------------------------------------------------
// File name: Sword.java
// Project name: Game Project
// ---------------------------------------------------------------------------
// Creator’s name and email: Alex Shepherd, shepherdap@etsu.edu
// Course-Section: CSCI-1260-900
// Creation Date: 10-13-2020
// Date of Last Modification: 11-30-2020
// ---------------------------------------------------------------------------

/**
 * Method Name: Sword <br>
 * Method Purpose: parameterized constructor <br>
 *
 * <hr>
 * Date created: 10-13-2020 <br>
 * Date last modified: 10-13-2020 <br>
 *
 */

public class Sword extends Weapon {

    public Sword(String name, int dmg, int ice, int fire, WeaponHandedness weaponHand)
    {
        super(name, dmg, ice, fire, weaponHand);
    }
/**
 * Class Name: Sword <br>
 * Class Purpose: creates Sword class, extends Weapon class<br>
 *
 * <hr>
 * Date created: 10-13-2020
 * Date last modified: 11-30-2020
 * @author Alex Shepherd
 */
    public Sword() {
        this(0, 0);
    }

    public Sword(int ice, int fire) {
        this("Sword", 5, ice, fire, WeaponHandedness.VERSATILE);
    }
}
