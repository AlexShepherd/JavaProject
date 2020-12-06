// ---------------------------------------------------------------------------
// File name: Synth.java
// Project name: Game Project
// ---------------------------------------------------------------------------
// Creator’s name and email: Alex Shepherd
// Course-Section: CSCI-1260-900
// Creation Date: 10-13-2020
// Date of Last Modification: 11/15/20
// ---------------------------------------------------------------------------

public class MutantRat extends Actor
{
    public MutantRat(String name) {
        super(name);
        setConversation();
    }

    public MutantRat()
    {
        this("Mutant Rat");
    }

    private int radiate(int AcidDamage) {
        return 20;
    }
    private void setConversation()
    {
        thingsToSay.add("SQUEAK SQUEAK");
        thingsToSay.add("PSSSSSSST");
    }
}
