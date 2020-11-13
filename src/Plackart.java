// ---------------------------------------------------------------------------
// File name: Plackart.java
// Project name: Game Project
// ---------------------------------------------------------------------------
// Creator’s name and email: Roberto Hernandez, hernandezr@etsu.edu
// Course-Section: CSCI-1260-900
// Creation Date: 10-13-2020
// Date of Last Modification: 10-19-2020
// ---------------------------------------------------------------------------

public class Plackart extends Armor
{
    /**
 * Method Name: Plackart <br>
 * Method Purpose: default constructor <br>
 *
 * <hr>
 * Date created: 10-13-2020 <br>
 * Date last modified: 10-19-2020 <br>
 */
    public Plackart() {
        super("Average Plackart", 10, false, false);
    }

    /**
     * Method Name: Plackart <br>
     * Method Purpose: parameterized constructor <br>
     *
     * <hr>
     * Date created: 10-13-2020 <br>
     * Date last modified: 10-19-2020 <br>
     *
     * @param name
     * @param armorBonus
     * @param iceProtection
     * @param fireProtection
     */
    public Plackart(String name, int armorBonus, boolean iceProtection, boolean fireProtection)
    {
        super("Plackart", 4, iceProtection, true);
    }
}
