// ---------------------------------------------------------------------------
// File name: Alien.java
// Project name: Game Project
// ---------------------------------------------------------------------------
// Creator’s name and email: Arnold Reece, reecea1@etsu.edu
// Course-Section: CSCI-1260-900
// Creation Date: 12-6-2020
// Date of Last Modification: 12-6-2020
// ---------------------------------------------------------------------------

public class Alien extends Actor
{
    public Alien(String name) {
        super(name);
        setConversation();
    }

    public Alien()
    {
        this("Alien");
    }

    private void setConversation()
    {
        thingsToSay.add("Hello Earthling?");
        thingsToSay.add("HOW MAY I ASSIST YOU?");
        thingsToSay.add("I MIGHT SEE YOU IN THE FUTURE");
    }
}