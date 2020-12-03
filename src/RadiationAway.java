// ---------------------------------------------------------------------------
// File name: RadiationAway.java
// Project name: Game Project
// ---------------------------------------------------------------------------
// Creator’s name and email: Roberto Hernandez, hernandezr@etsu.edu
// Course-Section: CSCI-1260-900
// Creation Date: 11-30-2020
// Date of Last Modification: 11-30-2020
// ---------------------------------------------------------------------------

/**
 * Class Name: RadiationAway<br>
 * Class Purpose: RadiationAway extends Consumable<br>
 *
 * <hr>
 * Date created: 11-30-2020
 * Date last modified: 11-30-2020
 */
public class RadiationAway extends Consumable
{

    /**
     * Method Name: RadiationAway<br>
     * Method Purpose: parameterized constructor<br>
     *
     * <hr>
     * Date created: 11-30-2020
     * Date last modified: 11-30-2020
     * @param name
     * @param price
     * @param durability
     */
    public RadiationAway(String name, int price, double durability)
    {
        super(name, price, durability);
    }

    /**
     * Method Name: RadiationAway<br>
     * Method Purpose: constructor<br>
     *
     * <hr>
     * Date created: 11-30-2020
     * Date last modified: 11-30-2020
     */
    public RadiationAway()
    {
        this("Radiation Away", 35, 1);
    }

    /**
     * Method Name: use<br>
     * Method Purpose: uses RadiationAway<br>
     *
     * <hr>
     * Date created: 11-30-2020
     * Date last modified: 11-30-2020
     * @param person
     * @return boolean
     */
    @Override
    public boolean use(Actor person)
    {
        //needs to be fixed, requires the acid stat
        return false;
    }
}
