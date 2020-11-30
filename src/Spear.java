// ---------------------------------------------------------------------------
// File name: Spear.java
// Project name: Game Project
// ---------------------------------------------------------------------------
// Creator’s name and email: Flavio Sanguinetti, sanguinetti@etsu.edu
// Course-Section: CSCI-1260-900
// Creation Date: 10-13-2020
// Date of Last Modification: 10-20-2020
// ---------------------------------------------------------------------------
/**
 * Class Name: Spear <br>
 * Class Purpose: creates Spear class, extends Weapon class<br>
 *
 * <hr>
 * Date created: 10-13-2020
 * Date last modified: 10-20-2020
 */

public class Spear extends Weapon
{
    public Spear(String name, int dmg, int ice, int fire, WeaponHandedness handedness)
    {
        super(name, dmg, ice, fire, handedness);
        setPrice(135);
    }
    public Spear()
    {
        this(0, 0);
    }
    public Spear(int ice, int fire) {
        this("Spear", 8, ice, fire, WeaponHandedness.TWOHANDED);
    }
}


