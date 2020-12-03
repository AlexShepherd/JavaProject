// ---------------------------------------------------------------------------
// File name: Goblin.java
// Project name: Game Project
// ---------------------------------------------------------------------------
// Creator’s name and email: Alex Shepherd
// Course-Section: CSCI-1260-900
// Creation Date: 10-13-2020
// Date of Last Modification: 11/15/20
// ---------------------------------------------------------------------------

public class Goblin extends Actor
{
    public Goblin(String name) {
        super(name);
        setConversation();
    }

    public Goblin()
    {
        this("Villager");
    }

    private void setConversation()
    {
        thingsToSay.add("Hello, you look like you've been through tough times");
        thingsToSay.add("I don't like you very much");
        thingsToSay.add("Go away, leave my treasure be");
    }
}
