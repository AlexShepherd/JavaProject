// ---------------------------------------------------------------------------
// File name: Helmet.java
// Project name: Game Project
// ---------------------------------------------------------------------------
// Creator’s name and email: Roberto Hernandez, hernandezr@etsu.edu
// Course-Section: CSCI-1260-900
// Creation Date: 10-13-2020
// Date of Last Modification: 10-19-2020
// ---------------------------------------------------------------------------

public class Helmet extends Armor
{
    /**
     * Method Name: Helmet <br>
     * Method Purpose: default constructor <br>
     *
     * <hr>
     * Date created: 10-13-2020 <br>
     * Date last modified: 10-19-2020 <br>
     *
     */
    public Helmet() {
        super("Regular Helmet", 10, false, false);
    }
    /**
     * Method Name: Helmet <br>
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
    public Helmet(String name, int armorBonus, boolean iceProtection, boolean fireProtection)
    {
        super("Helmet", 1, iceProtection, fireProtection);
    }
}
