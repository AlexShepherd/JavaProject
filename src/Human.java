// ---------------------------------------------------------------------------
// File name: human.java
// Project name: Game Project
// ---------------------------------------------------------------------------
// Creator’s name and email: Alex Shepherd, shepherdap@etsu.edu
// Course-Section: CSCI-1260-900
// Creation Date: 10-13-2020
// Date of Last Modification: 11/15/2020
// ---------------------------------------------------------------------------

import java.util.ArrayList;

public class Human extends Person {

    public Human() {

        super("Villager");
        {
            ArrayList<String> humanSayings = new ArrayList<String>();
            humanSayings.add("Hello!");
            humanSayings.add("Can I help you?");
            humanSayings.add("You look strong!");
            setThingsToSay(humanSayings);
        }
    }

    public Human(String name) {
        super(name);
    }
}
