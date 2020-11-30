// ---------------------------------------------------------------------------
// File name: Barrel.java
// Project name: Game Project
// ---------------------------------------------------------------------------
// Creator’s name and email: Roberto Hernandez, hernandezr@etsu.edu
// Course-Section: CSCI-1260-900
// Creation Date: 11-11-2020
// Date of Last Modification: 11-11-2020
// ---------------------------------------------------------------------------

/**
 * Class Name: Chest <br>
 * Class Purpose: Barrel class implementing IHitable<br>
 *
 * <hr>
 * Date created: 11-11-2020
 * Date last modified: 11-11-2020
 * @author Roberto Hernandez
 */
public class Barrel extends Chest implements IHitable
{
    private int maxHealth;
    private int currentHealth;
    /**
     * Method Name: Barrel <br>
     * Method Purpose: constructor<br>
     *
     * <hr>
     * Date created: 11-11-2020 <br>
     * Date last modified: 11-11-2020 <br>
     */
    public Barrel()
    {
        maxHealth = 50;
        currentHealth = 40;
    }

    /**
     * Method Name: getMaxHealth <br>
     * Method Purpose: implementing getMaxHealth method<br>
     *
     * <hr>
     * Date created: 11-11-2020 <br>
     * Date last modified: 11-11-2020 <br>
     * @return int
     */
    @Override
    public int getMaxHealth()
    {
        return maxHealth;
    }

    /**
     * Method Name: getCurrentHealth <br>
     * Method Purpose: implementing getCurrentHealth method<br>
     *
     * <hr>
     * Date created: 11-11-2020 <br>
     * Date last modified: 11-11-2020 <br>
     * @return int
     */
    @Override
    public int getCurrentHealth()
    {
        return currentHealth;
    }

    /**
     * Method Name: isHitableDestroyed <br>
     * Method Purpose: implementing isHitableDestroyed method<br>
     *
     * <hr>
     * Date created: 11-11-2020 <br>
     * Date last modified: 11-11-2020 <br>
     * @return boolean
     */
    @Override
    public boolean isHitableDestroyed()
    {
        return currentHealth <= 0;
    }

    /**
     * Method Name: takeDamage <br>
     * Method Purpose: implementing takeDamage method<br>
     *
     * <hr>
     * Date created: 11-11-2020 <br>
     * Date last modified: 11-11-2020 <br>
     * @return int
     */
    @Override
    public int takeDamage(int dmg, int fire, int ice)
    {
        int damage = dmg + fire + ice;
        currentHealth -= damage;
        return damage;
    }

    /**
     * Method Name: heal <br>
     * Method Purpose: implementing heal method<br>
     *
     * <hr>
     * Date created: 11-11-2020 <br>
     * Date last modified: 11-11-2020 <br>
     * @return int
     */
    @Override
    public int heal(int amt)
    {
        int temp = maxHealth - currentHealth;
        if(temp >= amt)
        {
            currentHealth += amt;
            return amt;
        }
        currentHealth = maxHealth;
        return temp;
    }
}
