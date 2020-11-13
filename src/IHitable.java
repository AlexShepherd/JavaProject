// ---------------------------------------------------------------------------
// File name: IHitable.java
// Project name: Game Project
// ---------------------------------------------------------------------------
// Creator’s name and email: Roberto Hernandez, hernandezr@etsu.edu
// Course-Section: CSCI-1260-900
// Creation Date: 11-4-2020
// Date of Last Modification: 11-4-2020
// ---------------------------------------------------------------------------

/**
 * Class Name: IIHitable <br>
 * Class Purpose: interface for Person class and subclasses<br>
 *
 * <hr>
 * Date created: 11-4-2020
 * Date last modified: 11-4-2020
 * @author Roberto Hernandez
 */
public interface IHitable
{
    public int getMaxHealth();
    public int getCurrentHealth();
    public boolean isHitableDestroyed();
    public int takeDamage(int dmg, int fire, int ice);
    public int heal(int amt);
}
