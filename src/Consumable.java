// ---------------------------------------------------------------------------
// File name: Consumable.java
// Project name: Game Project
// ---------------------------------------------------------------------------
// Creator’s name and email: Roberto Hernandez, hernandezr@etsu.edu
// Course-Section: CSCI-1260-900
// Creation Date: 11-4-2020
// Date of Last Modification: 11-4-2020
// ---------------------------------------------------------------------------

/**
 * Class Name: Consumable <br>
 * Class Purpose: abstract Consumable class extending Equipment and implementing IUsable<br>
 *
 * <hr>
 * Date created: 11-4-2020
 * Date last modified: 11-4-2020
 * @author Roberto Hernandez
 */
public abstract class Consumable extends Equipment implements IUsable
{
    public Consumable(String name, int price, double durability)
    {
        super(name, price, durability);
    }

    public void destroy()
    {
        setDurability(0);
    }
}
