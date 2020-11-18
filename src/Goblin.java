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
    public Goblin() {
        super("Goblin");
        {
            ArrayList<String> goblinSayings = new ArrayList<String>();
            goblinSayings.add("STOP!");
            goblinSayings.add("GIVE ME YOUR GEAR!");
            goblinSayings.add("GIVE ME THE GEAR OR DIE!");

            setThingsToSay(goblinSayings);
        }
    }

    /**
     * Method Name: Goblin<br>
     * Method Purpose: parameterized constructor<br>
     *
     * <hr>
     * Date created: 11-13-2020
     * Date last modified: 11-15-2020
     */
    public Goblin(String name) {
        super(name);
    }
}
