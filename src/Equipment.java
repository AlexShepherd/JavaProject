// ---------------------------------------------------------------------------
// File name: Equipment.java
// Project name: Game Project
// ---------------------------------------------------------------------------
// Creator’s name and email: Roberto Hernandez, hernandezr@etsu.edu
// Course-Section: CSCI-1260-900
// Creation Date: 10-13-2020
// Date of Last Modification: 10-19-2020
// ---------------------------------------------------------------------------

/**
 * Class Name: Equipment <br>
 * Class Purpose: creates Equipment object <br>
 *
 * <hr>
 * Date created: 10-13-2020
 * Date last modified: 10-13-2020
 * @author Roberto Hernandez
 */
public class Equipment
{
    String name;
    int price;
    double durability;

    /**
     * Method Name: Equipment <br>
     * Method Purpose: default constructor <br>
     *
     * <hr>
     * Date created: 10-13-2020 <br>
     * Date last modified: 10-19-2020 <br>
     */
    public Equipment()
    {
        name = "Equipment";
        price = 100;
        durability = 0.5;
    }

    /**
     * Method Name: Equipment <br>
     * Method Purpose: parameterized constructor <br>
     *
     * <hr>
     * Date created: 10-13-2020 <br>
     * Date last modified: 10-13-2020 <br>
     *
     * <hr>
     * @param name
     * @param price
     * @param durability
     */
    public Equipment(String name, int price, double durability)
    {
        this.name = name;
        this.price = price;
        this.durability = durability;
    }

    /**
     * Method Name: getName <br>
     * Method Purpose: return name of Equipment object <br>
     *
     * <hr>
     * Date created: 10-13-2020 <br>
     * Date last modified: 10-13-2020 <br>
     *
     * <hr>
     * @return name
     */
    public String getName()
    {
        return name;
    }

    /**
     * Method Name: getPrice <br>
     * Method Purpose: return price of Equipment object <br>
     *
     * <hr>
     * Date created: 10-13-2020 <br>
     * Date last modified: 10-13-2020 <br>
     *
     * <hr>
     * @return price
     */
    public int getPrice()
    {
        return price;
    }

    /**
     * Method Name: getDurability <br>
     * Method Purpose: return durability of Equipment object <br>
     *
     * <hr>
     * Date created: 10-13-2020 <br>
     * Date last modified: 10-13-2020 <br>
     *
     * <hr>
     * @return durability
     */
    public double getDurability()
    {
        return durability;
    }

    /**
     * Method Name: getDurabilityStatus <br>
     * Method Purpose: return String durability of Equipment object <br>
     *
     * <hr>
     * Date created: 10-13-2020 <br>
     * Date last modified: 10-19-2020 <br>
     *
     * <hr>
     * @return durability as string
     */
    public String getDurabilityStatus()
    {
        if(durability >= .9) return "Great Condition";
        if(durability > .75) return "Good Condition";
        if(durability > .5) return "Fair Condition";
        if(durability > .3) return "Poor Condition";
        return "Almost Broken";
    }

    /**
     * Method Name: setName <br>
     * Method Purpose: set name of Equipment object <br>
     *
     * <hr>
     * Date created: 10-13-2020 <br>
     * Date last modified: 10-13-2020 <br>
     *
     * <hr>
     * @param n input for name
     */
    public void setName(String n)
    {
        name = n;
    }

    /**
     * Method Name: setPrice <br>
     * Method Purpose: set price of Equipment object <br>
     *
     * <hr>
     * Date created: 10-13-2020 <br>
     * Date last modified: 10-13-2020 <br>
     *
     * <hr>
     * @param p input for price
     */
    public void setPrice(int p)
    {
        price = p;
    }

    /**
     * Method Name: setDurability <br>
     * Method Purpose: set durability of Equipment object <br>
     *
     * <hr>
     * Date created: 10-13-2020 <br>
     * Date last modified: 10-19-2020 <br>
     *
     * <hr>
     * @param d input for durability
     */
    public void setDurability(double d)
    {
        if(d > 0 && d <= 1)
        {
            durability = d;
        }
    }

    /**
     * Method Name: getSalePrice <br>
     * Method Purpose: return sale price of Equipment object <br>
     *
     * <hr>
     * Date created: 10-13-2020 <br>
     * Date last modified: 10-19-2020 <br>
     *
     * <hr>
     * @return sale price
     */
    public int getSalePrice()
    {
        int salePrice = 0;
        salePrice = (int)(price * (0.3 + durability));
        return salePrice;
    }

    /**
     * Method Name: adjustDurability <br>
     * Method Purpose: adjust durability of Equipment object <br>
     *
     * <hr>
     * Date created: 10-13-2020 <br>
     * Date last modified: 10-19-2020 <br>
     *
     * <hr>
     * @param d input for adjustment
     */
    public void adjustDurability(double d)
    {
        if(d >= -1 && d <= 1)
        {
            if(durability + d > 0 && durability + d <= 1)
            {
                durability += d;
            }
        }
    }
}
