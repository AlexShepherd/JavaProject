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
    public Spear(){
        super("Spear", 8, 0, 0, WeaponHandedness.TwoHanded);
    }
    public Spear(String name, int dmg, int ice, int fire, WeaponHandedness weaponHand)
    {
        super(name, dmg, ice, fire, weaponHand);
        setName("Spear");
        setNormalDamage(8);
        setPrice(135);
        setWeaponHandedness(WeaponHandedness.TwoHanded);
    }

}


