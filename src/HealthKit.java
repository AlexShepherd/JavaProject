// ---------------------------------------------------------------------------
// File name: Helmet.java
// Project name: Game Project
// ---------------------------------------------------------------------------
// Creator’s name and email: Roberto Hernandez, hernandezr@etsu.edu
// Course-Section: CSCI-1260-900
// Creation Date: 10-13-2020
// Date of Last Modification: 10-19-2020
// ---------------------------------------------------------------------------

public class HealthKit extends Consumable {

    public HealthKit(String name, int price, double durability) {
        super(name, price, durability);
    }

    public HealthKit() {
        this("Health Kit", 50, 1);
    }

    @Override
    public boolean use(Person person) {
        return (person.heal(5) > 0);
    }
}
