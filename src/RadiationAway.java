// ---------------------------------------------------------------------------
// File name: RadiationAway.java
// Project name: Game Project
// ---------------------------------------------------------------------------
// Creator’s name and email: Roberto Hernandez, hernandezr@etsu.edu
// Course-Section: CSCI-1260-900
// Creation Date: 11-30-2020
// Date of Last Modification: 12-5-2020
// ---------------------------------------------------------------------------

/**
 * Class Name: RadiationAway<br>
 * Class Purpose: RadiationAway extends Consumable<br>
 *
 * <hr>
 * Date created: 11-30-2020
 * Date last modified: 12-5-2020
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
        //basic constructor with no values
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
        //constructor setting price to 35 and durability to 1 for single use
        this("Radiation Away", 35, 1);
    }

    /**
     * Method Name: use<br>
     * Method Purpose: uses RadiationAway<br>
     *
     * <hr>
     * Date created: 11-30-2020
     * Date last modified: 12-5-2020
     * @param actor
     * @return boolean
     */
    @Override
    public boolean use(Actor actor)
    {
        //this heals an actor's radiation status by 10 if their radiation is greater than 0 using the radAway method
        //from actor
        return (actor.radAway(10) > 0);
    }
}
