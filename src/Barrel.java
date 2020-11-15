// ---------------------------------------------------------------------------
// File name: Barrel.java
// Project name: Game Project
// ---------------------------------------------------------------------------
// Creator’s name and email: Roberto Hernandez, hernandezr@etsu.edu
// Course-Section: CSCI-1260-900
// Creation Date: 11-11-2020
// Date of Last Modification: 11-11-2020
// ---------------------------------------------------------------------------

import java.util.Random;

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
    private int maxHealth = 50;
    private int currentHealth = 40;
    private EquipmentManager inventory = new EquipmentManager();

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
        Random rand = new Random();
        inventory.makeRandomConsumable();
        inventory.makeRandomArmor();
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
        if(getCurrentHealth() <= 0)
        {
            return true;
        }
        else
        {
            return false;
        }
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
        //might need fixing
        return currentHealth - (dmg+fire+ice);
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
        int healthAdded = 0;
        currentHealth += amt;
        if(currentHealth > maxHealth)
        {
            int temp = currentHealth - maxHealth;
            healthAdded = amt - temp;
            currentHealth = maxHealth;
        }
        else
        {
            healthAdded = amt;
        }
        return healthAdded;
    }
}
