// ---------------------------------------------------------------------------
// File name: Goblin.java
// Project name: Game Project
// ---------------------------------------------------------------------------
// Creator’s name and email: Alex Shepherd
// Course-Section: CSCI-1260-900
// Creation Date: 10-13-2020
// Date of Last Modification: 11/15/20
// ---------------------------------------------------------------------------

import java.util.ArrayList;

public class Goblin extends Person {

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
    public Goblin(String name) {
        super(name);
    }

    public String getName() {

        return "Goblin";
    }

    public void setGoblin(String name) {

        setName(name);
    }

    private void setName(String name) {
    }

    @Override
    public String toString() {
        return "Goblin";
    }
}
