import java.awt.*;

/**
 * Class Name: Weapon Cache <br>
 * Class Purpose: WeaponCache class implementing IUsable and IInventory<br>
 *
 * <hr>
 * Date created: 11-30-2020
 * Date last modified: 12-02-2020
 * @author Flavio Sanguinetti
 */

public class WeaponCache extends Container implements IUsable, IInventory {
    EquipmentManager inventory;

    public WeaponCache() {
        inventory = new EquipmentManager();
    }

    @Override
    public boolean use(Actor actor)
    {
        return false;
    }

    public void pickup(Equipment equipment) {
        inventory.addEquipment(equipment);
    }

    /**
     * Class Name: transferAllEquipment <br>
     * Class Purpose: Takes a parameter and counts the equipment and makes the other size = to, runs a for-loop until the next parameter<br>
     *
     * <hr>
     * Date created: 11-30-2020
     * Date last modified: 12-02-2020
     * @author Flavio Sanguinetti
     */


    public void transferAllEquipmentFrom(IInventory other) {
        int otherSize = other.countEquipment();
        for (int i = 0; i < otherSize; i++) {
            pickup(other.getEquipment(i));
        }
        other.dropAllEquipment();

        /**
         * Class Name: countArmor <br>
         * Class Purpose: looks at inventory and is supposed to count/return armor count<br>
         *
         * <hr>
         * Date created: 11-30-2020
         * Date last modified: 12-02-2020
         * @author Flavio Sanguinetti
         */

    }
    public int countArmor() {
        return inventory.countArmor();
    }

    /**
     * Class Name: countWeapons <br>
     * Class Purpose: return weapon count<br>
     *
     * <hr>
     * Date created: 11-30-2020
     * Date last modified: 12-02-2020
     * @author Flavio Sanguinetti
     */

    public int countWeapons() {
        return inventory.countWeapons();
    }
    /**
     * Class Name: countConsumables<br>
     * Class Purpose: return consumables count<br>
     *
     * <hr>
     * Date created: 11-30-2020
     * Date last modified: 12-02-2020
     * @author Flavio Sanguinetti
     */
    public int countConsumables() {
        return inventory.countConsumables();
    }

    /**
     * Class Name: countEquipment <br>
     * Class Purpose: return equipment count<br>
     *
     * <hr>
     * Date created: 11-30-2020
     * Date last modified: 12-02-2020
     * @return countEquipment
     * @author Flavio Sanguinetti
     */

    public int countEquipment() {
        return countEquipment();
    }

    /**
     * Class Name: getEquipmentList <br>
     * Class Purpose: get EquipmentList<br>
     *
     * <hr>
     * Date created: 11-30-2020
     * Date last modified: 12-02-2020
     * @return EquipmentList
     * @author Flavio Sanguinetti
     */

    public String getEquipmentList() {
        return inventory.getEquipmentList();
    }

    public String getEquipmentInfo(int index) {
        return inventory.getEquipmentDetails(index);
    }

    public Equipment getEquipment(int index) {
        return inventory.getEquipment(index);
    }

    public void dropEquipment(int index) {
        inventory.removeEquipment(index);
    }

    public void dropAllEquipment() {
        inventory.clearAll();
    }
}