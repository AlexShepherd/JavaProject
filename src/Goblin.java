// ---------------------------------------------------------------------------
// File name: Goblin.java
// Project name: Game Project
// ---------------------------------------------------------------------------
// Creator’s name and email: Alex Shepherd
// Course-Section: CSCI-1260-900
// Creation Date: 11-13-2020
// Date of Last Modification: 11-15-2020
// ---------------------------------------------------------------------------

import java.util.ArrayList;

/**
 * Class Name: Goblin<br>
 * Class Purpose: Goblin object, extends Person<br>
 *
 * <hr>
 * Date created: 11-13-2020
 * Date last modified: 11-15-2020
 * @author Alex Shepherd
 */
public class Goblin extends Person {

    /**
     * Method Name: Goblin<br>
     * Method Purpose: constructor<br>
     *
     * <hr>
     * Date created: 11-13-2020
     * Date last modified: 11-15-2020
     */
    public Goblin(String name) {
        super(name);
        setConversation();
    }

    public Goblin() {
        this("Goblin Villager");
    }

    private void setConversation() {
        thingsToSay.add("Hello, you look like you've been through tough times");
        thingsToSay.add("I don't like you very much");
        thingsToSay.add("Go away, leave my treasure be");
    }
}
