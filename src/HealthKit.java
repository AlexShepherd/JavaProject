// ---------------------------------------------------------------------------
// File name: Helmet.java
// Project name: Game Project
// ---------------------------------------------------------------------------
// Creator’s name and email: Roberto Hernandez, hernandezr@etsu.edu
// Course-Section: CSCI-1260-900
// Creation Date: 11-13-2020
// Date of Last Modification: 11-15-2020
// ---------------------------------------------------------------------------

/**
 * Class Name: HealthKit<br>
 * Class Purpose: HealthKit extends Consumable<br>
 *
 * <hr>
 * Date created: 11-13-2020
 * Date last modified: 11-15-2020
 */
public class HealthKit extends Consumable {

    /**
     * Method Name: HealthKit<br>
     * Method Purpose: parameterized constructor<br>
     *
     * <hr>
     * Date created: 11-13-2020
     * Date last modified: 11-15-2020
     */
    public HealthKit(String name, int price, double durability) {
        super(name, price, durability);
    }

    /**
     * Method Name: HealthKit<br>
     * Method Purpose: super constructor<br>
     *
     * <hr>
     * Date created: 11-13-2020
     * Date last modified: 11-15-2020
     */
    public HealthKit() {
        this("Health Kit", 50, 1);
    }

    /**
     * Method Name: use<br>
     * Method Purpose: uses HealthKit<br>
     *
     * <hr>
     * Date created: 11-13-2020
     * Date last modified: 11-15-2020
     * @param person
     * @return boolean
     */
    @Override
    public boolean use(Person person) {
        return (person.heal(5) > 0);
    }
}
