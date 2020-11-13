// ---------------------------------------------------------------------------
// File name: Armor.java
// Project name: Game Project
// ---------------------------------------------------------------------------
// Creator’s name and email: Roberto Hernandez, hernandezr@etsu.edu
// Course-Section: CSCI-1260-900
// Creation Date: 10-13-2020
// Date of Last Modification: 10-19-2020
// ---------------------------------------------------------------------------

/**
 * Class Name: Armor <br>
 * Class Purpose: creates Armor object, extends Equipment class<br>
 *
 * <hr>
 * Date created: 10-13-2020
 * Date last modified: 10-13-2020
 * @author Roberto Hernandez
 */
public class Armor extends Equipment
{
    private int armorBonus;
    private boolean iceProtection;
    private boolean fireProtection;

    /**
     * Method Name: Armor <br>
     * Method Purpose: parameterized constructor <br>
     *
     * <hr>
     * Date created: 10-13-2020 <br>
     * Date last modified: 10-13-2020 <br>
     */
    public Armor(String name, int armorBonus, boolean iceProtection, boolean fireProtection)
    {
        this.setName(name);
        this.armorBonus = armorBonus;
        this.iceProtection = iceProtection;
        this.fireProtection = fireProtection;
        this.setPrice(150);
        this.setDurability(0.8);
    }

    /**
     * Method Name: getName <br>
     * Method Purpose: return name of Armor <br>
     *
     * <hr>
     * Date created: 10-13-2020 <br>
     * Date last modified: 10-13-2020 <br>
     * @return name
     */
    @Override
    public String getName()
    {
        String armorName = super.getName();
        if(fireProtection && iceProtection)
        {
            armorName += " of Environmental Protection";
        }
        else if(fireProtection)
        {
            armorName += " of Fire Protection";
        }
        else if(iceProtection)
        {
            armorName += " of Ice Protection";
        }
        return armorName;
    }

    /**
     * Method Name: getArmorBonus <br>
     * Method Purpose: return armor bonus modifier <br>
     *
     * <hr>
     * Date created: 10-13-2020 <br>
     * Date last modified: 10-13-2020 <br>
     * @return armor bonus
     */
    public int getArmorBonus()
    {
        return armorBonus;
    }

    /**
     * Method Name: hasFireProtection <br>
     * Method Purpose: return boolean for fire protection <br>
     *
     * <hr>
     * Date created: 10-13-2020 <br>
     * Date last modified: 10-13-2020 <br>
     * @return fire protection boolean
     */
    public boolean hasFireProtection()
    {
        return fireProtection;
    }

    /**
     * Method Name: hasIceProtection <br>
     * Method Purpose: return boolean for ice protection <br>
     *
     * <hr>
     * Date created: 10-13-2020 <br>
     * Date last modified: 10-13-2020 <br>
     * @return ice protection boolean
     */
    public boolean hasIceProtection()
    {
        return iceProtection;
    }

    /**
     * Method Name: activateFireProtection <br>
     * Method Purpose: activates fire protection <br>
     *
     * <hr>
     * Date created: 10-13-2020 <br>
     * Date last modified: 10-13-2020 <br>
     */
    public void activateFireProtection()
    {
        fireProtection = true;
    }

    /**
     * Method Name: activateIceProtection <br>
     * Method Purpose: activates ice protection <br>
     *
     * <hr>
     * Date created: 10-13-2020 <br>
     * Date last modified: 10-13-2020 <br>
     */
    public void activateIceProtection()
    {
        iceProtection = true;
    }

    /**
     * Method Name: deactivateFireProtection <br>
     * Method Purpose: deactivates fire protection <br>
     *
     * <hr>
     * Date created: 10-13-2020 <br>
     * Date last modified: 10-13-2020 <br>
     */
    public void deactivateFireProtection()
    {
        fireProtection = false;
    }

    /**
     * Method Name: deactivateIceProtection <br>
     * Method Purpose: deactivates ice protection <br>
     *
     * <hr>
     * Date created: 10-13-2020 <br>
     * Date last modified: 10-13-2020 <br>
     */
    public void deactivateIceProtection()
    {
        iceProtection = false;
    }

    /**
     * Method Name: toString <br>
     * Method Purpose: displays object <br>
     *
     * <hr>
     * Date created: 10-13-2020 <br>
     * Date last modified: 10-13-2020 <br>
     * @return object
     */
    @Override
    public String toString()
    {
        return "{name:" + "\"" + getName() + "\"" + ", " +
                "price:" + getPrice() + ", " +
                "durability:" + "\"" + getDurabilityStatus() + "\"" + ", " +
                "ice:" + iceProtection + ", " +
                "fire:" + fireProtection + "}";
    }
}
