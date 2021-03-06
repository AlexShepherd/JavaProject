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
    private boolean acidProtection;
    private boolean fireProtection;

    /**
     * Method Name: Armor <br>
     * Method Purpose: parameterized constructor <br>
     *
     * <hr>
     * Date created: 10-13-2020 <br>
     * Date last modified: 10-13-2020 <br>
     */
    public Armor(String name, int armorBonus, boolean acidProtection, boolean fireProtection)
    {
        super(name, 150 ,.8);
        this.armorBonus = armorBonus;
        this.acidProtection = acidProtection;
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
        String modifiedName = super.getName();
        if(acidProtection && fireProtection) {
            return modifiedName + " of Environmental Protection";
        }
        if(acidProtection) {
            return modifiedName + " of Ice Protection";
        }
        if(fireProtection) {
            return modifiedName + " of Fire Protection";
        }
        return modifiedName;
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
    public boolean hasAcidProtection()
    {
        return acidProtection;
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
    public void activateAcidProtection()
    {
        acidProtection = true;
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
    public void deactivateAcidProtection()
    {
        acidProtection = false;
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
                "acid:" + acidProtection + ", " +
                "fire:" + fireProtection + "}";
    }

    public boolean use(Actor actor)
    {
        actor.equip(this);
        return true;
    }
}
