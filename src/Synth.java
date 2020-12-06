// ---------------------------------------------------------------------------
// File name: Synth.java
// Project name: Game Project
// ---------------------------------------------------------------------------
// Creator’s name and email: Alex Shepherd
// Course-Section: CSCI-1260-900
// Creation Date: 10-13-2020
// Date of Last Modification: 11/15/20
// ---------------------------------------------------------------------------

public class Synth extends Actor
{
    public Synth(String name) {
        super(name);
        setConversation();
    }

    public Synth()
    {
        this("Synth");
    }

    private void setConversation()
    {
        thingsToSay.add("GREETINGS HUMAN! CARE FOR A COLD DRINK?");
        thingsToSay.add("HOW CAN I HELP YOU?");
        thingsToSay.add("PLEASE END MY SUFFERING");
    }
}
