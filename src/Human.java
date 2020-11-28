// ---------------------------------------------------------------------------
// File name: Human.java
// Project name: Game Project
// ---------------------------------------------------------------------------
// Creator’s name and email: Alex Shepherd, shepherdap@etsu.edu
// Course-Section: CSCI-1260-900
// Creation Date: 10-13-2020
// Date of Last Modification: 11-15-2020
// ---------------------------------------------------------------------------

import java.util.ArrayList;

/**
 * Class Name: Human<br>
 * Class Purpose: Human object, extends Person<br>
 *
 * <hr>
 * Date created: 11-13-2020
 * Date last modified: 11-15-2020
 * @author Alex Shepherd
 */
public class Human extends Person {

    /**
     * Method Name: World <br>
     * Method Purpose: constructor<br>
     *
     * <hr>
     * Date created: 11-13-2020
     * Date last modified: 11-15-2020
     */
    public Human() {

        super("Villager");
        {
            thingsToSay.add("Hello!");
            thingsToSay.add("Can I help you?");
            thingsToSay.add("You look strong!");
        }
    }

    /**
     * Method Name: Human<br>
     * Method Purpose: parameterized constructor<br>
     *
     * <hr>
     * Date created: 11-13-2020
     * Date last modified: 11-15-2020
     */
    public Human(String name) {
        super(name);
    }
}
