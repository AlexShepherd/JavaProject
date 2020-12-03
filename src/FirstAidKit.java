// ---------------------------------------------------------------------------
// File name: FirstAidKit.java
// Project name: Game Project
// ---------------------------------------------------------------------------
// Creator’s name and email: Roberto Hernandez, hernandezr@etsu.edu
// Course-Section: CSCI-1260-900
// Creation Date: 11-13-2020
// Date of Last Modification: 11-30-2020
// ---------------------------------------------------------------------------

/**
 * Class Name: FirstAidKit<br>
 * Class Purpose: FirstAidKit extends Consumable<br>
 *
 * <hr>
 * Date created: 11-13-2020
 * Date last modified: 11-15-2020
 */
public class FirstAidKit extends Consumable {

    /**
     * Method Name: FirstAidKit<br>
     * Method Purpose: parameterized constructor<br>
     *
     * <hr>
     * Date created: 11-13-2020
     * Date last modified: 11-15-2020
     */
    public FirstAidKit(String name, int price, double durability) {
        super(name, price, durability);
    }

    /**
     * Method Name: FirstAidKit<br>
     * Method Purpose: constructor<br>
     *
     * <hr>
     * Date created: 11-13-2020
     * Date last modified: 11-15-2020
     */
    public FirstAidKit() {
        this("First Aid Kit", 50, 1);
    }

    /**
     * Method Name: use<br>
     * Method Purpose: uses FirstAidKit<br>
     *
     * <hr>
     * Date created: 11-13-2020
     * Date last modified: 11-15-2020
     * @param person
     * @return boolean
     */
    @Override
    public boolean use(Actor person) {
        return (person.heal(5) > 0);
    }
}
