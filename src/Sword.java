// ---------------------------------------------------------------------------
// File name: Sword.java
// Project name: Game Project
// ---------------------------------------------------------------------------
// Creator’s name and email: Alex Shepherd, shepherdap@etsu.edu
// Course-Section: CSCI-1260-900
// Creation Date: 10-13-2020
// Date of Last Modification: 10-13-2020
// ---------------------------------------------------------------------------
/**
 * Class Name: Sword <br>
 * Class Purpose: creates Sword class, extends Weapon class<br>
 *
 * <hr>
 * Date created: 10-13-2020
 * Date last modified: 10-13-2020
 * @author Alex Shepherd
 */
public class Sword extends Weapon {
    public Sword(){
        super("Sword", 5, 0, 0, WeaponHandedness.Versatile);
    }

    /**
     * Method Name: Sword <br>
     * Method Purpose: parameterized constructor <br>
     *
     * <hr>
     * Date created: 10-13-2020 <br>
     * Date last modified: 10-13-2020 <br>
     *
     * @param name
     * @param dmg
     * @param ice
     * @param fire
     * @param weaponHand
     */
    public Sword(String name, int dmg, int ice, int fire, WeaponHandedness weaponHand)
    {
        super(name, dmg, ice, fire, weaponHand);

        setName("Sword");
        setNormalDamage(5);
        setWeaponHandedness(WeaponHandedness.Versatile);
    }
}

