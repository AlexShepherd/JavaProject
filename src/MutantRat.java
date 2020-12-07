/**
 * Class Name: MutantRat<br>
 * Class Purpose: MutantRat extends Actor<br>
 *
 * <hr>
 * Date created: 11-30-2020
 * Date last modified: 12-05-2020
 * @Author : Flavio Sanguinetti , sanguinetti@etsu.edu
 */

public class MutantRat extends Actor
{

    /**
     * Method Name: MutantRat<br>
     * Method Purpose: parametirized constructor<br>
     *
     * <hr>
     * Date created: 11-30-2020
     * Date last modified: 12-05-2020
     */

    public MutantRat(String name) {
        super(name);
        setConversation();
    }

    public MutantRat()
    {
        this("Mutant Rat");
    }

    /**
     * Method Name: Radiate <br>
     * Method Purpose: parameterized constructor<br>
     *
     * <hr>
     * Date created: 11-30-2020
     * Date last modified: 11-30-2020
     * @param AcidDamage
     */


    private int radiate(int AcidDamage) {
        //todo
        return 0;
    }

    /**
     * Method Name: setConversation <br>
     * Method Purpose: adds string values to the arraylist <br>
     *
     * <hr>
     * Date created: 11-30-2020
     * Date last modified: 11-30-2020
     */


    private void setConversation()
    {
        thingsToSay.add("SQUEAK SQUEAK");
        thingsToSay.add("PSSSSSSST");
    }
}
